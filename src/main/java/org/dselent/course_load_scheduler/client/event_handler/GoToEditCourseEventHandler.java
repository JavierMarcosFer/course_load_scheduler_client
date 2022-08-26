package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GoToEditCourseEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GoToEditCourseEventHandler extends EventHandler {
	public void onGoToEditCourse(GoToEditCourseEvent evt);
}
