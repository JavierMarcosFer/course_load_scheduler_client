package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.ViewCurrentCoursesPresenter;
import org.dselent.course_load_scheduler.client.view.ViewCurrentCoursesView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;

public class ViewCurrentCoursesViewImpl extends BaseViewImpl<ViewCurrentCoursesPresenter> implements ViewCurrentCoursesView {

	private static ViewCurrentCoursesViewImplUiBinder uiBinder = GWT.create(ViewCurrentCoursesViewImplUiBinder.class);
	@UiField LayoutPanel currentCourses;
	@UiField LayoutPanel detailedSchedule;
	@UiField ScrollPanel panelForScrollingCourseTable;
	@UiField ScrollPanel panelForScrollingDetailedSchedule;
	@UiField FlexTable tableDisplayCurrentCourses;
	@UiField FlexTable tableDisplayDetailedSchedule;
	@UiField HTMLPanel rootPanel;

	interface ViewCurrentCoursesViewImplUiBinder extends UiBinder<Widget, ViewCurrentCoursesViewImpl> {
	}

	public ViewCurrentCoursesViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));

	    // Create the text fields (This table is a K x 5, with K being the number of courses they have registered for)
		tableDisplayCurrentCourses.setText(0, 0, "Course Name");
		tableDisplayCurrentCourses.setText(0, 1, "Course Number");
		tableDisplayCurrentCourses.setText(0, 2, "Term");
		tableDisplayCurrentCourses.setText(0, 3, "Instance ID");
		tableDisplayCurrentCourses.setText(0, 4, "Status");
		
		tableDisplayDetailedSchedule.setText(0, 0, "Times");
		tableDisplayDetailedSchedule.setText(0, 1, "Mon");
		tableDisplayDetailedSchedule.setText(0, 2, "Tue");
		tableDisplayDetailedSchedule.setText(0, 3, "Wed");
		tableDisplayDetailedSchedule.setText(0, 4, "Thur");
		tableDisplayDetailedSchedule.setText(0, 5, "Fri");
		tableDisplayDetailedSchedule.setText(1, 0, "8:00 AM");
		tableDisplayDetailedSchedule.setText(2, 0, "9:00 AM");
		tableDisplayDetailedSchedule.setText(3, 0, "10:00 AM");
		tableDisplayDetailedSchedule.setText(4, 0, "11:00 AM");
		tableDisplayDetailedSchedule.setText(5, 0, "12:00 PM");
		tableDisplayDetailedSchedule.setText(5, 0, "1:00 PM");
		tableDisplayDetailedSchedule.setText(6, 0, "2:00 PM");
		tableDisplayDetailedSchedule.setText(7, 0, "3:00 PM");
		tableDisplayDetailedSchedule.setText(8, 0, "4:00 PM");
		tableDisplayDetailedSchedule.setText(9, 0, "5:00 PM");
		tableDisplayDetailedSchedule.setText(10, 0, "6:00 PM");
		tableDisplayDetailedSchedule.setText(11, 0, "7:00 PM");
		tableDisplayDetailedSchedule.setText(12, 0, "8:00 PM");
//		panelForScrollingCourseTable.add(tableDisplayCurrentCourses);
//		panelForScrollingDetailedSchedule.add(tableDisplayDetailedSchedule);

		
	}

	@Override
	public void setPresenter(ViewCurrentCoursesPresenter presenter) {
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

	public LayoutPanel getCurrentCourses() {
		return currentCourses;
	}

	public void setCurrentCourses(LayoutPanel currentCourses) {
		this.currentCourses = currentCourses;
	}

	public LayoutPanel getDetailedSchedule() {
		return detailedSchedule;
	}

	public void setDetailedSchedule(LayoutPanel detailedSchedule) {
		this.detailedSchedule = detailedSchedule;
	}

	public ScrollPanel getPanelForScrollingCourseTable() {
		return panelForScrollingCourseTable;
	}

	public void setPanelForScrollingCourseTable(ScrollPanel panelForScrollingCourseTable) {
		this.panelForScrollingCourseTable = panelForScrollingCourseTable;
	}

	public ScrollPanel getPanelForScrollingDetailedSchedule() {
		return panelForScrollingDetailedSchedule;
	}

	public void setPanelForScrollingDetailedSchedule(ScrollPanel panelForScrollingDetailedSchedule) {
		this.panelForScrollingDetailedSchedule = panelForScrollingDetailedSchedule;
	}

	public FlexTable getTableDisplayCurrentCourses() {
		return tableDisplayCurrentCourses;
	}

	public void setTableDisplayCurrentCourses(FlexTable tableDisplayCurrentCourses) {
		this.tableDisplayCurrentCourses = tableDisplayCurrentCourses;
	}

	public FlexTable getTableDisplayDetailedSchedule() {
		return tableDisplayDetailedSchedule;
	}

	public void setTableDisplayDetailedSchedule(FlexTable tableDisplayDetailedSchedule) {
		this.tableDisplayDetailedSchedule = tableDisplayDetailedSchedule;
	}

	public HTMLPanel getRootPanel() {
		return rootPanel;
	}

	public void setRootPanel(HTMLPanel rootPanel) {
		this.rootPanel = rootPanel;
	}

}
