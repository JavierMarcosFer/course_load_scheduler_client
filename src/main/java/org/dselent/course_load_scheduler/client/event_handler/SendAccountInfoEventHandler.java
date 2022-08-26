package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SendAccountInfoEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendAccountInfoEventHandler extends EventHandler{
	public void onSendAccountInfo(SendAccountInfoEvent evt);
}
