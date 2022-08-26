package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.Date;

import org.dselent.course_load_scheduler.client.action.ReceiveUpdateAccountInfoAction;
import org.dselent.course_load_scheduler.client.action.SendUpdateAccountInfoAction;
import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveUpdateAccountInfoKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendUpdateAccountKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class UpdateAccountInfoActionTranslatorImpl
		implements ActionTranslator<SendUpdateAccountInfoAction, ReceiveUpdateAccountInfoAction> {

	@Override
	public JSONObject translateToJson(SendUpdateAccountInfoAction action) {
		
		JSONObject jsonObject = new JSONObject();
		
		//helpers, to put strings in necessary fields
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendUpdateAccountKeys.OLD_PASSWORD), action.getOldPassword());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendUpdateAccountKeys.NEW_PASSWORD), action.getNewPassword());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendUpdateAccountKeys.REPEAT_PASSWORD), action.getRepeatPassword());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendUpdateAccountKeys.NEW_EMAIL), action.getNewEmail());
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(SendUpdateAccountKeys.NEW_PHONE_NUM), action.getNewPhoneNum());
		
		return jsonObject;
	}

	@Override
	public ReceiveUpdateAccountInfoAction translateToAction(JSONObject json) {
		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		//finish later
		Integer id = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveUpdateAccountInfoKeys.ID));
		String userName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveUpdateAccountInfoKeys.USER_NAME));
		String firstName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveUpdateAccountInfoKeys.FIRST_NAME));
		String lastName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveUpdateAccountInfoKeys.LAST_NAME));
		String email = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveUpdateAccountInfoKeys.EMAIL));
		Long phoneNum = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveUpdateAccountInfoKeys.PHONE_NUM));
		String secondaryEmail = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveUpdateAccountInfoKeys.SECONDARY_EMAIL));
		Integer userStateId = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveUpdateAccountInfoKeys.USER_STATE_ID));
		Long createdAt = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveUpdateAccountInfoKeys.CREATED_AT));
		Long updatedAt = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveUpdateAccountInfoKeys.UPDATED_AT));
		
		// TODO look into time conversion more
		// put into JSONHelper?
		
		User user = new User();
		user.setId(id);
		user.setUserName(userName);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPhoneNum(phoneNum);
		user.setSecondaryEmail(secondaryEmail);
		user.setUserStateId(userStateId);
		user.setCreatedAt(new Date(createdAt));
		user.setUpdatedAt(new Date(updatedAt));
		
		ReceiveUpdateAccountInfoAction action = new ReceiveUpdateAccountInfoAction(user);
		
		return action;
	}

}
