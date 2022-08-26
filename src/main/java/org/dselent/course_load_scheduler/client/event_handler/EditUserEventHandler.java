package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.EditUserEvent;
import com.google.gwt.event.shared.EventHandler;

public interface EditUserEventHandler extends EventHandler{

	public void onEditUser(EditUserEvent evt);
}
