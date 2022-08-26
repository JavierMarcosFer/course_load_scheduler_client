package org.dselent.course_load_scheduler.client.event;

import org.dselent.course_load_scheduler.client.action.AddToCartAction;
import org.dselent.course_load_scheduler.client.event_handler.AddToCartEventHandler;

import com.google.gwt.user.client.ui.HasWidgets;

public class AddToCartEvent extends DisplayEvent<AddToCartAction, AddToCartEventHandler> {
	
	public static Type<AddToCartEventHandler> TYPE = new Type<AddToCartEventHandler>();

	public AddToCartEvent(AddToCartAction action, HasWidgets container) {
		super(action, container);
	}

	@Override
	public Type<AddToCartEventHandler> getAssociatedType() {
		return TYPE;
	}

	@Override
	protected void dispatch(AddToCartEventHandler handler) {
		handler.onSendSubmitCourseToCart(this);
	}

}
