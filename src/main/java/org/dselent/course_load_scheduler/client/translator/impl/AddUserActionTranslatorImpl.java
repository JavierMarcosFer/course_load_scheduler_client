package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.AddUserAction;
import org.dselent.course_load_scheduler.client.action.ReceiveAddUserAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.AddUserKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;

public class AddUserActionTranslatorImpl implements ActionTranslator<AddUserAction, ReceiveAddUserAction>{

	@Override
	public JSONObject translateToJson(AddUserAction action) {
		JSONObject jsonObject = new JSONObject();

		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(AddUserKeys.FIRST_NAME), action.getFirstName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(AddUserKeys.LAST_NAME), action.getLastName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(AddUserKeys.EMAIL), action.getEmail());
		JSONHelper.putDoubleValue(jsonObject, JSONHelper.convertKeyName(AddUserKeys.REQUIREMENTS), action.getRequirements());
		JSONHelper.putBooleanValue(jsonObject, JSONHelper.convertKeyName(AddUserKeys.ADMINISTRATOR), action.getAdministrator());

		return jsonObject;
	}

	@Override
	public ReceiveAddUserAction translateToAction(JSONObject json) {
		ReceiveAddUserAction action = new ReceiveAddUserAction();
		return action;
	}

}
