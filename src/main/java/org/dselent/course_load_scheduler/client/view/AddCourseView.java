package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.AddCoursePresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;

public interface AddCourseView extends BaseView<AddCoursePresenter>{
	
	public TextBox getCourseNumberField();

	public TextBox getCourseNameField();

	public TextBox getTypeField();
	
	public ListBox getLevelList();
	
	public TextBox getDepartmentField();
	
	public IntegerBox getCourseIdField();

	public TextArea getCourseDescField();
	
	public Button getSaveCourseButton();
	
	public Button getDeleteCourseButton();
	
	public Button getEditInstanceButton();
	
	public Button getCreateInstanceButton();
	
	public ListBox getInstanceList();
}
