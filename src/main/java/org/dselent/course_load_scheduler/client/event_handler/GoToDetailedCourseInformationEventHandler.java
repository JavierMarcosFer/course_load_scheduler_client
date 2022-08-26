package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GoToDetailedCourseInformationEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GoToDetailedCourseInformationEventHandler extends EventHandler {
	public void onGoToDetailedCourseInformation(GoToDetailedCourseInformationEvent evt);
}
