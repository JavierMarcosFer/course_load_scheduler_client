package org.dselent.course_load_scheduler.client.callback;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.action.InvalidCourseAction;
import org.dselent.course_load_scheduler.client.action.ReceiveAddCourseAction;
import org.dselent.course_load_scheduler.client.event.InvalidCourseEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveAddCourseEvent;
import org.dselent.course_load_scheduler.client.translator.impl.AddCourseTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class AddCourseCallback extends DisplayCallback<JSONValue> {

	public AddCourseCallback(SimpleEventBus eventBus, HasWidgets container) {
		super(eventBus, container);
	}

	@Override
	public void onSuccess(JSONValue result) {
		JSONObject json = JSONHelper.getObjectValue(result);
		AddCourseTranslatorImpl AddCourseActionTranslator = new AddCourseTranslatorImpl();
		ReceiveAddCourseAction action = AddCourseActionTranslator.translateToAction(json);
		
		ReceiveAddCourseEvent event = new ReceiveAddCourseEvent(action, getContainer());
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
		
		InvalidCourseAction ila = new InvalidCourseAction(reasonList);
		InvalidCourseEvent ile = new InvalidCourseEvent(ila);
		eventBus.fireEvent(ile);
	}
	
}
