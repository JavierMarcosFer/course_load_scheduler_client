package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToEditInstanceAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToEditInstanceEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class GoToEditInstanceEvent extends DisplayEvent<GoToEditInstanceAction, GoToEditInstanceEventHandler>{
	public static Type<GoToEditInstanceEventHandler> TYPE = new Type<GoToEditInstanceEventHandler>();

	private GoToEditInstanceAction action;
	
	public GoToEditInstanceEvent(GoToEditInstanceAction action, HasWidgets container) {
		super(action, container);
	}
	
	public GoToEditInstanceAction getAction() {
		return action;
	}

	@Override
	public Type<GoToEditInstanceEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(GoToEditInstanceEventHandler handler)
	{
		handler.onGoToInstanceEdit(this);
	}
}
