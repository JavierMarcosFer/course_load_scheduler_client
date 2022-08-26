package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GetCourseDetailsEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GetCourseDetailsEventHandler extends EventHandler{
	void onGetCourseDetails(GetCourseDetailsEvent evt);
}
