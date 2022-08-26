package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveCourseCartRemoveCourseEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveCourseCartRemoveCourseEventHandler extends EventHandler {
	public void onReceiveCourseCartRemoveCourseEventHandler(ReceiveCourseCartRemoveCourseEvent evt);
}
