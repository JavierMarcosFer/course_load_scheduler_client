package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.ReceiveCourseSearchEvent;

import com.google.gwt.event.shared.EventHandler;

public interface ReceiveCourseSearchEventHandler extends EventHandler{
	public void onReceiveCourseSearch(ReceiveCourseSearchEvent evt);
}
