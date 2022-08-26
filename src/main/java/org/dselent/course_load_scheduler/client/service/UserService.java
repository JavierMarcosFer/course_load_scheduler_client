package org.dselent.course_load_scheduler.client.service;

import org.dselent.course_load_scheduler.client.event.AddUserEvent;
import org.dselent.course_load_scheduler.client.event.DeleteUserEvent;
import org.dselent.course_load_scheduler.client.event.EditUserEvent;
import org.dselent.course_load_scheduler.client.event.SendAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.event.UpdateAccountEvent;

public interface UserService extends BaseService
{
	public void onSendLogin(SendLoginEvent evt);
	
	public void onSendAccountInfo(SendAccountInfoEvent evt);
	
	public void onUpdateAccount(UpdateAccountEvent evt);
	
	public void onAddUser(AddUserEvent evt);
	
	public void onEditUser(EditUserEvent evt);
	
	public void onDeleteUser(DeleteUserEvent evt);
}