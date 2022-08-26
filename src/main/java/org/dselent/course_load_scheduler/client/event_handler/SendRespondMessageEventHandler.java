package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SendRespondMessageEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendRespondMessageEventHandler extends EventHandler {
	public void onSendRespondMessage(SendRespondMessageEvent evt);
}
