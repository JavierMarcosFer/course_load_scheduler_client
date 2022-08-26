package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GetCurrentCoursesEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GetCurrentCoursesEventHandler extends EventHandler{
	public void onGetCurrentCourses(GetCurrentCoursesEvent fcme);
}
