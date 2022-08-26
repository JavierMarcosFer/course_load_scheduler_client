package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.AddSectionPresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.TextBox;

public interface AddSectionView extends BaseView<AddSectionPresenter>{
	public HTMLPanel getRootPanel();
	
	public TextBox getCourseNumberHeader();
	void setCourseNumberHeaderTextBox(TextBox courseNumberHeader);
	public TextBox getInstanceNumberHeader();
	void setInstanceNumberHeaderTextBox(TextBox instanceNumberHeader);
	public TextBox getSectionNumberHeader();
	void setSectionNumberHeaderTextBox(TextBox sectionNumberHeader);
	public TextBox getCourseNumberField();
	void setCourseNumberFieldTextBox(TextBox courseNumberField);
	public TextBox getExpectedPopHeader();
	void setExpectedPopHeaderTextBox(TextBox expectedPopHeader);
	public TextBox getTypeHeader();
	void setTypeHeaderTextBox(TextBox typeHeader);
	public TextBox getTypeField();
	void setTypeFieldTextBox(TextBox typeField);
	public TextBox getDaysHeader();
	void setDaysHeaderTextBox(TextBox daysHeader);
	
	
	public IntegerBox getInstanceNumberField();
	void setInstanceNumberFieldIntegerBox(IntegerBox instanceNumberField);
	public IntegerBox getSectionNumberField();
	void setSectionNumberFieldIntegerBox(IntegerBox sectionNumberField);
	public IntegerBox getExpectedPopField();
	void setExpectedPopFieldIntegerBox(IntegerBox expectedPopField);
	

	public CheckBox getMondayCheck();
	void setMondayCheckBox(CheckBox mondayCheck);
	public CheckBox getTuesdayCheck();
	void setTuesdayCheckBox(CheckBox tuesdayCheck);
	public CheckBox getWednesdayCheck();
	void setWednesdayCheckBox(CheckBox wednesdayCheck);
	public CheckBox getThursdayCheck();
	void setThursdayCheckBox(CheckBox thursdayCheck);
	public CheckBox getFridayCheck();
	void setFridayCheckBox(CheckBox fridayCheck);
	
	
	public Label getTimeStartSeparator();
	public Label getTimeEndSeparator();
	
	
	public IntegerBox getStartMinutesField();
	void setStartMinutesFieldIntegerBox(IntegerBox startMinutesField);
	public IntegerBox getStartHoursField();
	void setStartHoursFieldIntegerBox(IntegerBox startHoursField);
	public IntegerBox getEndMinutesField();
	void setEndMinutesFieldIntegerBox(IntegerBox endMinutesField);
	public IntegerBox getEndHoursField();
	void setEndHoursFieldIntegerBox(IntegerBox endHoursField);
	
	
	public Button getSaveButton();
	public Button getDeleteButton();
	public Button getBackButton();
	
	
	public LayoutPanel getSaveDeletePanel();
	public LayoutPanel getDetailsPanel();
	public LayoutPanel getSectionInfoPanel();
}