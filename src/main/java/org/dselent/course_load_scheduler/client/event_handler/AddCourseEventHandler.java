package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.AddCourseEvent;
import com.google.gwt.event.shared.EventHandler;

public interface AddCourseEventHandler extends EventHandler{
	public void onAddCourse(AddCourseEvent evt);
}
