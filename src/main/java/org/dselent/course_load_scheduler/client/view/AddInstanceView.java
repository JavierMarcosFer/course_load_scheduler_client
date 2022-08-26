package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.AddInstancePresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextBox;

public interface AddInstanceView extends BaseView<AddInstancePresenter>{
	
	public TextBox getCourseNumberField();
	public TextBox getInstanceNumberField();
	public ListBox getTermList();
	public Button getSaveButton();
	public ListBox getSectionDropList();
	public Button getDeleteButton();
	public Button getBackButton();
	public FlexTable getSectionInfoList();
}
