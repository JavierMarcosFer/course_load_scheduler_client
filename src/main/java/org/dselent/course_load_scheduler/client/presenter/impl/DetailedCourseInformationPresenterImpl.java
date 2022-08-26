package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.GoToClassSearchAction;
import org.dselent.course_load_scheduler.client.action.AddToCartAction;
import org.dselent.course_load_scheduler.client.event.GoToClassSearchEvent;
import org.dselent.course_load_scheduler.client.event.GoToDetailedCourseInformationEvent;
//import org.dselent.course_load_scheduler.client.action.DetailedCourseInformationAction;
//import org.dselent.course_load_scheduler.client.event.DetailedCourseInformationEvent;
import org.dselent.course_load_scheduler.client.event.AddToCartEvent;
import org.dselent.course_load_scheduler.client.presenter.DetailedCourseInformationPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.DetailedCourseInformationView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class DetailedCourseInformationPresenterImpl extends BasePresenterImpl implements DetailedCourseInformationPresenter{

	private IndexPresenter parentPresenter;
	private DetailedCourseInformationView view;
	private boolean submitClickInProgress;

	@Inject
	public DetailedCourseInformationPresenterImpl(IndexPresenter parentPresenter, DetailedCourseInformationView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		submitClickInProgress = false;
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
		
		registration = eventBus.addHandler(GoToDetailedCourseInformationEvent.TYPE, this);
		eventBusRegistration.put(GoToDetailedCourseInformationEvent.TYPE, registration);
	}

	
	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public DetailedCourseInformationView getView()
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
	public void submitToCart() {
		if(!submitClickInProgress) {
			submitClickInProgress = true;
			view.getSubmitToCartButton().setEnabled(false);
			
			String courseName = view.getCourseName().getText();
			
			HasWidgets container = parentPresenter.getView().getMiddlePanel();
			AddToCartAction sca = new AddToCartAction(courseName);
			AddToCartEvent sce = new AddToCartEvent(sca, container);
			eventBus.fireEvent(sce);
		}
	}
	
	@Override
	public void returnToSearch() {
		if(!submitClickInProgress) {
			submitClickInProgress = true;
			view.getReturnToSearchButton().setEnabled(false);
			
			HasWidgets container = parentPresenter.getView().getMiddlePanel();
			GoToClassSearchAction gca = new GoToClassSearchAction();
			GoToClassSearchEvent gce = new GoToClassSearchEvent(gca, container);
			eventBus.fireEvent(gce);
		}
	}
	
	public void onGoToDetailedCourseInformationEvent(GoToDetailedCourseInformationEvent evt) {
		this.go(evt.getContainer());
	}
	
}
