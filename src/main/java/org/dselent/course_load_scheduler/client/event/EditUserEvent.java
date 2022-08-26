package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.EditUserAction;
import org.dselent.course_load_scheduler.client.event_handler.EditUserEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class EditUserEvent extends DisplayEvent<EditUserAction, EditUserEventHandler>{
	
public static Type< EditUserEventHandler> TYPE = new Type< EditUserEventHandler>();
	
	private  EditUserAction action;
	
	public  EditUserEvent( EditUserAction action, HasWidgets container)
	{
		super(action, container);
	}
	
	public  EditUserAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type< EditUserEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(EditUserEventHandler handler)
	{
		handler.onEditUser(this);
	}

}
