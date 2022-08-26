package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveCourseDetailsAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveCourseDetailsEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveCourseDetailsEvent extends DisplayEvent<ReceiveCourseDetailsAction, ReceiveCourseDetailsEventHandler>{
	
public static Type< ReceiveCourseDetailsEventHandler> TYPE = new Type< ReceiveCourseDetailsEventHandler>();
	
	private  ReceiveCourseDetailsAction action;
	
	public  ReceiveCourseDetailsEvent( ReceiveCourseDetailsAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	public  ReceiveCourseDetailsAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type< ReceiveCourseDetailsEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(ReceiveCourseDetailsEventHandler handler)
	{
		handler.onReceiveCourseDetails(this);
	}

}
