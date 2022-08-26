package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.GoToAccountInfoEvent;

import com.google.gwt.event.shared.EventHandler;

public interface GoToAccountInfoEventHandler extends EventHandler
{
	  public void onGoToAccountInfo(GoToAccountInfoEvent evt);
}
