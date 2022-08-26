package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveInboxInfoEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveInboxInfoEventHandler extends EventHandler{
	void onReceiveInboxInfo(ReceiveInboxInfoEvent evt);
}
