package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.DeleteCourseEvent;

import com.google.gwt.event.shared.EventHandler;

public interface DeleteCourseEventHandler extends EventHandler {
	public void onDeleteCourse(DeleteCourseEvent evt);

}
