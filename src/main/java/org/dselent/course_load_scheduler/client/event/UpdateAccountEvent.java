package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendUpdateAccountInfoAction;
import org.dselent.course_load_scheduler.client.event_handler.UpdateAccountEventHandler;

import com.google.gwt.event.shared.GwtEvent;
import com.google.gwt.user.client.ui.HasWidgets;

public class UpdateAccountEvent extends DisplayEvent<SendUpdateAccountInfoAction, UpdateAccountEventHandler>{

	public static Type<UpdateAccountEventHandler> TYPE = new Type<UpdateAccountEventHandler>();

	@Override
	protected void dispatch(UpdateAccountEventHandler handler)
	{
		handler.onUpdateAccount(this);
	}

	@Override
	public Type<UpdateAccountEventHandler> getAssociatedType()
	{
		return TYPE;
	}	

	private SendUpdateAccountInfoAction action;

	public UpdateAccountEvent(SendUpdateAccountInfoAction action, HasWidgets container)
	{
		super(action, container);
	}

	public SendUpdateAccountInfoAction getAction()
	{
		return action;
	}

}
