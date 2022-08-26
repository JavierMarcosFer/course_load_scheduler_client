package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveSubmitRegistrationCartAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveSubmitRegistrationCartEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveSubmitRegistrationCartEvent extends DisplayEvent<ReceiveSubmitRegistrationCartAction, ReceiveSubmitRegistrationCartEventHandler> {
	
	public static Type<ReceiveSubmitRegistrationCartEventHandler> TYPE = new Type<ReceiveSubmitRegistrationCartEventHandler>();

	public ReceiveSubmitRegistrationCartEvent(ReceiveSubmitRegistrationCartAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<ReceiveSubmitRegistrationCartEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(ReceiveSubmitRegistrationCartEventHandler handler) {
		handler.onReceiveSubmitRegistrationCart(this);
	}

}
