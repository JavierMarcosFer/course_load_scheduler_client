package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GoToAddEditUserEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GoToAddEditUserEventHandler extends EventHandler {
	public void onGoToAddEditUser(GoToAddEditUserEvent evt);
}
