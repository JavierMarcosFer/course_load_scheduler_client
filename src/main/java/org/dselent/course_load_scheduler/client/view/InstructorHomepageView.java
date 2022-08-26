package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.InstructorHomepagePresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.LayoutPanel;

public interface InstructorHomepageView extends BaseView<InstructorHomepagePresenter> {
	
	public LayoutPanel getLayoutPanel();
	public void setLayoutPanel(LayoutPanel layoutPanel);
	public HorizontalPanel getSelectPanel();
	public Button getCurrentClassButton();
	public Button getClassSearchButton();
	public Button getAccountInfoButton();
	public Button getCourseCartButton();
	public Button getGenerateScheduleButton();
	
}
