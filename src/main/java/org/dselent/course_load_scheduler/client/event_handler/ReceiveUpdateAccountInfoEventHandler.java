package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveUpdateAccountInfoEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveUpdateAccountInfoEventHandler extends EventHandler {
	public void onReceiveUpdateAccountInfo(ReceiveUpdateAccountInfoEvent evt);
}
