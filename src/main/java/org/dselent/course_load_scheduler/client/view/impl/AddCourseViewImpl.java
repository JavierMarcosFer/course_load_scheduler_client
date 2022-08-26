package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.AddCoursePresenter;
import org.dselent.course_load_scheduler.client.view.AddCourseView;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class AddCourseViewImpl extends BaseViewImpl<AddCoursePresenter> implements AddCourseView {

	private static AddCourseViewImplUiBinder uiBinder = GWT.create(AddCourseViewImplUiBinder.class);

	interface AddCourseViewImplUiBinder extends UiBinder<Widget, AddCourseViewImpl> {
	}

	@UiField TextBox courseNumberField;
	@UiField TextBox courseNameField;
	@UiField TextBox typeField;
	@UiField ListBox levelList;
	@UiField TextBox departmentField;
	@UiField TextArea courseDescField;
	
	@UiField Button saveCourseButton;
	@UiField Button deleteCourseButton;
	
	@UiField Button editInstanceButton;
	@UiField Button createInstanceButton;
	@UiField ListBox instanceList;
	
	@UiField HTMLPanel rootPanel;
	@UiField IntegerBox courseIdField;

	public AddCourseViewImpl()
	{
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	public TextBox getCourseNumberField() {
		return courseNumberField;
	}

	public TextBox getCourseNameField() {
		return courseNameField;
	}

	public TextBox getTypeField() {
		return typeField;
	}

	public ListBox getLevelList() {
		return levelList;
	}

	public TextBox getDepartmentField() {
		return departmentField;
	}

	public TextArea getCourseDescField() {
		return courseDescField;
	}

	public Button getSaveCourseButton() {
		return saveCourseButton;
	}

	public Button getDeleteCourseButton() {
		return deleteCourseButton;
	}

	public Button getEditInstanceButton() {
		return editInstanceButton;
	}

	public Button getCreateInstanceButton() {
		return createInstanceButton;
	}

	public ListBox getInstanceList() {
		return instanceList;
	}
	
	public IntegerBox getCourseIdField() {
		return courseIdField;
	}

	@Override
	public void setPresenter(AddCoursePresenter presenter) {
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

	
	@UiHandler("saveCourseButton")
	void onSaveCourseButtonClick(ClickEvent event) {
		presenter.saveChanges();
	}
	
	@UiHandler("deleteCourseButton")
	void onDeleteCourseButtonClick(ClickEvent event) {
		presenter.deleteCourse();
	}
	
	@UiHandler("createInstanceButton")
	void onCreateInstanceButtonClick(ClickEvent event) {
		presenter.createInstance();
	}
	
	@UiHandler("editInstanceButton")
	void onEditInstanceButtonClick(ClickEvent event) {
		presenter.editInstance();
	}
	
}
