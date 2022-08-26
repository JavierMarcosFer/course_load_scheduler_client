package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.DetailedCourseInformationPresenter;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.IntegerBox;
import com.google.gwt.user.client.ui.TextBox;

public interface DetailedCourseInformationView extends BaseView<DetailedCourseInformationPresenter>{

	//TextBoxes
	public TextBox getCourseName();
	public TextBox getCourseNumber();
	public TextBox getLevel();
	public IntegerBox getExpectedPopulation();
	public TextBox getDescription();
	public TextBox getMeetingDays();
	
	//Buttons
	public Button getReturnToSearchButton();
	public Button getSubmitToCartButton();
}
