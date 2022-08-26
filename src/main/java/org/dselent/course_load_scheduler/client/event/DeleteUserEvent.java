package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.DeleteUserAction;
import org.dselent.course_load_scheduler.client.event_handler.DeleteUserEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class DeleteUserEvent extends DisplayEvent<DeleteUserAction, DeleteUserEventHandler>{
	public static Type<DeleteUserEventHandler> TYPE = new Type<DeleteUserEventHandler>();

	private DeleteUserAction action;
	
	public DeleteUserEvent(DeleteUserAction action, HasWidgets container) {
		super(action, container);
	}
	
	public DeleteUserAction getAction() {
		return action;
	}

	@Override
	public Type<DeleteUserEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(DeleteUserEventHandler handler)
	{
		handler.onDeleteUser(this);
	}
}
