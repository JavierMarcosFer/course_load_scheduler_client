package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveDeleteMessageAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveDeleteMessageEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveDeleteMessageEvent
		extends DisplayEvent<ReceiveDeleteMessageAction, ReceiveDeleteMessageEventHandler> {
	
	public static Type<ReceiveDeleteMessageEventHandler> TYPE = new Type<ReceiveDeleteMessageEventHandler>();

	public ReceiveDeleteMessageEvent(ReceiveDeleteMessageAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<ReceiveDeleteMessageEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveDeleteMessageEventHandler handler) {
		handler.onReceiveDeleteMessage(this);
	}

}
