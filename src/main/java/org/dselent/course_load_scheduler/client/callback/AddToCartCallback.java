package org.dselent.course_load_scheduler.client.callback;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.action.ReceiveAddToCartAction;
import org.dselent.course_load_scheduler.client.event.ReceiveAddToCartEvent;
import org.dselent.course_load_scheduler.client.translator.impl.AddToCartActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class AddToCartCallback extends DisplayCallback<JSONValue> {

	public AddToCartCallback(SimpleEventBus eventBus, HasWidgets container) {
		super(eventBus, container);
	}

	@Override
	public void onSuccess(JSONValue result) {
		JSONObject json = JSONHelper.getObjectValue(result);
		AddToCartActionTranslatorImpl addToCartActionTranslator = new AddToCartActionTranslatorImpl();
		ReceiveAddToCartAction action = addToCartActionTranslator.translateToAction(json);
		
		ReceiveAddToCartEvent event = new ReceiveAddToCartEvent(action, getContainer());
		eventBus.fireEvent(event);
	}

	public void onFailure(Throwable caught)
	{
		StringBuilder sb = new StringBuilder();
		
		StackTraceElement[] stackTraceElements = caught.getStackTrace();
		for(StackTraceElement stackTraceElement : stackTraceElements)
		{
			sb.append(stackTraceElement.toString());
			sb.append("\n");
		}
		
		ArrayList<String> reasonList = new ArrayList<String>();
		reasonList.add(sb.toString());
	}
	
}
