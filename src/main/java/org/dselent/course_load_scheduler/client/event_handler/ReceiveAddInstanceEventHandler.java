package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveAddInstanceEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveAddInstanceEventHandler extends EventHandler{
	public void onReceiveAddInstance(ReceiveAddInstanceEvent evt);
}
