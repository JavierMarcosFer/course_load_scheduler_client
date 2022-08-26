package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.CurrentCoursesEvent;

import com.google.gwt.event.shared.EventHandler;

public interface CurrentCoursesEventHandler extends EventHandler{
	void onCurrentCourses(CurrentCoursesEvent evt);
}
