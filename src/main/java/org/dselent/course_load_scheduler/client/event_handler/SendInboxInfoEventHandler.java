package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SendInboxInfoEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendInboxInfoEventHandler extends EventHandler{
	void onSendInboxInfo(SendInboxInfoEvent evt);
}
