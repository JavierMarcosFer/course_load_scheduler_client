package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.EditUserAction;
import org.dselent.course_load_scheduler.client.action.ReceiveEditUserAction;
import org.dselent.course_load_scheduler.client.send.jsonkeys.EditUserKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;

public class EditUserActionTranslatorImpl implements ActionTranslator<EditUserAction, ReceiveEditUserAction>{

	@Override
	public JSONObject translateToJson(EditUserAction action) {
		JSONObject jsonObject = new JSONObject();

		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(EditUserKeys.LAST_NAME), action.getNewLastName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(EditUserKeys.EMAIL), action.getNewEmail());
		JSONHelper.putDoubleValue(jsonObject, JSONHelper.convertKeyName(EditUserKeys.REQUIREMENTS), action.getNewRequirements());
		JSONHelper.putBooleanValue(jsonObject, JSONHelper.convertKeyName(EditUserKeys.ADMINISTRATOR), action.getNewAdministrator());

		return jsonObject;
	}

	@Override
	public ReceiveEditUserAction translateToAction(JSONObject json) {
		ReceiveEditUserAction action = new ReceiveEditUserAction();
		return action;
	}

}
