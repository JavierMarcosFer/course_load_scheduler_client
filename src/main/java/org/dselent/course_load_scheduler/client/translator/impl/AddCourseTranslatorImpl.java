package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.AddCourseAction;
import org.dselent.course_load_scheduler.client.action.ReceiveAddCourseAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.AddCourseKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;

public class AddCourseTranslatorImpl implements ActionTranslator<AddCourseAction, ReceiveAddCourseAction> {

	@Override
	public JSONObject translateToJson(AddCourseAction action) {
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(AddCourseKeys.NUMBER), action.getNumber());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(AddCourseKeys.NAME), action.getName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(AddCourseKeys.TYPE), action.getType());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(AddCourseKeys.DESCRIPTION), action.getDescription());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(AddCourseKeys.LEVEL), action.getLevel());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(AddCourseKeys.DEPARTMENT), action.getDepartment());
		
		return jsonObject;
	}

	@Override
	public ReceiveAddCourseAction translateToAction(JSONObject json) {

		ReceiveAddCourseAction action = new ReceiveAddCourseAction();
		
		return action;
	}

}
