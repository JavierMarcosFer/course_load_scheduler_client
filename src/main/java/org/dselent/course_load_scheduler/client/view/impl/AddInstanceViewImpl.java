package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.AddInstancePresenter;
import org.dselent.course_load_scheduler.client.view.AddInstanceView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class AddInstanceViewImpl extends BaseViewImpl<AddInstancePresenter> implements AddInstanceView {

	private static AddInstanceUiBinder uiBinder = GWT.create(AddInstanceUiBinder.class);

	interface AddInstanceUiBinder extends UiBinder<Widget, AddInstanceViewImpl> {
	}

	public AddInstanceViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField HTMLPanel rootPanel;


	@UiField TextBox courseNumberHeader;
	@UiField TextBox instanceNumberHeader;
	@UiField TextBox termHeader;
	@UiField TextBox courseNumberField;
	@UiField TextBox instanceNumberField;
	@UiField ListBox termList;

	@UiField FlexTable sectionInfoList;
	@UiField ListBox sectionDropList;
	@UiField Button backButton;
	@UiField Button saveButton;
	@UiField Button deleteButton;
	@UiField LayoutPanel sectionInfoPanel;
	@UiField LayoutPanel saveDeletePanel;
	@UiField LayoutPanel instanceInfoPanel;
	
	@Override
	public void setPresenter(AddInstancePresenter presenter) {
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
	@UiHandler("deleteButton")
	void onDeleteButtonClick(ClickEvent event) {
	}
	@UiHandler("editSectionButton")
	void onEditSectionButtonClick(ClickEvent event) {
	}
	@UiHandler("createSectionButton")
	void onCreateSectionButtonClick(ClickEvent event) {
	}
	@UiHandler("saveButton")
	void onSaveButtonClicked(ClickEvent event) {
		presenter.saveInstance();
	}
	@UiHandler("backButton")
	void onBackButtonClick(ClickEvent event) {
	}
	@UiHandler("termList")
	void onTermListChange(ChangeEvent event) {
	}
	
	public static AddInstanceUiBinder getUiBinder() {
		return uiBinder;
	}
	public HTMLPanel getRootPanel() {
		return rootPanel;
	}
	public static void setUiBinder(AddInstanceUiBinder uiBinder) {
		AddInstanceViewImpl.uiBinder = uiBinder;
	}
	public void setRootPanel(HTMLPanel rootPanel) {
		this.rootPanel = rootPanel;
	}
	public void setCourseNumberHeader(TextBox courseNumberHeader) {
		this.courseNumberHeader = courseNumberHeader;
	}
	public void setInstanceNumberHeader(TextBox instanceNumberHeader) {
		this.instanceNumberHeader = instanceNumberHeader;
	}
	public void setTermHeader(TextBox termHeader) {
		this.termHeader = termHeader;
	}
	public void setCourseNumberField(TextBox courseNumberField) {
		this.courseNumberField = courseNumberField;
	}
	public void setInstanceNumberField(TextBox instanceNumberField) {
		this.instanceNumberField = instanceNumberField;
	}
	public void setTermList(ListBox termList) {
		this.termList = termList;
	}
	public void setSectionInfoList(FlexTable sectionInfoList) {
		this.sectionInfoList = sectionInfoList;
	}
	public void setSectionDropList(ListBox sectionDropList) {
		this.sectionDropList = sectionDropList;
	}
	public void setBackButton(Button backButton) {
		this.backButton = backButton;
	}
	public void setSaveButton(Button saveButton) {
		this.saveButton = saveButton;
	}
	public void setDeleteButton(Button deleteButton) {
		this.deleteButton = deleteButton;
	}
	public void setSectionInfoPanel(LayoutPanel sectionInfoPanel) {
		this.sectionInfoPanel = sectionInfoPanel;
	}
	public void setSaveDeletePanel(LayoutPanel saveDeletePanel) {
		this.saveDeletePanel = saveDeletePanel;
	}
	public void setInstanceInfoPanel(LayoutPanel instanceInfoPanel) {
		this.instanceInfoPanel = instanceInfoPanel;
	}
	public TextBox getCourseNumberHeader() {
		return courseNumberHeader;
	}
	public TextBox getInstanceNumberHeader() {
		return instanceNumberHeader;
	}
	public TextBox getTermHeader() {
		return termHeader;
	}
	public FlexTable getSectionInfoList() {
		return sectionInfoList;
	}
	public Button getBackButton() {
		return backButton;
	}
	public Button getDeleteButton() {
		return deleteButton;
	}
	public LayoutPanel getSectionInfoPanel() {
		return sectionInfoPanel;
	}
	public LayoutPanel getSaveDeletePanel() {
		return saveDeletePanel;
	}
	public LayoutPanel getInstanceInfoPanel() {
		return instanceInfoPanel;
	}
	public Button getSaveButton() {
		return saveButton;
	}
	public TextBox getCourseNumberField() {
		return courseNumberField;
	}
	public TextBox getInstanceNumberField() {
		return instanceNumberField;
	}
	public ListBox getTermList() {
		return termList;
	}
	public ListBox getSectionDropList() {
		return sectionDropList;
	}
	


}
