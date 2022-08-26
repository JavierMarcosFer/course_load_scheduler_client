package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.InvalidCourseEvent;

import com.google.gwt.event.shared.EventHandler;

public interface InvalidCourseEventHandler extends EventHandler {
	public void onInvalidCourse(InvalidCourseEvent evt);
}
