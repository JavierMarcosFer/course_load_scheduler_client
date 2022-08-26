package org.dselent.course_load_scheduler.client.gin;

import org.dselent.course_load_scheduler.client.model.GlobalData;
import org.dselent.course_load_scheduler.client.presenter.AccountInfoPresenter;
import org.dselent.course_load_scheduler.client.presenter.AddCoursePresenter;
import org.dselent.course_load_scheduler.client.presenter.AddInstancePresenter;
import org.dselent.course_load_scheduler.client.presenter.AddSectionPresenter;
import org.dselent.course_load_scheduler.client.presenter.AdminAddEditUserPresenter;
import org.dselent.course_load_scheduler.client.presenter.AdminHomepagePresenter;
import org.dselent.course_load_scheduler.client.presenter.CourseRegistrationCartPresenter;
import org.dselent.course_load_scheduler.client.presenter.DetailedCourseInformationPresenter;
import org.dselent.course_load_scheduler.client.presenter.ExamplePresenter;
import org.dselent.course_load_scheduler.client.presenter.FacultyCourseMapPresenter;
import org.dselent.course_load_scheduler.client.presenter.IndexPresenter;
import org.dselent.course_load_scheduler.client.presenter.InstructorHomepagePresenter;
import org.dselent.course_load_scheduler.client.presenter.LoginPresenter;
import org.dselent.course_load_scheduler.client.presenter.ReportProblemPresenter;
import org.dselent.course_load_scheduler.client.presenter.SearchClassesPresenter;
import org.dselent.course_load_scheduler.client.presenter.ViewCurrentCoursesPresenter;
import org.dselent.course_load_scheduler.client.presenter.impl.AccountInfoPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AddCoursePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AddInstancePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AddSectionPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AdminAddEditUserPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.AdminHomepagePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.BasePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.CourseRegistrationCartPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.DetailedCourseInformationPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.ExamplePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.FacultyCourseMapPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.IndexPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.InstructorHomepagePresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.LoginPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.ReportProblemPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.SearchClassesPresenterImpl;
import org.dselent.course_load_scheduler.client.presenter.impl.ViewCurrentCoursesPresenterImpl;
import org.dselent.course_load_scheduler.client.service.BaseService;
import org.dselent.course_load_scheduler.client.service.CourseService;
import org.dselent.course_load_scheduler.client.service.HomeService;
import org.dselent.course_load_scheduler.client.service.UserService;
import org.dselent.course_load_scheduler.client.service.impl.BaseServiceImpl;
import org.dselent.course_load_scheduler.client.service.impl.CourseServiceImpl;
import org.dselent.course_load_scheduler.client.service.impl.HomeServiceImpl;
import org.dselent.course_load_scheduler.client.service.impl.UserServiceImpl;
import org.dselent.course_load_scheduler.client.view.AccountInfoView;
import org.dselent.course_load_scheduler.client.view.AddCourseView;
import org.dselent.course_load_scheduler.client.view.AddInstanceView;
import org.dselent.course_load_scheduler.client.view.AddSectionView;
import org.dselent.course_load_scheduler.client.view.AdminAddEditUserView;
import org.dselent.course_load_scheduler.client.view.AdminHomepageView;
import org.dselent.course_load_scheduler.client.view.CourseRegistrationCartView;
import org.dselent.course_load_scheduler.client.view.DetailedCourseInformationView;
import org.dselent.course_load_scheduler.client.view.ExampleView;
import org.dselent.course_load_scheduler.client.view.FacultyCourseMapView;
import org.dselent.course_load_scheduler.client.view.IndexView;
import org.dselent.course_load_scheduler.client.view.InstructorHomepageView;
import org.dselent.course_load_scheduler.client.view.LoginView;
import org.dselent.course_load_scheduler.client.view.ReportProblemView;
import org.dselent.course_load_scheduler.client.view.SearchClassesView;
import org.dselent.course_load_scheduler.client.view.ViewCurrentCoursesView;
import org.dselent.course_load_scheduler.client.view.impl.AccountInfoViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.AddCourseViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.AddInstanceViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.AddSectionViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.AdminAddEditUserViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.AdminHomepageViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.CourseRegistrationCartViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.DetailedCourseInformationViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.ExampleViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.FacultyCourseMapViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.IndexViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.InstructorHomepageViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.LoginViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.ReportProblemViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.SearchClassesViewImpl;
import org.dselent.course_load_scheduler.client.view.impl.ViewCurrentCoursesViewImpl;

import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.inject.client.AbstractGinModule;
import com.google.inject.Singleton;

/**
 * Module where all to-be-injected dependencies are defined
 * 
 * @author dselent
 *
 */
public class InjectorModule extends AbstractGinModule
{
	@Override
	protected void configure()
	{
		// event bus
		bind(SimpleEventBus.class).in(Singleton.class);

		// services
		bind(CourseService.class).to(CourseServiceImpl.class).in(Singleton.class);
		bind(HomeService.class).to(HomeServiceImpl.class).in(Singleton.class);
		bind(UserService.class).to(UserServiceImpl.class).in(Singleton.class);
		
		// presenters
		bind(IndexPresenter.class).to(IndexPresenterImpl.class).in(Singleton.class);
		bind(LoginPresenter.class).to(LoginPresenterImpl.class).in(Singleton.class);
		bind(AccountInfoPresenter.class).to(AccountInfoPresenterImpl.class).in(Singleton.class);
		bind(AddCoursePresenter.class).to(AddCoursePresenterImpl.class).in(Singleton.class);
		bind(AddInstancePresenter.class).to(AddInstancePresenterImpl.class).in(Singleton.class);
		bind(AddSectionPresenter.class).to(AddSectionPresenterImpl.class).in(Singleton.class);
		bind(AdminAddEditUserPresenter.class).to(AdminAddEditUserPresenterImpl.class).in(Singleton.class);
		bind(AdminHomepagePresenter.class).to(AdminHomepagePresenterImpl.class).in(Singleton.class);
		bind(CourseRegistrationCartPresenter.class).to(CourseRegistrationCartPresenterImpl.class).in(Singleton.class);
		bind(DetailedCourseInformationPresenter.class).to(DetailedCourseInformationPresenterImpl.class).in(Singleton.class);
		bind(FacultyCourseMapPresenter.class).to(FacultyCourseMapPresenterImpl.class).in(Singleton.class);
		bind(InstructorHomepagePresenter.class).to(InstructorHomepagePresenterImpl.class).in(Singleton.class);
		bind(ReportProblemPresenter.class).to(ReportProblemPresenterImpl.class).in(Singleton.class);
		bind(SearchClassesPresenter.class).to(SearchClassesPresenterImpl.class).in(Singleton.class);
		bind(ViewCurrentCoursesPresenter.class).to(ViewCurrentCoursesPresenterImpl.class).in(Singleton.class);
		bind(ExamplePresenter.class).to(ExamplePresenterImpl.class).in(Singleton.class);

		// views
		bind(IndexView.class).to(IndexViewImpl.class).in(Singleton.class);
		bind(LoginView.class).to(LoginViewImpl.class).in(Singleton.class);
		bind(AccountInfoView.class).to(AccountInfoViewImpl.class).in(Singleton.class);
		bind(AddCourseView.class).to(AddCourseViewImpl.class).in(Singleton.class);
		bind(AddInstanceView.class).to(AddInstanceViewImpl.class).in(Singleton.class);
		bind(AddSectionView.class).to(AddSectionViewImpl.class).in(Singleton.class);
		bind(AdminAddEditUserView.class).to(AdminAddEditUserViewImpl.class).in(Singleton.class);
		bind(AdminHomepageView.class).to(AdminHomepageViewImpl.class).in(Singleton.class);
		bind(CourseRegistrationCartView.class).to(CourseRegistrationCartViewImpl.class).in(Singleton.class);
		bind(DetailedCourseInformationView.class).to(DetailedCourseInformationViewImpl.class).in(Singleton.class);
		bind(FacultyCourseMapView.class).to(FacultyCourseMapViewImpl.class).in(Singleton.class);
		bind(InstructorHomepageView.class).to(InstructorHomepageViewImpl.class).in(Singleton.class);
		bind(ReportProblemView.class).to(ReportProblemViewImpl.class).in(Singleton.class);
		bind(SearchClassesView.class).to(SearchClassesViewImpl.class).in(Singleton.class);
		bind(ViewCurrentCoursesView.class).to(ViewCurrentCoursesViewImpl.class).in(Singleton.class);
		bind(ExampleView.class).to(ExampleViewImpl.class).in(Singleton.class);

		//model
		bind(GlobalData.class).in(Singleton.class);
	}

	/*
	 * Tried playing with this but had unresolved issues
	@Provides @Singleton @Inject
	public LoginPresenter provideLoginPresenter(IndexPresenter parentPresenter)
	{
	    return new LoginPresenter(parentPresenter);
	}
	 */
}