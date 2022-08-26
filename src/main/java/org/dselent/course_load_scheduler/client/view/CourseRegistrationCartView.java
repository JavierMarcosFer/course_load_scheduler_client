package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.CourseRegistrationCartPresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;

public interface CourseRegistrationCartView extends BaseView<CourseRegistrationCartPresenter>{
	public Button getSubmitForApproval();
	public Button getRemoveCourse();
	public FlexTable getFlexTableFor();
}
