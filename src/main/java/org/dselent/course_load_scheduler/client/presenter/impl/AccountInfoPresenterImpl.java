package org.dselent.course_load_scheduler.client.presenter.impl;

import java.util.ArrayList;

import org.dselent.course_load_scheduler.client.action.GoToInstructorHomeAction;
import org.dselent.course_load_scheduler.client.action.InvalidAccountInfoAction;
import org.dselent.course_load_scheduler.client.action.SendAccountInfoAction;
import org.dselent.course_load_scheduler.client.action.SendUpdateAccountInfoAction;
import org.dselent.course_load_scheduler.client.event.GoToAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.GoToInstructorHomeEvent;
import org.dselent.course_load_scheduler.client.event.InvalidAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.SendAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.UpdateAccountEvent;
import org.dselent.course_load_scheduler.client.presenter.AccountInfoPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.view.AccountInfoView;

import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.inject.Inject;

public class AccountInfoPresenterImpl extends BasePresenterImpl implements AccountInfoPresenter{
	
	private IndexPresenter parentPresenter;
	private AccountInfoView view;
	private boolean accountInfoClickInProgress;
	
	@Inject
	public AccountInfoPresenterImpl(IndexPresenter parentPresenter, AccountInfoView view)
	{
		this.view = view;
		this.parentPresenter = parentPresenter;
		view.setPresenter(this);
		accountInfoClickInProgress = false;
//		Integer userId = parentPresenter.getGlobalData().getUserInfo().getId();
//		HasWidgets container = parentPresenter.getView().getMiddlePanel();
//		SendAccountInfoAction saia = new SendAccountInfoAction(userId);
//		SendAccountInfoEvent saie = new SendAccountInfoEvent(saia, container);
//		eventBus.fireEvent(saie);
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
		
		//registration = eventBus.addHandler(InvalidAccountInfoEvent.TYPE, this);
		registration = eventBus.addHandler(GoToAccountInfoEvent.TYPE, this);
		//registration = eventBus.addHandler(ReceiveAccountInfoEvent.TYPE, this);
		//eventBusRegistration.put(ReceiveAccountInfoEvent.TYPE, registration);
		//eventBusRegistration.put(InvalidAccountInfoEvent.TYPE, registration);
		eventBusRegistration.put(GoToAccountInfoEvent.TYPE, registration);
	}
		
	@Override
	public void go(HasWidgets container)
	{
		container.clear();
		container.add(view.getWidgetContainer());
	}

	@Override
	public AccountInfoView getView()
	{
		return view;
	}
	
	@Override
	public IndexPresenter getParentPresenter()
	{
		return parentPresenter;
	}

	@Override
	public void setParentPresenter(IndexPresenter parentPresenter)
	{
		this.parentPresenter = parentPresenter;
	}
	
	public void changeAccountInfo() {
		//TODO: add checks for valid inputs: (@wpi.edu, phoneNum is a number), also add exceptions
		if (!accountInfoClickInProgress) 
		{
			accountInfoClickInProgress = true;
			view.getSubmitChangesButton().setEnabled(false);
			
			String currentPassword = view.getCurrPassword().getValue();
			String newPassword = view.getNewPassword().getValue();
			String repeatPassword= view.getRepeatNewPassword().getValue();
			String preferedEmail = view.getPreferedEmail().getValue();
			Integer phoneNumber = view.getPhoneNumber().getValue();
			boolean isPasswordValid;
			boolean repeatIsCorrect;
			boolean validEmail;
			
			ArrayList<String> invalidReasonList = new ArrayList<>();
			
			//Check if fields either pass requirements or are empty
			if (newPassword.compareTo("") == 0 && repeatPassword.compareTo("") == 0 ) {
				isPasswordValid = true;
				repeatIsCorrect = true;
			}
			
			if (preferedEmail.compareTo("") == 0)
				validEmail = true;
			
			isPasswordValid = isPasswordValid(newPassword);
			repeatIsCorrect = isRepeatCorrect(view.getNewPassword().getValue(), view.getRepeatNewPassword().getValue());
			validEmail = view.getPreferedEmail().getValue().endsWith("@wpi.edu");	//email ends with "@wpi.edu"
			
			if(isPasswordValid && repeatIsCorrect && validEmail) {
				updateInfo(currentPassword, newPassword, preferedEmail, phoneNumber);
			}
			else {
					if(!isPasswordValid) {
						invalidReasonList.add("Invalid password.");
					}
					if(!repeatIsCorrect) {
						invalidReasonList.add("Passwords do not match.");
					}
					if(!validEmail) {
						invalidReasonList.add("Invalid Email.");
					}
					InvalidAccountInfoAction iaa = new InvalidAccountInfoAction(invalidReasonList);
					InvalidAccountInfoEvent iae = new InvalidAccountInfoEvent(iaa);
					eventBus.fireEvent(iae);
			}
		}
	}
	
	//Passing these in, some can be null, if so, service layer will find out
	public void updateInfo (String currentPassword, String newPassword, String newEmail, Integer newPhoneNum) {
		HasWidgets container = parentPresenter.getView().getMiddlePanel();
		SendUpdateAccountInfoAction uaa = new SendUpdateAccountInfoAction(currentPassword, newPassword, newEmail, newPhoneNum);
		UpdateAccountEvent uae = new UpdateAccountEvent(uaa, container);
		eventBus.fireEvent(uae);
	}
	
	private boolean isRepeatCorrect(String newPassword, String repeatPassword){
		if (newPassword.equals(repeatPassword))
			return true;
		else
			return false;
	}

	private boolean isPasswordValid(String newPassword) {
		if (newPassword.length() > 4)
			return true;
		else
			return false;
	}
	
	public void submitChanges() {

		if(!accountInfoClickInProgress) {
			accountInfoClickInProgress = false;
			view.getSubmitChangesButton().setEnabled(true);
			
			HasWidgets container = parentPresenter.getView().getMiddlePanel();
			GoToInstructorHomeAction ihaee = new GoToInstructorHomeAction();
			GoToInstructorHomeEvent iheee = new GoToInstructorHomeEvent(ihaee, container);
			eventBus.fireEvent(iheee);
			
		}
	}
	
	@Override
	public void onGoToAccountInfo(GoToAccountInfoEvent evt) {
		this.go(evt.getContainer());
	}
	
	public void onReceiveAccountInfo(ReceiveAccountInfoEvent evt) {
		view.setUserName(evt.getAction().getModel().getUserName());
		view.setEmail(evt.getAction().getModel().getEmail());
		view.setRequirement(evt.getAction().getModel().getReqCourses());
	}
}
