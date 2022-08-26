package org.dselent.course_load_scheduler.client.callback;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.action.InvalidAccountInfoAction;
import org.dselent.course_load_scheduler.client.action.ReceiveAccountInfoAction;
import org.dselent.course_load_scheduler.client.event.InvalidAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveAccountInfoEvent;
import org.dselent.course_load_scheduler.client.translator.impl.AccountInfoTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class AccountInfoCallback extends DisplayCallback<JSONValue> {

	public AccountInfoCallback(SimpleEventBus eventBus, HasWidgets container) {
		super(eventBus, container);
	}

	@Override
	public void onSuccess(JSONValue result) {
		JSONObject json = JSONHelper.getObjectValue(result);
		AccountInfoTranslatorImpl accountInfoActionTranslator = new AccountInfoTranslatorImpl();
		ReceiveAccountInfoAction action = accountInfoActionTranslator.translateToAction(json);
		
		ReceiveAccountInfoEvent event = new ReceiveAccountInfoEvent(action, getContainer());
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
				
		InvalidAccountInfoAction ila = new InvalidAccountInfoAction(reasonList);
		InvalidAccountInfoEvent ile = new InvalidAccountInfoEvent(ila);
		eventBus.fireEvent(ile);
	}
	
}