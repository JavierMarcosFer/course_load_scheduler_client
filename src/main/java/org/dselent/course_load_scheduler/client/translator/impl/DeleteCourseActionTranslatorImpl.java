package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.DeleteCourseAction;
import org.dselent.course_load_scheduler.client.action.ReceiveDeleteCourseAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.DeleteCourseKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;

public class DeleteCourseActionTranslatorImpl implements ActionTranslator<DeleteCourseAction, ReceiveDeleteCourseAction>{

	@Override
	public JSONObject translateToJson(DeleteCourseAction action) {
		JSONObject jsonObject = new JSONObject();

		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(DeleteCourseKeys.ID), action.getCourseId());
		return jsonObject;
	}

	@Override
	public ReceiveDeleteCourseAction translateToAction(JSONObject json) {
		ReceiveDeleteCourseAction action = new ReceiveDeleteCourseAction();
		return action;
	}

}
