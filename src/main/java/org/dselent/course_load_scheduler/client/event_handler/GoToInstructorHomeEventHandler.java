package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GoToInstructorHomeEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GoToInstructorHomeEventHandler extends EventHandler{
	public void onGoToInstructorHome(GoToInstructorHomeEvent evt);

}
