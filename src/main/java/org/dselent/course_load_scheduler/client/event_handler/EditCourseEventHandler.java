package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.EditCourseEvent;

import com.google.gwt.event.shared.EventHandler;

public interface EditCourseEventHandler extends EventHandler{
	public void onEditCourse(EditCourseEvent evt);
}
