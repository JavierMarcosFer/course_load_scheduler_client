package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.InstructorHomepagePresenter;
import org.dselent.course_load_scheduler.client.view.InstructorHomepageView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class InstructorHomepageViewImpl extends BaseViewImpl<InstructorHomepagePresenter> implements InstructorHomepageView {

	private static InstructorHomepageUiBinder uiBinder = GWT.create(InstructorHomepageUiBinder.class);
	@UiField HTMLPanel rootPanel;
	@UiField LayoutPanel layoutPanel;
	@UiField HorizontalPanel selectPanel;
	@UiField Button currentClassButton;
	@UiField Button classSearchButton;
	@UiField Button accountInfoButton;
	@UiField Button courseCartButton;
	@UiField Button facultyCourseMapButton;

	interface InstructorHomepageUiBinder extends UiBinder<Widget, InstructorHomepageViewImpl> {
	}

	public InstructorHomepageViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	public static InstructorHomepageUiBinder getUiBinder() {
		return uiBinder;
	}
	
	@Override
	public void setPresenter(InstructorHomepagePresenter presenter) {
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
	
	//need to add the button clicks and so forth

	/**
	 * @return the layoutPanel
	 */
	public LayoutPanel getLayoutPanel() {
		return layoutPanel;
	}

	/**
	 * @param layoutPanel the layoutPanel to set
	 */
	public void setLayoutPanel(LayoutPanel layoutPanel) {
		this.layoutPanel = layoutPanel;
	}

		/**
	 * @return the selectPanel
	 */
	public HorizontalPanel getSelectPanel() {
		return selectPanel;
	}

	/**
	 * @return the currentClassButton
	 */
	public Button getCurrentClassButton() {
		return currentClassButton;
	}

	/**
	 * @return the classSearchButton
	 */
	public Button getClassSearchButton() {
		return classSearchButton;
	}

	/**
	 * @return the accountInfoButton
	 */
	public Button getAccountInfoButton() {
		return accountInfoButton;
	}
	
	public void setAccountInfoButton(Button accountInfoButton) {
		this.accountInfoButton = accountInfoButton;
	}
	/**
	 * @return the courseCartButton
	 */
	public Button getCourseCartButton() {
		return courseCartButton;
	}

	/**
	 * @return the generateScheduleButton
	 */
	public Button getGenerateScheduleButton() {
		return facultyCourseMapButton;
	}

	
	@UiHandler("currentClassButton")
	void onCurrentClassButtonClicked(ClickEvent evt) {
		presenter.currentClasses();
	}
	
	@UiHandler("classSearchButton")
	void onClassSearchButtonClicked(ClickEvent evt) {
		presenter.classSearch();
	}
	
	@UiHandler("accountInfoButton")
	void onAccountInfoButtonClicked(ClickEvent evt) {
		presenter.accountInfo();
	}
	
	@UiHandler("courseCartButton")
	void onCourseCartButtonClicked(ClickEvent evt) {
		presenter.courseCart();
	}
	
	@UiHandler("facultyCourseMapButton")
	void onfacultyCourseMapButtonClicked(ClickEvent evt) {
		presenter.facultyCourseMap();
	}
	/*
	@UiHandler("generateScheduleButton")
	void onGenerateScheduleButtonClicked(ClickEvent evt) {
		presenter.generateSchedule();
	}
	*/
}
