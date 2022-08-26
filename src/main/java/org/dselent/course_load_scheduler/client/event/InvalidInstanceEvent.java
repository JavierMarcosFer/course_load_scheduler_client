package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidInstanceAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidInstanceEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class InvalidInstanceEvent extends DisplayEvent<InvalidInstanceAction, InvalidInstanceEventHandler> {
	public static Type<InvalidInstanceEventHandler> TYPE = new Type<InvalidInstanceEventHandler>();
	private InvalidInstanceAction action;
	
	public InvalidInstanceEvent(InvalidInstanceAction action, HasWidgets container) {
		super(action, container);
	}
	
	public InvalidInstanceAction getAction() {
		return action;
	}

	@Override
	public Type<InvalidInstanceEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(InvalidInstanceEventHandler handler) {
		handler.onInvalidInstance(this);
	}
	
	
	
}
