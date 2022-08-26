package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.ReceiveCourseCartRemoveCourseAction;
import org.dselent.course_load_scheduler.client.action.RemoveCourseFromCartAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.RemoveFromCartKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;

public class RemoveCourseFromCartActionTranslatorImpl implements ActionTranslator<RemoveCourseFromCartAction, ReceiveCourseCartRemoveCourseAction>{

	@Override
	public JSONObject translateToJson(RemoveCourseFromCartAction action) {
		JSONObject jsonObject = new JSONObject();

		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(RemoveFromCartKeys.INSTRUCTOR_ID), action.getInstructorId());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(RemoveFromCartKeys.INSTANCE_ID), action.getInstanceId());
		return jsonObject;
	}

	@Override
	public ReceiveCourseCartRemoveCourseAction translateToAction(JSONObject json) {
		ReceiveCourseCartRemoveCourseAction action = new ReceiveCourseCartRemoveCourseAction();
		return action;
	}

}
