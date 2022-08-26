package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.AdminHomepagePresenter;
import org.dselent.course_load_scheduler.client.view.AdminHomepageView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Widget;

public class AdminHomepageViewImpl extends BaseViewImpl<AdminHomepagePresenter> implements AdminHomepageView {

	private static AdminHomepageViewImplUiBinder uiBinder = GWT.create(AdminHomepageViewImplUiBinder.class);
	@UiField HTMLPanel rootPanel;
	@UiField ListBox departmentList;
	@UiField ListBox inboxList;
	@UiField Button addUserButton;
	@UiField Button editUserButton;
	@UiField Button addCourseButton;
	@UiField Button modifyCourseButton;
	@UiField Button generatedCompleteDepartmentSchedule;
	@UiField ListBox registeredCoursesList;
	@UiField ListBox pendingCoursesList;
	@UiField Button currentClassesButton;
	@UiField Button searchClassesButton;
	@UiField Button accountInfoButton;
	@UiField Button courseRegistrationCartButton;
	@UiField Label inboxLabel;
	@UiField Button approveButton;
	@UiField Button denyButton;

	interface AdminHomepageViewImplUiBinder extends UiBinder<Widget, AdminHomepageViewImpl> {
	}

	public AdminHomepageViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public static AdminHomepageViewImplUiBinder getUiBinder() {
		return uiBinder;
	}

	public Button getAccountInfoButton() {
		return accountInfoButton;
	}

	public void setAccountInfoButton(Button accountInfoButton) {
		this.accountInfoButton = accountInfoButton;
	}

	public HTMLPanel rootPanel() {
		return rootPanel;
	}
	public ListBox departmentList() {
		return departmentList;
	}
	public ListBox getInboxList() {
		return inboxList;
	}
	public ListBox registeredCoursesList() {
		return registeredCoursesList;
	}
	public ListBox pendingCoursesList() {
		return pendingCoursesList;
	}
	public Label inboxLabel() {
		return inboxLabel;
	}
	public Button getAddUser() {
		return addUserButton;
	}

	public Button getEditUser() {
		return editUserButton;
	}

	public Button getAddCourse() {
		return addCourseButton;
	}

	public Button getModifyCourse() {
		return modifyCourseButton;
	}

	public Button getGeneratedCompleteDepartmentSchedule() {
		return generatedCompleteDepartmentSchedule;
	}

	public Button getCurrentClassesButton() {
		return currentClassesButton;
	}

	public Button getSearchClassesButton() {
		return searchClassesButton;
	}

	public Button getCourseRegistrationCart() {
		return courseRegistrationCartButton;
	}

	@Override
	public void setPresenter(AdminHomepagePresenter presenter) {
		this.presenter = presenter;
	}

	@Override
	public Widget getWidgetContainer() {
		return this;
	}

	@Override
	public HasWidgets getViewRootPanel() {
		return rootPanel;
	}
	
	@UiHandler("addUserButton")
	void onAddUserButtonClick(ClickEvent event) {
		presenter.goToAddUser();
	}
	
	@UiHandler("editUserButton")
	void onEditUserButtonClick(ClickEvent event) {
		presenter.goToEditUser();
	}
	
	@UiHandler("addCourseButton")
	void onAddCourseButtonClick(ClickEvent event) {
		presenter.goToAddCourse();
	}
	
	@UiHandler("modifyCourseButton")
	void onModifyCourseButtonClick(ClickEvent event) {
		presenter.goToModifyCourse();
	}
	
	@UiHandler("generatedCompleteDepartmentSchedule")
	void onGeneratedCompleteDepartmentScheduleClick(ClickEvent event) {
		
	}
	
	@UiHandler("currentClassesButton")
	void onCurrentClassesButtonClick(ClickEvent event) {
		presenter.goToCurrentClasses();
	}
	
	@UiHandler("searchClassesButton")
	void onSearchClassesButtonClick(ClickEvent event) {
		presenter.goToSearchClasses();
	}

	@UiHandler("accountInfoButton")
	void onAccountInfoButtonClick(ClickEvent event) {
		presenter.goToAcctInfo();
	}
	
	@UiHandler("courseRegistrationCartButton")
	void onCourseRegistrationCartButtonClick(ClickEvent event) {
		presenter.goToCart();
	}
}
