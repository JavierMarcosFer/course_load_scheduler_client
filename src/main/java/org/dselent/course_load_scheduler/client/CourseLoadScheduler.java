package org.dselent.course_load_scheduler.client;

import org.dselent.course_load_scheduler.client.gin.Injector;
import org.dselent.course_load_scheduler.client.model.GlobalData;
import org.dselent.course_load_scheduler.client.presenter.AccountInfoPresenter;
import org.dselent.course_load_scheduler.client.presenter.impl.AccountInfoPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AddCoursePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AddInstancePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AddSectionPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AdminAddEditUserPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AdminHomepagePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.BasePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.CourseRegistrationCartPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.DetailedCourseInformationPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.FacultyCourseMapPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.IndexPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.InstructorHomepagePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.LoginPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.ReportProblemPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SearchClassesPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.ViewCurrentCoursesPresenterImpl;
import org.dselent.course_load_scheduler.client.service.impl.BaseServiceImpl;
import org.dselent.course_load_scheduler.client.service.impl.CourseServiceImpl;
import org.dselent.course_load_scheduler.client.service.impl.HomeServiceImpl;
import org.dselent.course_load_scheduler.client.service.impl.UserServiceImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.ExamplePresenterImpl;
import org.dselent.course_load_scheduler.client.view.AccountInfoView;
import org.dselent.course_load_scheduler.client.view.AddCourseView;
import org.dselent.course_load_scheduler.client.view.AddInstanceView;
import org.dselent.course_load_scheduler.client.view.AddSectionView;
import org.dselent.course_load_scheduler.client.view.IndexView;
import org.dselent.course_load_scheduler.client.view.examples.SimplePanelExample;
import org.dselent.course_load_scheduler.client.view.examples.TabLayoutPanelExample;
import org.dselent.course_load_scheduler.client.view.impl.AccountInfoViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.AddCourseViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.AddInstanceViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.AddSectionViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.AdminAddEditUserViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.AdminHomepageViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.CourseRegistrationCartViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.DetailedCourseInformationViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.FacultyCourseMapViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.IndexViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.InstructorHomepageViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.LoginViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.ReportProblemViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.SearchClassesViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.TestPanels;
import org.dselent.course_load_scheduler.client.view.impl.ViewCurrentCoursesViewImpl;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootLayoutPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class CourseLoadScheduler implements EntryPoint
{

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad()
	{
		RootLayoutPanel root = RootLayoutPanel.get();

		// Get the injector, which injected objects can be retrieved from
		final Injector injector = Injector.INSTANCE;

		CourseServiceImpl courseServiceImpl = injector.getCourseServiceImpl();
		courseServiceImpl.init();
		HomeServiceImpl homeServiceImpl = injector.getHomeServiceImpl();
		homeServiceImpl.init();
		UserServiceImpl userServiceImpl = injector.getUserServiceImpl();
		userServiceImpl.init();
		GlobalData data = injector.getGlobalModel();

		//Setup Index panel
		IndexPresenterImpl indexPresenter = injector.getIndexPresenter(); // on-demand injection
		indexPresenter.init();
		IndexView indexView = indexPresenter.getView();	
		indexPresenter.go(root);

		
		/*LOGIN*/
		LoginPresenterImpl loginPresenter = injector.getLoginPresenter();
		loginPresenter.init();
		loginPresenter.go(indexView.getMiddlePanel());
		
		/* INSTRUCTOR HOM"E"PAGE	*/	 // TODO: Doesn't Work
		InstructorHomepagePresenterImpl instructorHompagePresenter = injector.getInstructorHomepagePresenter();
		instructorHompagePresenter.init();
		//instructorHompagePresenter.go(indexView.getMiddlePanel());
		
		/* REPORT PROBLEM*/
		ReportProblemPresenterImpl reportProblemPresenter = injector.getReportProblemPresenter();
		reportProblemPresenter.init();
		//reportProblemPresenter.go(indexView.getMiddlePanel());

		/* SEARCH CLASSES*/
		SearchClassesPresenterImpl searchClassesPresenterPresenter = injector.getSearchClassesPresenter();
		searchClassesPresenterPresenter.init();
		//searchClassesPresenterPresenter.go(indexView.getMiddlePanel());

		/* VIEW CURRENT COURSES*/
		ViewCurrentCoursesPresenterImpl viewCurrentCoursesPresenter = injector.getViewCurrentCoursesPresenter();
		viewCurrentCoursesPresenter.init();
		//viewCurrentCoursesPresenter.go(indexView.getMiddlePanel());
		
		/* ACCOUNT INFO*/
		AccountInfoPresenterImpl accountInfoPresenter = injector.getAccountInfoPresenter();
		accountInfoPresenter.init();
		
		/* REGISTRATION CART*/
		CourseRegistrationCartPresenterImpl courseRegistrationCartPresenter = injector.getCourseRegistrationCartPresenter();
		courseRegistrationCartPresenter.init();
//		//courseRegistrationCartPresenter.go(indexView.getMiddlePanel());
		
		/* FACULTY */
		FacultyCourseMapPresenterImpl facultyCourseMapPresenter = injector.getFacultyCourseMapPresenter();
		facultyCourseMapPresenter.init();
//		//facultyCourseMapPresenter.go(indexView.getMiddlePanel());
		
		
		//JOSUE: ADMINISTRATOR SIDE (needs work)
//		/* ADD COURSE*/
//		AddCoursePresenterImpl addCoursePresenter = injector.getAddCoursePresenter(); 
//		addCoursePresenter.init();
//		//addCoursePresenter.go(indexView.getMiddlePanel());
//		
//		/* ADD INSTANCE*/
//		AddInstancePresenterImpl addInstancePresenter = injector.getAddInstancePresenter(); 
//		addInstancePresenter.init();
//		//addInstancePresenter.go(indexView.getMiddlePanel());
//
//		/* ADD SECTION*/
//		AddSectionPresenterImpl addSectionPresenter = injector.getAddSectionPresenter(); 
//		addSectionPresenter.init();
//		//addSectionPresenter.go(indexView.getMiddlePanel());
//
//		/*ADD EDIT USER*/
//		AdminAddEditUserPresenterImpl adminAddEditUserPresenter = injector.getAdminAddEditUserPresenter();
//		adminAddEditUserPresenter.init();
//		//adminAddEditUserPresenter.go(indexView.getMiddlePanel());
//
//		/* HOMEPAGE*/
//		AdminHomepagePresenterImpl adminHomepagePresenter = injector.getAdminHomepagePresenter();
//		adminHomepagePresenter.init();
//		//adminHomepagePresenter.go(indexView.getMiddlePanel());
//
//
//		/* COURSE INFROMATION*/
//		DetailedCourseInformationPresenterImpl detailedCourseInformationPresenter = injector.getDetailedCourseInformationPresenter();
//		detailedCourseInformationPresenter.init();
//		//detailedCourseInformationPresenter.go(indexView.getMiddlePanel());
//
//
	}
}
