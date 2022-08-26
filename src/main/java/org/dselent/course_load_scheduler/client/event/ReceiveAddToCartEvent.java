package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.ReceiveAddToCartAction;
import org.dselent.course_load_scheduler.client.event_handler.ReceiveAddToCartEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class ReceiveAddToCartEvent extends DisplayEvent<ReceiveAddToCartAction, ReceiveAddToCartEventHandler>
{
	public static Type<ReceiveAddToCartEventHandler> TYPE = new Type<ReceiveAddToCartEventHandler>();
	
	public ReceiveAddToCartEvent(ReceiveAddToCartAction action, HasWidgets container) {
		super(action, container);
	}
	@Override
	public Type<ReceiveAddToCartEventHandler> getAssociatedType()
	{
		return TYPE;
	}
	protected void dispatch(ReceiveAddToCartEventHandler handler)
	{
		handler.onReceiveAddToCart(this);
	}
}
