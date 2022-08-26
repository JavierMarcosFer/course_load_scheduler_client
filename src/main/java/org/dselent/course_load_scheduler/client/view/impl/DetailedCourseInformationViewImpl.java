package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.DetailedCourseInformationPresenter;
import org.dselent.course_load_scheduler.client.view.DetailedCourseInformationView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.IntegerBox;

public class DetailedCourseInformationViewImpl extends BaseViewImpl<DetailedCourseInformationPresenter> implements DetailedCourseInformationView {

	private static DetailedCourseInformationViewImplUiBinder uiBinder = GWT
			.create(DetailedCourseInformationViewImplUiBinder.class);
	
	@UiField TextBox description;
	@UiField Button submitToCartButton;
	@UiField Button returnToSearchButton;
	@UiField LayoutPanel LayoutPanel;
	@UiField HTMLPanel rootPanel;
	@UiField TextBox courseName;
	@UiField TextBox courseNumber;
	@UiField TextBox level;
	@UiField IntegerBox expectedPopulation;
	@UiField TextBox meetingDays;

	/**
	 * @return the description
	 */
	public TextBox getDescription() {
		return description;
	}

	/**
	 * @return the submitToCartButton
	 */
	public Button getSubmitToCartButton() {
		return submitToCartButton;
	}
	
	/**
	 * @return the returnToSearchButton
	 */
	public Button getReturnToSearchButton() {
		return returnToSearchButton;
	}
	
	/**
	 * @return the layoutPanel
	 */
	public LayoutPanel getLayoutPanel() {
		return LayoutPanel;
	}
	
	/**
	 * @return the courseName
	 */
	public TextBox getCourseName() {
		return courseName;
	}
	
	/**
	 * @return the courseNumber
	 */
	public TextBox getCourseNumber() {
		return courseNumber;
	}
	
	/**
	 * @return the level
	 */
	public TextBox getLevel() {
		return level;
	}
	
	/**
	 * @return the expectedPopulation
	 */
	public IntegerBox getExpectedPopulation() {
		return expectedPopulation;
	}
	
	/**
	 * @return the meetingDays
	 */
	public TextBox getMeetingDays() {
		return meetingDays;
	}
	
	interface DetailedCourseInformationViewImplUiBinder extends UiBinder<Widget, DetailedCourseInformationViewImpl> {
	}
	
	public DetailedCourseInformationViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}
	
	@Override
	public void setPresenter(DetailedCourseInformationPresenter presenter) {
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
	
	@UiHandler("submitToCartButton")
	void onSubmitToCartButtonClicked(ClickEvent evt) {
		presenter.submitToCart();
	}
	
	@UiHandler("returnToSearchButton")
	void onReturnToSearchButtonClicked(ClickEvent evt) {
		presenter.returnToSearch();
	}
}
