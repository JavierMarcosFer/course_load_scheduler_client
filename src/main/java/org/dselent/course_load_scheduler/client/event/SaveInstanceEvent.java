package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SaveInstanceAction;
import org.dselent.course_load_scheduler.client.event_handler.SaveInstanceEventHandler;

import com.google.gwt.event.shared.GwtEvent;

public class SaveInstanceEvent extends GwtEvent<SaveInstanceEventHandler>{
	public static Type<SaveInstanceEventHandler> TYPE = new Type<SaveInstanceEventHandler>();

	private SaveInstanceAction action;

	public SaveInstanceEvent(SaveInstanceAction action)
	{
		this.action = action;
	}

	public SaveInstanceAction getAction()
	{
		return action;
	}

	@Override
	public Type<SaveInstanceEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(SaveInstanceEventHandler handler)
	{
		handler.onSaveInstance(this);
	}
}