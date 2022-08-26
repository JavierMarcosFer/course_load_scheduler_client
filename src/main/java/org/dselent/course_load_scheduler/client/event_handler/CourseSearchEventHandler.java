package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.CourseSearchEvent;

import com.google.gwt.event.shared.EventHandler;

public interface CourseSearchEventHandler extends EventHandler{
	public void onCourseSearch(CourseSearchEvent evt);
}
