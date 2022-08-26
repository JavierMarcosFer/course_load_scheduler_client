package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.DeleteInstanceEvent;

import com.google.gwt.event.shared.EventHandler;

public interface DeleteInstanceEventHandler extends EventHandler{
	public void onDeleteInstance(DeleteInstanceEvent evt);
}
