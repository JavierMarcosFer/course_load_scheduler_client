package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendDeleteMessageAction;
import org.dselent.course_load_scheduler.client.event_handler.SendDeleteMessageEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SendDeleteMessageEvent extends DisplayEvent<SendDeleteMessageAction, SendDeleteMessageEventHandler> {
	
	public static Type<SendDeleteMessageEventHandler> TYPE = new Type<SendDeleteMessageEventHandler>();

	public SendDeleteMessageEvent(SendDeleteMessageAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<SendDeleteMessageEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(SendDeleteMessageEventHandler handler) {
		handler.onSendDeleteMessage(this);
	}

}
