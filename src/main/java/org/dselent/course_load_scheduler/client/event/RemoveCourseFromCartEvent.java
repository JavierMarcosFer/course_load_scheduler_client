package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.RemoveCourseFromCartAction;
import org.dselent.course_load_scheduler.client.event_handler.RemoveCourseFromCartEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class RemoveCourseFromCartEvent extends DisplayEvent<RemoveCourseFromCartAction, RemoveCourseFromCartEventHandler>{
public static Type<RemoveCourseFromCartEventHandler> TYPE = new Type<RemoveCourseFromCartEventHandler>();
	
	private RemoveCourseFromCartAction action;
	
	public RemoveCourseFromCartEvent(RemoveCourseFromCartAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	public RemoveCourseFromCartAction getAction()
	{
		return action;
	}
	@Override
	public Type<RemoveCourseFromCartEventHandler> getAssociatedType()
	{
		return TYPE;
	}
	@Override
	protected void dispatch(RemoveCourseFromCartEventHandler handler)
	{
		handler.onRemoveCourseFromCart(this);
	}
}
