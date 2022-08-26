package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.FacultyCourseMapPresenter;
import org.dselent.course_load_scheduler.client.view.FacultyCourseMapView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.LayoutPanel;

public class FacultyCourseMapViewImpl extends BaseViewImpl<FacultyCourseMapPresenter> implements FacultyCourseMapView {
	//will need to modify to make table work properly
	private static FacultyCourseMapViewImplUiBinder uiBinder = GWT.create(FacultyCourseMapViewImplUiBinder.class);
	@UiField Label titleLabel;
	@UiField FlexTable dataTable;
	@UiField HTMLPanel rootPanel;
	@UiField LayoutPanel layoutPanel;

	interface FacultyCourseMapViewImplUiBinder extends UiBinder<Widget, FacultyCourseMapViewImpl> {
	}

	public FacultyCourseMapViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		
		FlexTable t = new FlexTable();
		
		t.setText(0, 0, "Faculty");
		t.setText(0, 1, "# of courses");
		t.setText(0, 2, "Assigned Courses");
		
		//for loops to present appropriate number of cells, assuming  that I don't just move all of this back a layer or two.
		
		//set up column spans and so forth
		
		setDataTable(t);
		
	}

	public FlexTable getDataTable() {
		return dataTable;
	}

	public void setDataTable(FlexTable dataTable) {
		this.dataTable = dataTable;
	}

	@Override
	public void setPresenter(FacultyCourseMapPresenter presenter) {
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

}
