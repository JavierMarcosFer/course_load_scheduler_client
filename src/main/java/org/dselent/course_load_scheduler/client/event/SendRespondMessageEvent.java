package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendRespondMessageAction;
import org.dselent.course_load_scheduler.client.event_handler.SendRespondMessageEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SendRespondMessageEvent extends DisplayEvent<SendRespondMessageAction, SendRespondMessageEventHandler> {
	
	public static Type<SendRespondMessageEventHandler> TYPE = new Type<SendRespondMessageEventHandler>();

	public SendRespondMessageEvent(SendRespondMessageAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<SendRespondMessageEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(SendRespondMessageEventHandler handler) {
		handler.onSendRespondMessage(this);
	}

}
