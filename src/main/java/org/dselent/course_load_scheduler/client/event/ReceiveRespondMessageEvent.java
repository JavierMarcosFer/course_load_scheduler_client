package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveRespondMessageAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveRespondMessageEventHandler;
import org.dselent.course_load_scheduler.client.event_handler.SendRespondMessageEventHandler;

import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveRespondMessageEvent
		extends DisplayEvent<ReceiveRespondMessageAction, ReceiveRespondMessageEventHandler> {
	
	public static Type<ReceiveRespondMessageEventHandler> TYPE = new Type<ReceiveRespondMessageEventHandler>();

	public ReceiveRespondMessageEvent(ReceiveRespondMessageAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<ReceiveRespondMessageEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveRespondMessageEventHandler handler) {
		handler.onReceiveRespondMessage(this);
	}

}
