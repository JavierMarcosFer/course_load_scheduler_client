package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GoToAdminHomeEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GoToAdminHomeEventHandler extends EventHandler{
	public void onGoToAdminHome(GoToAdminHomeEvent evt);
}
