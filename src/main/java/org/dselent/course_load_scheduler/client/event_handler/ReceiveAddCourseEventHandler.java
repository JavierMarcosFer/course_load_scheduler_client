package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveAddCourseEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveAddCourseEventHandler extends EventHandler{
	public void onReceiveAddCourse(ReceiveAddCourseEvent evt);
}
