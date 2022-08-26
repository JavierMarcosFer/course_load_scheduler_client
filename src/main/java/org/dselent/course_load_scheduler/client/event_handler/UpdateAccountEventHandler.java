package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.UpdateAccountEvent;

import com.google.gwt.event.shared.EventHandler;

public interface UpdateAccountEventHandler extends EventHandler{
	public void onUpdateAccount(UpdateAccountEvent evt);
}
