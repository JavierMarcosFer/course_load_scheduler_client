package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.SendCourseCartRemoveCourseEvent;

import com.google.gwt.event.shared.EventHandler;

public interface SendCourseCartRemoveCourseEventHandler extends EventHandler {
	public void onCartRemoveCourse(SendCourseCartRemoveCourseEvent evt);
}
