package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.InvalidAccountInfoAction;
import org.dselent.course_load_scheduler.client.event_handler.InvalidAccountInfoEventHandler;

public class InvalidAccountInfoEvent extends BaseEvent<InvalidAccountInfoAction, InvalidAccountInfoEventHandler> {
	
	public static Type<InvalidAccountInfoEventHandler> TYPE = new Type<InvalidAccountInfoEventHandler>();

	public InvalidAccountInfoEvent(InvalidAccountInfoAction action) {
		super(action);
	}

	@Override
	public Type<InvalidAccountInfoEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(InvalidAccountInfoEventHandler handler) {
		handler.onInvalidAccountInfo(this);
	}

}
