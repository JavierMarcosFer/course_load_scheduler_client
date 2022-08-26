package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.ReportProblemPresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.TextArea;

public interface ReportProblemView extends BaseView<ReportProblemPresenter> {
	
	public ListBox getTypeList();
	public void setTypeList(ListBox typeList);
	public TextArea getDescriptionArea();
	public void setDescriptionArea(TextArea descriptionArea);
	public Button getSubmitButton();
	
}
