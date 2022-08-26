package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.GoToCartAction;
import org.dselent.course_load_scheduler.client.event_handler.GoToCartEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class GoToCartEvent extends DisplayEvent<GoToCartAction, GoToCartEventHandler>
{
	public static Type<GoToCartEventHandler> TYPE = new Type<GoToCartEventHandler>();
	
	private GoToCartAction action;
	
	public GoToCartEvent(GoToCartAction action, HasWidgets container){
		super(action, container);
	}
	
	public GoToCartAction getAction()
	{
		return action;
	}
	
	@Override
	public Type<GoToCartEventHandler> getAssociatedType()
	{
		return TYPE;
	}

	@Override
	protected void dispatch(GoToCartEventHandler handler)
	{
		handler.onGoToCart(this);
	}
}
