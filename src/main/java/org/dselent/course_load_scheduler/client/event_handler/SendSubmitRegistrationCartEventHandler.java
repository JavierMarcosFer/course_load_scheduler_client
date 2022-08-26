package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SendSubmitRegistrationCartEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendSubmitRegistrationCartEventHandler  extends EventHandler{
	public void onSubmitCart(SendSubmitRegistrationCartEvent evt);
}
