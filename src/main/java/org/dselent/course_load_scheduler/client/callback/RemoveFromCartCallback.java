package org.dselent.course_load_scheduler.client.callback;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.action.ReceiveCourseCartRemoveCourseAction;
import org.dselent.course_load_scheduler.client.event.ReceiveCourseCartRemoveCourseEvent;
import org.dselent.course_load_scheduler.client.translator.impl.RemoveCourseFromCartActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class RemoveFromCartCallback extends DisplayCallback<JSONValue> {

	public RemoveFromCartCallback(SimpleEventBus eventBus, HasWidgets container) {
		super(eventBus, container);
	}

	@Override
	public void onSuccess(JSONValue result) {
		JSONObject json = JSONHelper.getObjectValue(result);
		RemoveCourseFromCartActionTranslatorImpl removeCourseTranslator = new RemoveCourseFromCartActionTranslatorImpl();
		ReceiveCourseCartRemoveCourseAction action = removeCourseTranslator.translateToAction(json);
		
		ReceiveCourseCartRemoveCourseEvent event = new ReceiveCourseCartRemoveCourseEvent(action, getContainer());
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
