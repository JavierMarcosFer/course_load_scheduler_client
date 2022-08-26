package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveDeleteCourseEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveDeleteCourseEventHandler extends EventHandler{
	void onReceiveDeleteCourse(ReceiveDeleteCourseEvent evt);
}
