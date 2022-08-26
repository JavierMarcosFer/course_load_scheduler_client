package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GoToEditSectionEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GoToEditSectionEventHandler extends EventHandler{
	public void onGoToEditSection(GoToEditSectionEvent evt);
}
