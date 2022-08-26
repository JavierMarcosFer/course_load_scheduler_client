package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GoToClassSearchEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GoToClassSearchEventHandler extends EventHandler {
	public void onGoToClassSearch(GoToClassSearchEvent evt);
}
