package org.dselent.course_load_scheduler.client.callback;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.action.ReceiveSubmitRegistrationCartAction;
import org.dselent.course_load_scheduler.client.event.ReceiveSubmitRegistrationCartEvent;
import org.dselent.course_load_scheduler.client.translator.impl.SendSubmitRegistrationCartActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class SubmitRegistrationCartCallback extends DisplayCallback<JSONValue> {

	public SubmitRegistrationCartCallback(SimpleEventBus eventBus, HasWidgets container) {
		super(eventBus, container);
	}

	@Override
	public void onSuccess(JSONValue result) {
		JSONObject json = JSONHelper.getObjectValue(result);
		SendSubmitRegistrationCartActionTranslatorImpl RegistrationCartActionTranslator = new SendSubmitRegistrationCartActionTranslatorImpl();
		ReceiveSubmitRegistrationCartAction action = RegistrationCartActionTranslator.translateToAction(json);
		
		ReceiveSubmitRegistrationCartEvent event = new ReceiveSubmitRegistrationCartEvent(action, getContainer());
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
