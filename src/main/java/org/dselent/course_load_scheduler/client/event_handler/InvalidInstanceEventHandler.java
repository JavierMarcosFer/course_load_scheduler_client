package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.InvalidInstanceEvent;

import com.google.gwt.event.shared.EventHandler;

public interface InvalidInstanceEventHandler extends EventHandler {
	public void onInvalidInstance(InvalidInstanceEvent evt);
}
