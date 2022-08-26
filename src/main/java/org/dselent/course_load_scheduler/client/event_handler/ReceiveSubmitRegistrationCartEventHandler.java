package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveSubmitRegistrationCartEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveSubmitRegistrationCartEventHandler extends EventHandler {
	public void onReceiveSubmitRegistrationCart(ReceiveSubmitRegistrationCartEvent evt);
}
