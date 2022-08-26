package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.DeleteUserAction;
import org.dselent.course_load_scheduler.client.action.ReceiveDeleteUserAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.DeleteCourseKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;

public class DeleteUserActionTranslatorImpl implements ActionTranslator<DeleteUserAction, ReceiveDeleteUserAction>{

	@Override
	public JSONObject translateToJson(DeleteUserAction action) {
		JSONObject jsonObject = new JSONObject();

		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(DeleteCourseKeys.ID), action.getUserId());
		return jsonObject;
	}

	@Override
	public ReceiveDeleteUserAction translateToAction(JSONObject json) {
		ReceiveDeleteUserAction action = new ReceiveDeleteUserAction();
		return action;
	}

}
