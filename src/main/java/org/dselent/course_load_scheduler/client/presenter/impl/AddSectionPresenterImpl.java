package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.ArrayList;
import java.util.List;

import org.dselent.course_load_scheduler.client.action.AddSectionAction;
import org.dselent.course_load_scheduler.client.action.DeleteSectionAction;
import org.dselent.course_load_scheduler.client.action.GoToEditInstanceAction;
import org.dselent.course_load_scheduler.client.errorstring.InvalidEmptyStrings;
import org.dselent.course_load_scheduler.client.event.AddSectionEvent;
import org.dselent.course_load_scheduler.client.event.DeleteSectionEvent;
import org.dselent.course_load_scheduler.client.event.GoToEditInstanceEvent;
import org.dselent.course_load_scheduler.client.event.GoToEditSectionEvent;
import org.dselent.course_load_scheduler.client.exceptions.EmptyParameterException;
import org.dselent.course_load_scheduler.client.presenter.AddSectionPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AddSectionView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AddSectionPresenterImpl extends BasePresenterImpl implements AddSectionPresenter{

	private IndexPresenter parentPresenter;
	private AddSectionView view;
	private boolean saveClickInProgress;
	private boolean backClickInProgress;
	private boolean deleteClickInProgress;
	private HasWidgets container = parentPresenter.getView().getMiddlePanel();
	@Inject
	public AddSectionPresenterImpl(IndexPresenter parentPresenter, AddSectionView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		saveClickInProgress = false;
		backClickInProgress = false;
		deleteClickInProgress = false;
	}

	@Override
	public void init()
	{
		bind();
	}

	@Override
	public void bind()
	{
		HandlerRegistration registration;

		registration = eventBus.addHandler(GoToEditSectionEvent.TYPE, this);
		eventBusRegistration.put(GoToEditSectionEvent.TYPE, registration);
	}

	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public AddSectionView getView()
	{
		return view;
	}

	@Override
	public IndexPresenter getParentPresenter()
	{
		return parentPresenter;
	}

	@Override
	public void setParentPresenter(IndexPresenter parentPresenter)
	{
		this.parentPresenter = parentPresenter;
	}

	@Override
	public void addSection() {
		if (!saveClickInProgress) {
			saveClickInProgress = false;
			view.getSaveButton().setEnabled(false);

			Integer expectedPop = view.getExpectedPopField().getValue();
			String lectureType = view.getTypeField().getText();
			String days = "";
			Integer timeStart = (view.getStartHoursField().getValue()*100) + view.getStartMinutesField().getValue();
			Integer timeEnd = (view.getEndHoursField().getValue()*100) + view.getEndMinutesField().getValue();

			//Check if null
			List<String> invalidReasonList = new ArrayList<>();
			boolean emptyParam = false;

			try {
				validateExpectedPop(expectedPop);
			} catch(EmptyParameterException e){
				invalidReasonList.add(InvalidEmptyStrings.NULL_EXPECTED_POPULATION);
				emptyParam = true;
			}

			try {
				validateLectureType(lectureType);
			} catch(EmptyParameterException e){
				invalidReasonList.add(InvalidEmptyStrings.NULL_TYPE);
				emptyParam = true;
			}
			try {
				validateDays(days);
			} catch(EmptyParameterException e){
				invalidReasonList.add(InvalidEmptyStrings.NULL_DAYS);
				emptyParam = true;
			}

			try {
				validateTimeStart(timeStart);
			} catch(EmptyParameterException e){
				invalidReasonList.add(InvalidEmptyStrings.NULL_TIME_START);
				emptyParam = true;
			}

			try {
				validateTimeEnd(timeEnd);
			} catch(EmptyParameterException e){
				invalidReasonList.add(InvalidEmptyStrings.NULL_TIME_END);
				emptyParam = true;
			}


			if (view.getMondayCheck().getValue()) {
				days = days + "m";
			}
			if (view.getTuesdayCheck().getValue()) {
				days = days + "t";
			}
			if (view.getWednesdayCheck().getValue()) {
				days = days + "w";
			}
			if (view.getThursdayCheck().getValue()) {
				days = days + "r";
			}
			if (view.getFridayCheck().getValue()) {
				days = days + "f";
			}

			if(!emptyParam) {
				sendAddSection (expectedPop, lectureType, days, timeStart, timeEnd);
			}

		}

	}

	private void sendAddSection (Integer expectedPop, String lectureType, String days, Integer timeStart, Integer timeEnd) {
		AddSectionAction asa = new AddSectionAction(expectedPop, lectureType, days, timeStart, timeEnd);
		AddSectionEvent ase = new AddSectionEvent(asa, container);
		eventBus.fireEvent(ase);
	}

	private void validateExpectedPop(Integer ep) throws EmptyParameterException
	{
		checkEmptyIntegerParameters(ep);
	}

	private void validateLectureType(String lt) throws EmptyParameterException
	{
		checkEmptyStringParameters(lt);
	}

	private void validateDays(String d) throws EmptyParameterException
	{
		checkEmptyStringParameters(d);
	}

	private void validateTimeStart(Integer ts) throws EmptyParameterException
	{
		checkEmptyIntegerParameters(ts);
	}

	private void validateTimeEnd(Integer te) throws EmptyParameterException
	{
		checkEmptyIntegerParameters(te);
	}

	private void checkEmptyIntegerParameters(Integer s) throws EmptyParameterException
	{
		if(s == null) {
			throw new EmptyParameterException();
		}
	}

	private void checkEmptyStringParameters(String s) throws EmptyParameterException
	{
		if(s == null || s.equals("")) {
			throw new EmptyParameterException();
		}
	}


	public void deleteSection() {
		if (!deleteClickInProgress) {
			deleteClickInProgress = false;
			view.getSaveButton().setEnabled(false);

			String courseNum = view.getCourseNumberField().getValue();
			Integer instanceNum = view.getInstanceNumberField().getValue();
			Integer sectionNum = view.getSectionNumberField().getValue();

			DeleteSectionAction dsa = new DeleteSectionAction(courseNum, instanceNum, sectionNum);
			DeleteSectionEvent dse = new DeleteSectionEvent(dsa);
			eventBus.fireEvent(dse);
		}
	}
	
	@Override
	//Bascially the Back Button
	public void goToInstanceEdit() {

		if(!backClickInProgress) {
			saveClickInProgress = false;
			view.getSaveButton().setEnabled(false);

			Integer instanceNum = view.getInstanceNumberField().getValue();

			HasWidgets container = parentPresenter.getView().getViewRootPanel();
			GoToEditInstanceAction eia = new GoToEditInstanceAction(instanceNum);
			GoToEditInstanceEvent eie = new GoToEditInstanceEvent(eia, container);
			eventBus.fireEvent(eie);
		}
	}
	
	//
	public void onGoToAddSection(GoToEditSectionEvent evt) {
		this.go(evt.getContainer());
	}
}