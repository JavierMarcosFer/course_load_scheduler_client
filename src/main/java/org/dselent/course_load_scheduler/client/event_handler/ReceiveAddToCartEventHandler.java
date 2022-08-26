package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveAddToCartEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveAddToCartEventHandler extends EventHandler{
	void onReceiveAddToCart(ReceiveAddToCartEvent evt);
}
