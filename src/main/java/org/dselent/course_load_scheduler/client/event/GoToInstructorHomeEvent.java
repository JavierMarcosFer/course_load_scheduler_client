package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToInstructorHomeAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToInstructorHomeEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class GoToInstructorHomeEvent extends DisplayEvent<GoToInstructorHomeAction, GoToInstructorHomeEventHandler>
{
	public static Type<GoToInstructorHomeEventHandler> TYPE = new Type<GoToInstructorHomeEventHandler>();
	
	private GoToInstructorHomeAction action;
	
	public GoToInstructorHomeEvent(GoToInstructorHomeAction action, HasWidgets container){
		super(action, container);
	}
	
	public GoToInstructorHomeAction getAction()
	{
		return action;
	}
	
	@Override
	public Type<GoToInstructorHomeEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(GoToInstructorHomeEventHandler handler) {
		handler.onGoToInstructorHome(this);
	}
}
