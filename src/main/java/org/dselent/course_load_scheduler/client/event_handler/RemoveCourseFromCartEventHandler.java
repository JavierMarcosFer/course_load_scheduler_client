package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.RemoveCourseFromCartEvent;

import com.google.gwt.event.shared.EventHandler;

public interface RemoveCourseFromCartEventHandler extends EventHandler{
	void onRemoveCourseFromCart(RemoveCourseFromCartEvent evt);
}
