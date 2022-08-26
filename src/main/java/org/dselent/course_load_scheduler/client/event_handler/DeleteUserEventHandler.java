package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.DeleteUserEvent;

import com.google.gwt.event.shared.EventHandler;

public interface DeleteUserEventHandler extends EventHandler{
	public void onDeleteUser(DeleteUserEvent evt);
}
