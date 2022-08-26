package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.AddToCartEvent;

import com.google.gwt.event.shared.EventHandler;

public interface AddToCartEventHandler extends EventHandler {
	public void onSendSubmitCourseToCart(AddToCartEvent evt);
}
