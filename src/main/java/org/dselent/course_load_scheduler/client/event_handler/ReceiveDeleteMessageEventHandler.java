package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveDeleteMessageEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveDeleteMessageEventHandler extends EventHandler {
	public void onReceiveDeleteMessage(ReceiveDeleteMessageEvent evt);
}
