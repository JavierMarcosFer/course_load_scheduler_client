package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GetCourseDetailsAction;
import org.dselent.course_load_scheduler.client.event_handler.GetCourseDetailsEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class GetCourseDetailsEvent extends DisplayEvent<GetCourseDetailsAction, GetCourseDetailsEventHandler>{
	
public static Type< GetCourseDetailsEventHandler> TYPE = new Type< GetCourseDetailsEventHandler>();
	
	private  GetCourseDetailsAction action;
	
	public  GetCourseDetailsEvent( GetCourseDetailsAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	public  GetCourseDetailsAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type< GetCourseDetailsEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(GetCourseDetailsEventHandler handler)
	{
		handler.onGetCourseDetails(this);
	}

}
