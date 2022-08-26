package org.dselent.course_load_scheduler.client.event_handler;

import com.google.gwt.event.shared.EventHandler;
import org.dselent.course_load_scheduler.client.event.SendDeleteMessageEvent;

public interface SendDeleteMessageEventHandler extends EventHandler {
	public void onSendDeleteMessage(SendDeleteMessageEvent evt);
}
