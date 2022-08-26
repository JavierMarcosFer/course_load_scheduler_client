package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.InvalidCourseIdEvent;

import com.google.gwt.event.shared.EventHandler;

public interface InvalidCourseIdEventHandler extends EventHandler {
	public void onInvalidCourseId(InvalidCourseIdEvent evt);
}
