package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToAccountInfoAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToAccountInfoEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class GoToAccountInfoEvent extends DisplayEvent<GoToAccountInfoAction, GoToAccountInfoEventHandler>
{
	public static Type<GoToAccountInfoEventHandler> TYPE = new Type<GoToAccountInfoEventHandler>();
	
	private GoToAccountInfoAction action;
	
	public GoToAccountInfoEvent(GoToAccountInfoAction action, HasWidgets container){
		super(action, container);
	}
	
	public GoToAccountInfoAction getAction(){
		return action;
	}
	
	@Override
	public Type<GoToAccountInfoEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(GoToAccountInfoEventHandler handler)
	{
		handler.onGoToAccountInfo(this);
	}
}

