package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToAdminHomeAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToAdminHomeEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class GoToAdminHomeEvent extends DisplayEvent<GoToAdminHomeAction, GoToAdminHomeEventHandler>
{
	public static Type<GoToAdminHomeEventHandler> TYPE = new Type<GoToAdminHomeEventHandler>();
	
	private GoToAdminHomeAction action;
	
	public GoToAdminHomeEvent(GoToAdminHomeAction action, HasWidgets container){
		super(action, container);
	}
	
	public GoToAdminHomeAction getAction()
	{
		return action;
	}
	
	@Override
	public Type<GoToAdminHomeEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(GoToAdminHomeEventHandler handler)
	{
		handler.onGoToAdminHome(this);
	}
}
