package org.dselent.course_load_scheduler.client.translator.impl;

import org.dselent.course_load_scheduler.client.action.ReceiveAccountInfoAction;
import org.dselent.course_load_scheduler.client.action.SendAccountInfoAction;
import org.dselent.course_load_scheduler.client.model.ViewAccountInformation;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveAccountInfoKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendAccountInfoKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class AccountInfoTranslatorImpl implements ActionTranslator<SendAccountInfoAction, ReceiveAccountInfoAction>{

	@Override
	public JSONObject translateToJson(SendAccountInfoAction action)
	{
		JSONObject jsonObject = new JSONObject();
		
		JSONHelper.putIntValue(jsonObject, JSONHelper.convertKeyName(SendAccountInfoKeys.USER_ID), action.getUserId());
		
		return jsonObject;
	}
	
	@Override
	public ReceiveAccountInfoAction translateToAction(JSONObject json)
	{		
		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		String userName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveAccountInfoKeys.USER_NAME));
		String firstName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveAccountInfoKeys.FIRST_NAME));
		String lastName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveAccountInfoKeys.LAST_NAME));
		Long phoneNum = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveAccountInfoKeys.PHONE_NUM));
		String email = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveAccountInfoKeys.EMAIL));
		String secondaryEmail = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveAccountInfoKeys.SECONDARY_EMAIL));
		Integer reqCourses= JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveAccountInfoKeys.REQ_COURSES));
		
		ViewAccountInformation user = new ViewAccountInformation();
		user.setUserName(userName);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setPhoneNum(phoneNum);
		user.setSecondaryEmail(secondaryEmail);
		user.setReqCourses(reqCourses);
		
		ReceiveAccountInfoAction action = new ReceiveAccountInfoAction(user);	
	
		return action;
	}
	
}
