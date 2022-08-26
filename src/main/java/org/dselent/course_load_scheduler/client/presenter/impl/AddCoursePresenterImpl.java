package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.action.AddCourseAction;
import org.dselent.course_load_scheduler.client.action.AddInstanceAction;
import org.dselent.course_load_scheduler.client.action.DeleteCourseAction;
import org.dselent.course_load_scheduler.client.action.EditCourseAction;
import org.dselent.course_load_scheduler.client.action.GoToEditInstanceAction;
import org.dselent.course_load_scheduler.client.action.InvalidCourseAction;
import org.dselent.course_load_scheduler.client.action.InvalidCourseIdAction;
import org.dselent.course_load_scheduler.client.errorstring.InvalidCourseStrings;
import org.dselent.course_load_scheduler.client.event.AddCourseEvent;
import org.dselent.course_load_scheduler.client.event.AddInstanceEvent;
import org.dselent.course_load_scheduler.client.event.DeleteCourseEvent;
import org.dselent.course_load_scheduler.client.event.EditCourseEvent;
import org.dselent.course_load_scheduler.client.event.GoToEditInstanceEvent;
import org.dselent.course_load_scheduler.client.event.InvalidCourseEvent;
import org.dselent.course_load_scheduler.client.event.InvalidCourseIdEvent;
import org.dselent.course_load_scheduler.client.exceptions.EmptyStringException;
import org.dselent.course_load_scheduler.client.presenter.AddCoursePresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AddCourseView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AddCoursePresenterImpl extends BasePresenterImpl implements AddCoursePresenter{

	private IndexPresenter parentPresenter;
	private AddCourseView view;
	private HasWidgets container = parentPresenter.getView().getMiddlePanel();
	
	@Inject
	public AddCoursePresenterImpl(IndexPresenter parentPresenter, AddCourseView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
	}
	
	@Override
	public void init()
	{
		bind();
	}
	//AddCourseEvent, CreateInstanceEvent, DeleteCourseEvent, EditCourseEvent, GoToEditInstanceEvent, InvalidCourseEvent, InvalidCourseIdEvent
	@Override
	public void bind()
	{
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(AddCourseEvent.TYPE, this);
		eventBusRegistration.put(AddCourseEvent.TYPE, registration);
		
		registration = eventBus.addHandler(EditCourseEvent.TYPE, this);
		eventBusRegistration.put(EditCourseEvent.TYPE, registration);
		
		registration = eventBus.addHandler(InvalidCourseEvent.TYPE, this);
		eventBusRegistration.put(InvalidCourseEvent.TYPE, registration);
		
		registration = eventBus.addHandler(InvalidCourseIdEvent.TYPE, this);
		eventBusRegistration.put(InvalidCourseIdEvent.TYPE, registration);
	}
		
	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public AddCourseView getView()
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
	public void saveChanges() {
		String name = view.getCourseNameField().getValue();
		String number = view.getCourseNumberField().getValue();
		String type = view.getTypeField().getValue();
		Integer level = view.getLevelList().getSelectedIndex();
		String department = view.getDepartmentField().getValue();
		String description = view.getCourseDescField().getValue();
		Integer courseId = parentPresenter.getGlobalData().getCourseId();
		
		Boolean validNumber = true;
		Boolean validName = true;
		Boolean validType = true;
		
		ArrayList<String> reasonList = new ArrayList<String>();
		
		try {
			validateNumber(number);
		}
		catch(EmptyStringException e) {
			reasonList.add(InvalidCourseStrings.NULL_COURSE_NUMBER);
			validNumber = false;
		}
		
		try {
			validateName(name);
		}
		catch(EmptyStringException e) {
			reasonList.add(InvalidCourseStrings.NULL_COURSE_NAME);
			validName = false;
		}
		
		try {
			validateType(type);
		}
		catch(EmptyStringException e) {
			reasonList.add(InvalidCourseStrings.NULL_COURSE_TYPE);
			validType = false;
		}
		
		if (validNumber && validName && validType) {
			HasWidgets container = parentPresenter.getView().getMiddlePanel();
			EditCourseAction eca = new EditCourseAction(name, number, type, level, department, description, courseId);
			EditCourseEvent ece = new EditCourseEvent(eca, container);
			eventBus.fireEvent(ece);
		}
		
		else {
			InvalidCourseAction ica = new InvalidCourseAction(reasonList);
			InvalidCourseEvent ice = new InvalidCourseEvent(ica);
			eventBus.fireEvent(ice);
		}
		
		if (courseId == 0 && (validNumber && validName && validType)) {
			HasWidgets container = parentPresenter.getView().getMiddlePanel();
			AddCourseAction aca = new AddCourseAction(name, number, type, level, department, description);
			AddCourseEvent ace = new AddCourseEvent(aca, container);
			eventBus.fireEvent(ace);
		}
	}
	
	public void deleteCourse() {
		Integer courseId = view.getCourseIdField().getValue();
		ArrayList<String> reasonList = new ArrayList<String>();
		if (courseId == 0) {
			InvalidCourseIdAction icia = new InvalidCourseIdAction(reasonList);
			InvalidCourseIdEvent icie = new InvalidCourseIdEvent(icia);
			eventBus.fireEvent(icie);
		} else {
			HasWidgets container = parentPresenter.getView().getMiddlePanel();
			DeleteCourseAction dca = new DeleteCourseAction(courseId);
			DeleteCourseEvent dce = new DeleteCourseEvent(dca, container);
			eventBus.fireEvent(dce);
		}

	}
	
	public void createInstance() {
		String courseNumber = view.getCourseNumberField().getValue();
		
		AddInstanceAction cia = new AddInstanceAction(courseNumber);
		AddInstanceEvent cie = new AddInstanceEvent(cia, container); // TODO: Very help please confused
		eventBus.fireEvent(cie);
	}
	
	public void editInstance() {
		HasWidgets container = parentPresenter.getView().getMiddlePanel();
		Integer instance = view.getInstanceList().getSelectedIndex();
		GoToEditInstanceAction eia = new GoToEditInstanceAction(instance);
		GoToEditInstanceEvent eie = new GoToEditInstanceEvent(eia, container);
		eventBus.fireEvent(eie);
	}
	
	public void validateNumber(String courseNum) throws EmptyStringException {
		checkEmptyString(courseNum);
	}
	
	public void validateName(String courseName) throws EmptyStringException {
		checkEmptyString(courseName);
	}
	
	public void validateType(String type) throws EmptyStringException {
		checkEmptyString(type);
	}
	
	private void checkEmptyString(String string) throws EmptyStringException
	{
		if(string == null || string.equals(""))
		{
			throw new EmptyStringException();
		}
	}
}
