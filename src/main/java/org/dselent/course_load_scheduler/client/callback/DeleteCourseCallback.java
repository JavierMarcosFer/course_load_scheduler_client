package org.dselent.course_load_scheduler.client.callback;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.action.ReceiveDeleteCourseAction;
import org.dselent.course_load_scheduler.client.event.ReceiveDeleteCourseEvent;
import org.dselent.course_load_scheduler.client.translator.impl.DeleteCourseActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;
import com.google.gwt.user.client.ui.HasWidgets;

public class DeleteCourseCallback extends DisplayCallback<JSONValue> {

	public DeleteCourseCallback(SimpleEventBus eventBus, HasWidgets container) {
		super(eventBus, container);
	}

	@Override
	public void onSuccess(JSONValue result) {
		JSONObject json = JSONHelper.getObjectValue(result);
		DeleteCourseActionTranslatorImpl DeleteCourseActionTranslator = new DeleteCourseActionTranslatorImpl();
		ReceiveDeleteCourseAction action = DeleteCourseActionTranslator.translateToAction(json);
		
		ReceiveDeleteCourseEvent event = new ReceiveDeleteCourseEvent(action, getContainer());
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
