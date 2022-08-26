package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.EditCourseAction;
import org.dselent.course_load_scheduler.client.action.ReceiveEditCourseAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.EditCourseKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;

public class EditCourseActionTranslatorImpl implements ActionTranslator<EditCourseAction, ReceiveEditCourseAction>{

	@Override
	public JSONObject translateToJson(EditCourseAction action) {
		JSONObject jsonObject = new JSONObject();

		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(EditCourseKeys.NUMBER), action.getNumber());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(EditCourseKeys.NAME), action.getName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(EditCourseKeys.TYPE), action.getType());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(EditCourseKeys.LEVEL), action.getLevel());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(EditCourseKeys.DEPARTMENT), action.getDepartment());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(EditCourseKeys.COURSE_ID), action.getCourseId());

		return jsonObject;
	}

	@Override
	public ReceiveEditCourseAction translateToAction(JSONObject json) {
		ReceiveEditCourseAction action = new ReceiveEditCourseAction();
		return action;
	}

}
