package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GetCurrentCoursesAction;
import org.dselent.course_load_scheduler.client.event_handler.GetCurrentCoursesEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class GetCurrentCoursesEvent extends DisplayEvent<GetCurrentCoursesAction, GetCurrentCoursesEventHandler>{
	
public static Type< GetCurrentCoursesEventHandler> TYPE = new Type< GetCurrentCoursesEventHandler>();
	
	private  GetCurrentCoursesAction action;
	
	public  GetCurrentCoursesEvent( GetCurrentCoursesAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	public  GetCurrentCoursesAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type< GetCurrentCoursesEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(GetCurrentCoursesEventHandler handler)
	{
		handler.onGetCurrentCourses(this);
	}

}
