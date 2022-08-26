package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GoToLogoutEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GoToLogoutEventHandler extends EventHandler{

	public void onGoToLogout(GoToLogoutEvent evt);
}
