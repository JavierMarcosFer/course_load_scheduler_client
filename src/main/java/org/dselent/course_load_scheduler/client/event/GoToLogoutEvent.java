package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToLogoutAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToLogoutEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class GoToLogoutEvent extends DisplayEvent<GoToLogoutAction, GoToLogoutEventHandler>{

	public static Type<GoToLogoutEventHandler> TYPE = new Type<GoToLogoutEventHandler>();
	
	private GoToLogoutAction action;
	
	public GoToLogoutEvent(GoToLogoutAction action, HasWidgets container){
		super(action, container);
	}
	
	public GoToLogoutAction getAction()
	{
		return action;
	}
	
	@Override
	public Type<GoToLogoutEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(GoToLogoutEventHandler handler)
	{
		handler.onGoToLogout(this);
	}
}
