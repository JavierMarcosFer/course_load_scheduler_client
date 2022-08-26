package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveAccountInfoEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveAccountInfoEventHandler extends EventHandler{
	public void onReceiveAccountInfo(ReceiveAccountInfoEvent evt);
}
