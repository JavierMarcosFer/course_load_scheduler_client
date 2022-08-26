package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.AddSectionPresenter;
import org.dselent.course_load_scheduler.client.view.AddSectionView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class AddSectionViewImpl extends BaseViewImpl<AddSectionPresenter> implements AddSectionView{

	private static AddSectionViewImplUiBinder uiBinder = GWT.create(AddSectionViewImplUiBinder.class);

	interface AddSectionViewImplUiBinder extends UiBinder<Widget, AddSectionViewImpl> {
	}

	public AddSectionViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField HTMLPanel rootPanel;
	@UiField TextBox courseNumberHeader;
	@UiField TextBox instanceNumberHeader;
	@UiField TextBox sectionNumberHeader;
	@UiField TextBox courseNumberField;
	@UiField IntegerBox instanceNumberField;
	@UiField IntegerBox sectionNumberField;
	@UiField TextBox expectedPopHeader;
	@UiField TextBox typeHeader;
	@UiField IntegerBox expectedPopField;
	@UiField TextBox typeField;
	@UiField TextBox daysHeader;
	@UiField CheckBox mondayCheck;
	@UiField CheckBox tuesdayCheck;
	@UiField CheckBox wednesdayCheck;
	@UiField CheckBox thursdayCheck;
	@UiField CheckBox fridayCheck;
	@UiField Label timeStartSeparator;
	@UiField Label timeEndSeparator;
	@UiField IntegerBox startMinutesField;
	@UiField IntegerBox startHoursField;
	@UiField IntegerBox endMinutesField;
	@UiField IntegerBox endHoursField;
	@UiField Button saveButton;
	@UiField Button deleteButton;
	@UiField Button backButton;
	@UiField LayoutPanel saveDeletePanel;
	@UiField LayoutPanel detailsPanel;
	@UiField LayoutPanel sectionInfoPanel;
	public static AddSectionViewImplUiBinder getUiBinder() {
		return uiBinder;
	}
	public HTMLPanel getRootPanel() {
		return rootPanel;
	}
	public TextBox getCourseNumberHeader() {
		return courseNumberHeader;
	}
	public TextBox getInstanceNumberHeader() {
		return instanceNumberHeader;
	}
	public TextBox getSectionNumberHeader() {
		return sectionNumberHeader;
	}
	public TextBox getCourseNumberField() {
		return courseNumberField;
	}
	public IntegerBox getInstanceNumberField() {
		return instanceNumberField;
	}
	public IntegerBox getSectionNumberField() {
		return sectionNumberField;
	}
	public TextBox getExpectedPopHeader() {
		return expectedPopHeader;
	}
	public TextBox getTypeHeader() {
		return typeHeader;
	}
	public IntegerBox getExpectedPopField() {
		return expectedPopField;
	}
	public TextBox getTypeField() {
		return typeField;
	}
	public TextBox getDaysHeader() {
		return daysHeader;
	}
	public CheckBox getMondayCheck() {
		return mondayCheck;
	}
	public CheckBox getTuesdayCheck() {
		return tuesdayCheck;
	}
	public CheckBox getWednesdayCheck() {
		return wednesdayCheck;
	}
	public CheckBox getThursdayCheck() {
		return thursdayCheck;
	}
	public CheckBox getFridayCheck() {
		return fridayCheck;
	}
	public Label getTimeStartSeparator() {
		return timeStartSeparator;
	}
	public Label getTimeEndSeparator() {
		return timeEndSeparator;
	}
	public IntegerBox getStartMinutesField() {
		return startMinutesField;
	}
	public IntegerBox getStartHoursField() {
		return startHoursField;
	}
	public IntegerBox getEndMinutesField() {
		return endMinutesField;
	}
	public IntegerBox getEndHoursField() {
		return endHoursField;
	}
	public Button getSaveButton() {
		return saveButton;
	}
	public Button getDeleteButton() {
		return deleteButton;
	}
	public Button getBackButton() {
		return backButton;
	}
	public LayoutPanel getSaveDeletePanel() {
		return saveDeletePanel;
	}
	public LayoutPanel getDetailsPanel() {
		return detailsPanel;
	}
	public LayoutPanel getSectionInfoPanel() {
		return sectionInfoPanel;
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
	@Override
	public void setPresenter(AddSectionPresenter presenter)
	{
		this.presenter = presenter;
	}
	
	//Button
	@UiHandler("saveButton")
	void onSaveButtonClicked(ClickEvent evt)
	{
		//Either add a section 
		presenter.addSection();
		//OR got edit 
		presenter.goToInstanceEdit();
	}
	
	@UiHandler("deleteButton")
	void onDeleteButtonClicked(ClickEvent evt)
	{
		presenter.deleteSection();
	}
	
	@UiHandler("backButton")
	void onBackClicked(ClickEvent evt)
	{
		presenter.goToInstanceEdit();
	}
	
	//Setters
	
	@Override
	public void setCourseNumberHeaderTextBox(TextBox courseNumberHeader) {
		this.courseNumberHeader = courseNumberHeader;
	}
	
	@Override
	public void setInstanceNumberHeaderTextBox(TextBox instanceNumberHeader) {
		this.instanceNumberHeader = instanceNumberHeader;
	}
	
	@Override
	public void setSectionNumberHeaderTextBox(TextBox sectionNumberHeader) {
		this.sectionNumberHeader = sectionNumberHeader;
	}
	
	@Override
	public void setCourseNumberFieldTextBox(TextBox courseNumberField) {
		this.courseNumberField = courseNumberField;
	}
	
	@Override
	public void setExpectedPopHeaderTextBox(TextBox expectedPopHeader) {
		this.expectedPopHeader = expectedPopHeader;
		
	}
	@Override
	public void setTypeHeaderTextBox(TextBox typeHeader) {
		this.typeHeader = typeHeader; 
		
	}
	@Override
	public void setTypeFieldTextBox(TextBox typeField) {
		this.typeField = typeField;
		
	}
	@Override
	public void setDaysHeaderTextBox(TextBox daysHeader) {
		this.daysHeader = daysHeader;
		
	}
	@Override
	public void setInstanceNumberFieldIntegerBox(IntegerBox instanceNumberField) {
		this.instanceNumberField = instanceNumberField;
		
	}
	@Override
	public void setSectionNumberFieldIntegerBox(IntegerBox sectionNumberField) {
		this.sectionNumberField = sectionNumberField;
		
	}
	@Override
	public void setExpectedPopFieldIntegerBox(IntegerBox expectedPopField) {
		this.expectedPopField = expectedPopField;
		
	}
	@Override
	public void setMondayCheckBox(CheckBox mondayCheck) {
		this.mondayCheck = mondayCheck;
		
	}
	@Override
	public void setTuesdayCheckBox(CheckBox tuesdayCheck) {
		this.tuesdayCheck = tuesdayCheck;
		
	}
	@Override
	public void setWednesdayCheckBox(CheckBox wednesdayCheck) {
		this.wednesdayCheck = wednesdayCheck;
		
	}
	@Override
	public void setThursdayCheckBox(CheckBox thursdayCheck) {
		this.thursdayCheck = thursdayCheck;
		
	}
	@Override
	public void setFridayCheckBox(CheckBox fridayCheck) {
		this.fridayCheck = fridayCheck;
		
	}
	@Override
	public void setStartMinutesFieldIntegerBox(IntegerBox startMinutesField) {
		this.startMinutesField = startMinutesField;
		
	}
	@Override
	public void setStartHoursFieldIntegerBox(IntegerBox startHoursField) {
		this.startHoursField = startHoursField;
		
	}
	@Override
	public void setEndMinutesFieldIntegerBox(IntegerBox endMinutesField) {
		this.endMinutesField = endMinutesField;
		
	}
	@Override
	public void setEndHoursFieldIntegerBox(IntegerBox endHoursField) {
		this.endHoursField = endHoursField;
		
	}	
	
}