package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.AdminHomepagePresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.ListBox;

public interface AdminHomepageView extends BaseView<AdminHomepagePresenter>{
	
	public Button getAccountInfoButton();
	public Button getAddUser();
	public Button getEditUser();
	public Button getAddCourse();
	public Button getModifyCourse();
	public Button getGeneratedCompleteDepartmentSchedule();
	public Button getCurrentClassesButton();
	public Button getSearchClassesButton();
	public Button getCourseRegistrationCart();
	public ListBox getInboxList();
}
