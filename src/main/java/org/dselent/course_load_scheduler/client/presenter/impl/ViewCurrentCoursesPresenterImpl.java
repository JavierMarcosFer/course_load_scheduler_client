package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.GetCurrentCoursesAction;
import org.dselent.course_load_scheduler.client.event.GetCurrentCoursesEvent;
import org.dselent.course_load_scheduler.client.event.GoToClassSearchEvent;
import org.dselent.course_load_scheduler.client.event.GoToCurrentCoursesEvent;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.ViewCurrentCoursesPresenter;
import org.dselent.course_load_scheduler.client.view.ViewCurrentCoursesView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class ViewCurrentCoursesPresenterImpl extends BasePresenterImpl implements ViewCurrentCoursesPresenter{
	
	private IndexPresenter parentPresenter;
	private ViewCurrentCoursesView view;
	@SuppressWarnings("unused")
	private Boolean accountInfoClickInProgress;
	
	@Inject
	public ViewCurrentCoursesPresenterImpl(IndexPresenter parentPresenter, ViewCurrentCoursesView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		accountInfoClickInProgress = false;
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
		
		registration = eventBus.addHandler(GoToCurrentCoursesEvent.TYPE, this);
		eventBusRegistration.put(GoToCurrentCoursesEvent.TYPE, registration);
	}
	
	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}
	
	@Override
	public ViewCurrentCoursesView getView()
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
	public void showschedule() {
		HasWidgets container = parentPresenter.getView().getMiddlePanel();
		GetCurrentCoursesAction cca = new GetCurrentCoursesAction();
		GetCurrentCoursesEvent cce = new GetCurrentCoursesEvent(cca, container);
		eventBus.fireEvent(cce);
		
	}
	
	@Override
	public void onGoToCurrentCourses(GoToCurrentCoursesEvent evt) {
		this.go(evt.getContainer());
	}
}
