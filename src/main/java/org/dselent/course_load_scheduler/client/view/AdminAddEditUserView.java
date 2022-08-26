package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.AdminAddEditUserPresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.DoubleBox;
import com.google.gwt.user.client.ui.TextBox;

public interface AdminAddEditUserView extends BaseView<AdminAddEditUserPresenter>{

	public TextBox getFirstNameField();
	
	public TextBox getLastNameField();
	
	public TextBox getEmailField();
	
	public DoubleBox getRequirementField();
	
	public CheckBox getAdminCheckBox();
	
	public Button getSubmitButton();
	
}