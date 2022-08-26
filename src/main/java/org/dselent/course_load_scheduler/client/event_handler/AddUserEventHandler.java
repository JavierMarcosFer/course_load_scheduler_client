package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.AddUserEvent;
import com.google.gwt.event.shared.EventHandler;

public interface AddUserEventHandler extends EventHandler{
	public void onAddUser(AddUserEvent evt);
}