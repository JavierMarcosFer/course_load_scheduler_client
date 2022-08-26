package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveAddUserEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveAddUserEventHandler extends EventHandler{
	public void onReceiveAddUser(ReceiveAddUserEvent evt);
}
