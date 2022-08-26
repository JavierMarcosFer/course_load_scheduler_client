package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GoToCartEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GoToCartEventHandler extends EventHandler
{
	  public void onGoToCart(GoToCartEvent evt);
}
