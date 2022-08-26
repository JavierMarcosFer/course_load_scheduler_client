package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GoToCurrentCoursesEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GoToCurrentCoursesEventHandler extends EventHandler {
	public void onGoToCurrentCourses(GoToCurrentCoursesEvent evt);
}
