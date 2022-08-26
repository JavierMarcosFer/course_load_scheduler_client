package org.dselent.course_load_scheduler.client.service.impl;

import org.dselent.course_load_scheduler.client.action.AddUserAction;
import org.dselent.course_load_scheduler.client.action.DeleteUserAction;
import org.dselent.course_load_scheduler.client.action.EditUserAction;
import org.dselent.course_load_scheduler.client.action.SendAccountInfoAction;
import org.dselent.course_load_scheduler.client.action.SendLoginAction;
import org.dselent.course_load_scheduler.client.action.SendUpdateAccountInfoAction;
import org.dselent.course_load_scheduler.client.callback.AccountInfoCallback;
import org.dselent.course_load_scheduler.client.callback.AddUserCallback;
import org.dselent.course_load_scheduler.client.callback.DeleteUserCallback;
import org.dselent.course_load_scheduler.client.callback.EditUserCallback;
import org.dselent.course_load_scheduler.client.callback.SendLoginCallback;
import org.dselent.course_load_scheduler.client.callback.UpdateAccountCallback;
import org.dselent.course_load_scheduler.client.event.AddUserEvent;
import org.dselent.course_load_scheduler.client.event.DeleteUserEvent;
import org.dselent.course_load_scheduler.client.event.EditUserEvent;
import org.dselent.course_load_scheduler.client.event.GetFacultyEvent;
import org.dselent.course_load_scheduler.client.event.SendAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.event.UpdateAccountEvent;
import org.dselent.course_load_scheduler.client.network.NetworkRequest;
import org.dselent.course_load_scheduler.client.network.NetworkRequestStrings;
import org.dselent.course_load_scheduler.client.service.UserService;
import org.dselent.course_load_scheduler.client.translator.impl.AccountInfoTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.AddUserActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.DeleteUserActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.EditUserActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.LoginActionTranslatorImpl;
import org.dselent.course_load_scheduler.client.translator.impl.UpdateAccountInfoActionTranslatorImpl;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.json.client.JSONObject;

public class UserServiceImpl extends BaseServiceImpl implements UserService
{
	public UserServiceImpl()
	{
		
	}
	
	@Override
	public void init()
	{
		bind();
	}

	@Override
	public void bind()
	{
		HandlerRegistration registration;
		
		registration = eventBus.addHandler(SendLoginEvent.TYPE, this);
		eventBusRegistration.put(SendLoginEvent.TYPE, registration);
		
		registration = eventBus.addHandler(SendAccountInfoEvent.TYPE, this);
		eventBusRegistration.put(SendAccountInfoEvent.TYPE, registration);
		
		registration = eventBus.addHandler(UpdateAccountEvent.TYPE, this);
		eventBusRegistration.put(UpdateAccountEvent.TYPE, registration);
		
		registration = eventBus.addHandler(AddUserEvent.TYPE, this);
		eventBusRegistration.put(AddUserEvent.TYPE, registration);
		
		registration = eventBus.addHandler(EditUserEvent.TYPE, this);
		eventBusRegistration.put(EditUserEvent.TYPE, registration);
		
		registration = eventBus.addHandler(DeleteUserEvent.TYPE, this);
		eventBusRegistration.put(DeleteUserEvent.TYPE, registration);
	}
	
	@Override
	public void onSendLogin(SendLoginEvent evt)
	{
		SendLoginAction action = evt.getAction();
		LoginActionTranslatorImpl loginActionTranslator = new LoginActionTranslatorImpl();
		JSONObject json = loginActionTranslator.translateToJson(action);
		SendLoginCallback loginCallback = new SendLoginCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.LOGIN, loginCallback, json);
		request.send();
	}
	
	@Override
	public void onSendAccountInfo(SendAccountInfoEvent evt)
	{
		SendAccountInfoAction action = evt.getAction();
		AccountInfoTranslatorImpl sendAccountInfoActionTranslator = new AccountInfoTranslatorImpl();
		JSONObject json = sendAccountInfoActionTranslator.translateToJson(action);
		AccountInfoCallback sendAccountInfoCallback = new AccountInfoCallback(eventBus, evt.getContainer());
		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.LOGIN, sendAccountInfoCallback, json);
		request.send();
	}
	
	@Override
	public void onUpdateAccount(UpdateAccountEvent evt) {
		SendUpdateAccountInfoAction action = evt.getAction();
		UpdateAccountInfoActionTranslatorImpl accountInfoActionTranslator = new UpdateAccountInfoActionTranslatorImpl();
		JSONObject json = accountInfoActionTranslator.translateToJson(action);
		UpdateAccountCallback accountCallback = new UpdateAccountCallback(eventBus, evt.getContainer());

		//network request here
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.USER_INFO_UPDATE, accountCallback, json);
		request.send();

		//WARNING: will return nothing but errors until the relevant actions match up properly with the server side services and responses

	}
	
	public void onGetFaculty(GetFacultyEvent evt) {
		
	}
	
	public void onAddUser(AddUserEvent evt) {
		AddUserAction action = evt.getAction();
		AddUserActionTranslatorImpl addUserActionTranslatorImpl = new AddUserActionTranslatorImpl();
		JSONObject json = addUserActionTranslatorImpl.translateToJson(action);
		AddUserCallback addUserCallback = new AddUserCallback(eventBus, evt.getContainer());

		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.ADD_USER, addUserCallback, json);
		request.send();
	}
	
	public void onEditUser(EditUserEvent evt) {
		EditUserAction action = evt.getAction();
		EditUserActionTranslatorImpl editUserActionTranslatorImpl = new EditUserActionTranslatorImpl();
		JSONObject json = editUserActionTranslatorImpl.translateToJson(action);
		EditUserCallback editUserCallback = new EditUserCallback(eventBus, evt.getContainer());

		//network request here
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.EDIT_USER, editUserCallback, json);
		request.send();
	}
	
	public void onDeleteUser(DeleteUserEvent evt) {
		DeleteUserAction action = evt.getAction();
		DeleteUserActionTranslatorImpl deleteUserActionTranslatorImpl = new DeleteUserActionTranslatorImpl();
		JSONObject json = deleteUserActionTranslatorImpl.translateToJson(action);
		DeleteUserCallback deleteUserCallback = new DeleteUserCallback(eventBus, evt.getContainer());

		
		NetworkRequest request = new NetworkRequest(NetworkRequestStrings.ADD_USER, deleteUserCallback, json);
		request.send();
	}
}