package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveCourseDetailsEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveCourseDetailsEventHandler extends EventHandler{

	void onReceiveCourseDetails(ReceiveCourseDetailsEvent evt);
}
