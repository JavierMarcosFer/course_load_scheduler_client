package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.AdminAddEditUserPresenter;
import org.dselent.course_load_scheduler.client.view.AdminAddEditUserView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.DoubleBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class AdminAddEditUserViewImpl extends BaseViewImpl<AdminAddEditUserPresenter> implements AdminAddEditUserView {

	private static AdminAddEditUserUiBinder uiBinder = GWT.create(AdminAddEditUserUiBinder.class);
	@UiField HTMLPanel rootPanel;
	@UiField TextBox firstNameField;
	@UiField TextBox lastNameField;
	@UiField TextBox emailField;
	@UiField DoubleBox requirementField;
	@UiField CheckBox adminCheckBox;
	@UiField Button submitButton;
	

	interface AdminAddEditUserUiBinder extends UiBinder<Widget, AdminAddEditUserViewImpl> {
	}

	public AdminAddEditUserViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public static AdminAddEditUserUiBinder getUiBinder() {
		return uiBinder;
	}

	public TextBox getFirstNameField() {
		return firstNameField;
	}

	public TextBox getLastNameField() {
		return lastNameField;
	}

	public TextBox getEmailField() {
		return emailField;
	}

	public DoubleBox getRequirementField() {
		return requirementField;
	}

	public CheckBox getAdminCheckBox() {
		return adminCheckBox;
	}

	public Button getSubmitButton() {
		return submitButton;
	}

	@Override
	public void setPresenter(AdminAddEditUserPresenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public Widget getWidgetContainer()
	{
		return this;
	}
	
	@Override
	public HasWidgets getViewRootPanel()
	{
		return rootPanel;
	}

	@UiHandler("submitButton")
	void onSubmitButtonClick(ClickEvent event) {
	}
}
