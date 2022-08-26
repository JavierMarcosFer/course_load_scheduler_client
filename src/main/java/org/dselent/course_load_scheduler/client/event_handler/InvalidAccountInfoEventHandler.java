package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.InvalidAccountInfoEvent;

import com.google.gwt.event.shared.EventHandler;

public interface InvalidAccountInfoEventHandler extends EventHandler {
	public void onInvalidAccountInfo(InvalidAccountInfoEvent evt);
}
