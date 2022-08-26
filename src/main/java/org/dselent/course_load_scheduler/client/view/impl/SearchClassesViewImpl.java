
package org.dselent.course_load_scheduler.client.view.impl;

import org.dselent.course_load_scheduler.client.presenter.SearchClassesPresenter;
import org.dselent.course_load_scheduler.client.view.SearchClassesView;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasWidgets;
import com.google.gwt.user.client.ui.LayoutPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class SearchClassesViewImpl extends BaseViewImpl<SearchClassesPresenter> implements SearchClassesView {

	private static SearchClassesViewImplUiBinder uiBinder = GWT.create(SearchClassesViewImplUiBinder.class);
	@UiField HTMLPanel rootPanel;
	@UiField LayoutPanel topPanel;
	@UiField ListBox term;
	@UiField ListBox subject;
	@UiField Button searchButton;
	@UiField ListBox level;
	@UiField Grid gridCourses;
	@UiField ScrollPanel scrollPanel;
	@UiField LayoutPanel bottomPanel;
	

	interface SearchClassesViewImplUiBinder extends UiBinder<Widget, SearchClassesViewImpl> {
	}

	public SearchClassesViewImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		
		term.addItem("A");
		term.addItem("B");
		term.addItem("C");
		term.addItem("D");
		term.addItem("E1");
		term.addItem("E2");
		
		subject.addItem("Biology");
		subject.addItem("Computer Science");
		subject.addItem("Robotics");
		subject.addItem("Electrical & Computer Engineering");
		subject.addItem("Chemistry");
		subject.addItem("Physics");
		subject.addItem("Physical Education");
		
		level.addItem("Undergraduate");
		level.addItem("Graduate");
	
//		String [] a = {"Select the specified term(s)","Terms A & B", "Terms C & D", "Terms E1 & E2", "Term A", "Term B", "Term C", "Term D", "Term E1", "Term E2"};
//		String [] b = {"Select the subject type","Biology", "Computer Science", "Electrical Engineering", "Physics", "Physical Education"};
//		String [] c = {"Select the level type","Undergraduate", "Graduate"};
//		for(String i:a){term.addItem(i);}
//		for(String i:b){subject.addItem(i);}
//		for(String i:c){level.addItem(i);}
//		
//		RootPanel.get().add(term);
//		RootPanel.get().add(subject);
//		RootPanel.get().add(level);
//		
//		for (int i = 0; i < gridCourses.getRowCount(); i++) {
//			for (int j=0; j < 5; j++){
//				String text = "";
//				gridCourses.setText(i, j, text);
//				
//			}
//		}
		
		//JOSUE: hard coded
//		
//		for (int i = 0; i < 1; i++) {
//			for (int j=0; j < 5; j++){
//				
//				int s = i+j;
//					String text[] = {"Object Oriented Design Concepts","registered","2102","MTRF","300"};
//				
//				gridCourses.setText(i, j, text[s]);
//				
//			}
//		}
	} 

	@Override
	public void setPresenter(SearchClassesPresenter presenter) {
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


	
	@UiHandler("searchButton")
	void onSearchButtonClick(ClickEvent event) {
		presenter.searchCourses();
		}

	public static SearchClassesViewImplUiBinder getUiBinder() {
		return uiBinder;
	}

	public static void setUiBinder(SearchClassesViewImplUiBinder uiBinder) {
		SearchClassesViewImpl.uiBinder = uiBinder;
	}

	public HTMLPanel getRootPanel() {
		return rootPanel;
	}

	public void setRootPanel(HTMLPanel rootPanel) {
		this.rootPanel = rootPanel;
	}

	public LayoutPanel getTopPanel() {
		return topPanel;
	}

	public void setTopPanel(LayoutPanel topPanel) {
		this.topPanel = topPanel;
	}

	public ListBox getTerm() {
		return term;
	}

	public void setTerm(ListBox term) {
		this.term = term;
	}

	public ListBox getSubject() {
		return subject;
	}

	public void setSubject(ListBox subject) {
		this.subject = subject;
	}

	public Button getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(Button searchButton) {
		this.searchButton = searchButton;
	}

	public ListBox getLevel() {
		return level;
	}

	public void setLevel(ListBox level) {
		this.level = level;
	}

	public Grid getGridCourses() {
		return gridCourses;
	}

	public void setGridCourses(Grid gridCourses) {
		this.gridCourses = gridCourses;
	}

	public ScrollPanel getScrollPanel() {
		return scrollPanel;
	}

	public void setScrollPanel(ScrollPanel scrollPanel) {
		this.scrollPanel = scrollPanel;
	}

	public LayoutPanel getBottomPanel() {
		return bottomPanel;
	}

	public void setBottomPanel(LayoutPanel bottomPanel) {
		this.bottomPanel = bottomPanel;
	}
	
}
