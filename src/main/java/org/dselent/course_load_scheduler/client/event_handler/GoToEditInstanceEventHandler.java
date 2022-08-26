package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GoToEditInstanceEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GoToEditInstanceEventHandler extends EventHandler{
	public void onGoToInstanceEdit(GoToEditInstanceEvent evt);
}
