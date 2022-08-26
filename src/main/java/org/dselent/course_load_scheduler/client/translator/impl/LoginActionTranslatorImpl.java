package org.dselent.course_load_scheduler.client.translator.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import org.dselent.course_load_scheduler.client.action.ReceiveLoginAction;
import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.model.User;
import org.dselent.course_load_scheduler.client.receive.jsonkeys.ReceiveLoginKeys;
import org.dselent.course_load_scheduler.client.send.jsonkeys.SendLoginKeys;
import org.dselent.course_load_scheduler.client.translator.ActionTranslator;
import org.dselent.course_load_scheduler.client.utils.JSONHelper;

import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONValue;

public class LoginActionTranslatorImpl implements ActionTranslator<SendLoginAction, ReceiveLoginAction>
{
	@Override
	public JSONObject translateToJson(SendLoginAction action)
	{
		JSONObject jsonObject = new JSONObject();

		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendLoginKeys.USER_NAME), action.getUserName());
		JSONHelper.putStringValue(jsonObject, JSONHelper.convertKeyName(SendLoginKeys.PASSWORD), action.getPassword());

		return jsonObject;
	}

	@Override
	public ReceiveLoginAction translateToAction(JSONObject json)
	{		
		// null values will not have their keys sent back from the sever
		// this will throw an exception here
		// you may choose to handle the exception as you wish

		// sent timestamps as epoch seconds (long)	

		JSONValue jsonObject = json.get("success");
		JSONObject userObject = jsonObject.isArray().get(0).isObject();
		
		Integer id = JSONHelper.getIntValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.USER_ID));
		String firstName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.FIRST_NAME));
		String lastName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.LAST_NAME));
		String userName = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.USER_NAME));
		String email = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.EMAIL));
		//String secondEmail = JSONHelper.getStringValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.SECONDARY_EMAIL));
		//Long phoneNum = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.PHONE_NUM));
		//Long reqCourses = JSONHelper.getLongValue(userObject, JSONHelper.convertKeyName(ReceiveLoginKeys.REQ_COURSES));

		// TODO look into time conversion more
		// put into JSONHelper?

		User user = new User();
		user.setId(id);
		user.setUserName(userName);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setEmail(email);

		// possibly use builder pattern if it is a lot of data
		ReceiveLoginAction action = new ReceiveLoginAction(user);	

		return action;
	}

	//	// null values will not have their keys sent back from the sever
	//	// this will throw an exception here
	//	// you may choose to handle the exception as you wish
	//
	//	// sent timestamps as epoch seconds (long)
	//
	//	Map<String, Object> params = new HashMap<String, Object>();
	//
	//	Integer id = JSONHelper.getIntValue(json, JSONHelper.convertKeyName(ReceiveLoginKeys.USER_ID));
	//	String userName = JSONHelper.getStringValue(json, JSONHelper.convertKeyName(ReceiveLoginKeys.USER_NAME));
	//	String firstName = JSONHelper.getStringValue(json, JSONHelper.convertKeyName(ReceiveLoginKeys.FIRST_NAME));
	//	String lastName = JSONHelper.getStringValue(json, JSONHelper.convertKeyName(ReceiveLoginKeys.LAST_NAME));
	//	String email = JSONHelper.getStringValue(json, JSONHelper.convertKeyName(ReceiveLoginKeys.EMAIL));
	//	Long phoneNum = JSONHelper.getLongValue(json, JSONHelper.convertKeyName(ReceiveLoginKeys.PHONE_NUM));
	//	String secondaryEmail = JSONHelper.getStringValue(json, JSONHelper.convertKeyName(ReceiveLoginKeys.SECONDARY_EMAIL));
	//	// TODO look into time conversion more
	//	// put into JSONHelper?
	//
	//	User user = new User();
	//	user.setId(id);
	//	user.setUserName(userName);
	//	user.setFirstName(firstName);
	//	user.setLastName(lastName);
	//	user.setEmail(email);
	//	user.setPhoneNum(phoneNum);
	//	user.setSecondaryEmail(secondaryEmail);
	//
	//	// possibly use builder pattern if it is a lot of data
	//	ReceiveLoginAction action = new ReceiveLoginAction(user);	
	//
	//	return action;

}