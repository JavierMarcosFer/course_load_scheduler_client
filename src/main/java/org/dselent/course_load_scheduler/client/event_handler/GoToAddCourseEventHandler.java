package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GoToAddCourseEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GoToAddCourseEventHandler extends EventHandler {
	public void onGoToAddCourse(GoToAddCourseEvent evt);
}
