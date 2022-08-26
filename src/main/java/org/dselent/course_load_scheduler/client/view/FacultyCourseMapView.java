/**
 * 
 */
package org.dselent.course_load_scheduler.client.view;

import org.dselent.course_load_scheduler.client.presenter.FacultyCourseMapPresenter;

import com.google.gwt.user.client.ui.FlexTable;

/**
 * @author bobbyshome
 *
 */
public interface FacultyCourseMapView extends BaseView<FacultyCourseMapPresenter> {
	public FlexTable getDataTable();
	public void setDataTable(FlexTable dataTable);
}
