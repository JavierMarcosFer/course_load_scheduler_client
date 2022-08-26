package org.dselent.course_load_scheduler.client.presenter.impl;

import org.dselent.course_load_scheduler.client.action.SendCourseCartRemoveCourseAction;
import org.dselent.course_load_scheduler.client.action.SendSubmitRegistrationCartAction;
import org.dselent.course_load_scheduler.client.event.SendCourseCartRemoveCourseEvent;
import org.dselent.course_load_scheduler.client.event.SendSubmitRegistrationCartEvent;
import org.dselent.course_load_scheduler.client.event.GoToCartEvent;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.presenter.CourseRegistrationCartPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.CourseRegistrationCartView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class CourseRegistrationCartPresenterImpl extends BasePresenterImpl implements CourseRegistrationCartPresenter{
	private IndexPresenter parentPresenter;
	private CourseRegistrationCartView view;
	private boolean submitCartClickInProgress;
	
	@Inject
	public CourseRegistrationCartPresenterImpl(IndexPresenter parentPresenter, CourseRegistrationCartView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		submitCartClickInProgress = false;
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
		
		registration = eventBus.addHandler(GoToCartEvent.TYPE, this);
		eventBusRegistration.put(GoToCartEvent.TYPE, registration);
	}
		
	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public CourseRegistrationCartView getView()
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
	
	public void submitCart() {
		if (!submitCartClickInProgress) {
			submitCartClickInProgress = false;
			
			view.getSubmitForApproval().setEnabled(false);
			
			sendSubmitCart();
		}
	}
	
	private void sendSubmitCart()
	{
		HasWidgets container = parentPresenter.getView().getMiddlePanel();
		SendSubmitRegistrationCartAction crca = new SendSubmitRegistrationCartAction();
		SendSubmitRegistrationCartEvent crce = new SendSubmitRegistrationCartEvent(crca, container);
		eventBus.fireEvent(crce);
	}
	
	public void removeCourse() {
		if(!submitCartClickInProgress) {
			submitCartClickInProgress = false;
			
			view.getRemoveCourse().setEnabled(false);
			
			//remove course.  should I take any arguments have to text it once the server is working
			HasWidgets container = parentPresenter.getView().getMiddlePanel();
			SendCourseCartRemoveCourseAction cra = new SendCourseCartRemoveCourseAction();
			SendCourseCartRemoveCourseEvent cre = new SendCourseCartRemoveCourseEvent(cra, container);
			eventBus.fireEvent(cre);
			
		}
	}
	
	@Override
	public void onGoToCart(GoToCartEvent evt) {
		this.go(evt.getContainer());
	}
	
}
