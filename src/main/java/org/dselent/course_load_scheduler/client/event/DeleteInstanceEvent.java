package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.DeleteInstanceAction;
import org.dselent.course_load_scheduler.client.event_handler.DeleteInstanceEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class DeleteInstanceEvent extends DisplayEvent<DeleteInstanceAction, DeleteInstanceEventHandler>{
	public static Type<DeleteInstanceEventHandler> TYPE = new Type<DeleteInstanceEventHandler>();
	
	private DeleteInstanceAction action;
	
	public DeleteInstanceEvent(DeleteInstanceAction action, HasWidgets container) {
		super(action, container);
	}
	
	public DeleteInstanceAction getaction() {
		return action;
	}
	
	@Override
	public Type<DeleteInstanceEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(DeleteInstanceEventHandler handler)
	{
		handler.onDeleteInstance(this);
	}
}
