package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveRespondMessageEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveRespondMessageEventHandler extends EventHandler {
	public void onReceiveRespondMessage (ReceiveRespondMessageEvent evt);
}
