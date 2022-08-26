package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.SendSubmitRegistrationCartAction;
import org.dselent.course_load_scheduler.client.event_handler.SendSubmitRegistrationCartEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class SendSubmitRegistrationCartEvent  extends DisplayEvent<SendSubmitRegistrationCartAction, SendSubmitRegistrationCartEventHandler>{
	public static Type< SendSubmitRegistrationCartEventHandler> TYPE = new Type<SendSubmitRegistrationCartEventHandler>();
	
	private  SendSubmitRegistrationCartAction action;
	
	public  SendSubmitRegistrationCartEvent(SendSubmitRegistrationCartAction action, HasWidgets container)
	{
		super(action, container);
		this.action = action;
	}
	
	public  SendSubmitRegistrationCartAction getAction()
	{
		return action;
	}
	
	/*
	 * 
	 */
	@Override
	public Type<SendSubmitRegistrationCartEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	/*
	 * 
	 */
	@Override
	protected void dispatch(SendSubmitRegistrationCartEventHandler handler)
	{
		handler.onSubmitCart(this);
	}
}
