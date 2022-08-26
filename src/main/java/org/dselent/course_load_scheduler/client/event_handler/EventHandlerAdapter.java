package org.dselent.course_load_scheduler.client.event_handler;

import org.dselent.course_load_scheduler.client.event.AddCourseEvent;
import org.dselent.course_load_scheduler.client.event.AddInstanceEvent;
import org.dselent.course_load_scheduler.client.event.AddSectionEvent;
import org.dselent.course_load_scheduler.client.event.AddToCartEvent;
import org.dselent.course_load_scheduler.client.event.AddUserEvent;
import org.dselent.course_load_scheduler.client.event.CourseSearchEvent;
import org.dselent.course_load_scheduler.client.event.CurrentCoursesEvent;
import org.dselent.course_load_scheduler.client.event.DeleteCourseEvent;
import org.dselent.course_load_scheduler.client.event.DeleteInstanceEvent;
import org.dselent.course_load_scheduler.client.event.DeleteSectionEvent;
import org.dselent.course_load_scheduler.client.event.DeleteUserEvent;
import org.dselent.course_load_scheduler.client.event.EditCourseEvent;
import org.dselent.course_load_scheduler.client.event.EditUserEvent;
import org.dselent.course_load_scheduler.client.event.GetCourseDetailsEvent;
import org.dselent.course_load_scheduler.client.event.GetFacultyEvent;
import org.dselent.course_load_scheduler.client.event.GoToAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.GoToAddCourseEvent;
import org.dselent.course_load_scheduler.client.event.GoToAddEditUserEvent;
import org.dselent.course_load_scheduler.client.event.GoToAdminHomeEvent;
import org.dselent.course_load_scheduler.client.event.GoToCartEvent;
import org.dselent.course_load_scheduler.client.event.GoToClassSearchEvent;
import org.dselent.course_load_scheduler.client.event.GoToCurrentCoursesEvent;
import org.dselent.course_load_scheduler.client.event.GoToDetailedCourseInformationEvent;
import org.dselent.course_load_scheduler.client.event.GoToEditCourseEvent;
import org.dselent.course_load_scheduler.client.event.GoToEditInstanceEvent;
import org.dselent.course_load_scheduler.client.event.GoToEditSectionEvent;
import org.dselent.course_load_scheduler.client.event.GoToFacultyCourseMapEvent;
import org.dselent.course_load_scheduler.client.event.GoToInstructorHomeEvent;
import org.dselent.course_load_scheduler.client.event.GoToLogoutEvent;
import org.dselent.course_load_scheduler.client.event.GoToReportAProblemEvent;
import org.dselent.course_load_scheduler.client.event.InvalidAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.InvalidCourseEvent;
import org.dselent.course_load_scheduler.client.event.InvalidCourseIdEvent;
import org.dselent.course_load_scheduler.client.event.InvalidInstanceEvent;
import org.dselent.course_load_scheduler.client.event.InvalidLoginEvent;
import org.dselent.course_load_scheduler.client.event.InvalidReportEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveAddCourseEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveAddUserEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveCourseCartRemoveCourseEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveCourseSearchEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveInboxInfoEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveLoginEvent;
import org.dselent.course_load_scheduler.client.event.ReceiveSubmitRegistrationCartEvent;
import org.dselent.course_load_scheduler.client.event.RemoveCourseFromCartEvent;
import org.dselent.course_load_scheduler.client.event.SaveInstanceEvent;
import org.dselent.course_load_scheduler.client.event.SaveSectionEvent;
import org.dselent.course_load_scheduler.client.event.SendAccountInfoEvent;
import org.dselent.course_load_scheduler.client.event.SendCourseCartRemoveCourseEvent;
import org.dselent.course_load_scheduler.client.event.SendDeleteMessageEvent;
import org.dselent.course_load_scheduler.client.event.SendLoginEvent;
import org.dselent.course_load_scheduler.client.event.SendReportEvent;
import org.dselent.course_load_scheduler.client.event.SendRespondMessageEvent;
import org.dselent.course_load_scheduler.client.event.SendSubmitRegistrationCartEvent;
import org.dselent.course_load_scheduler.client.event.UpdateAccountEvent;

/**
 * Adapter class for convenience
 * All classes that need to implement an event handler can extend from this class
 * This allows for presenters or other classes not to implement a large number of handler interfaces
 * Need to register all event handling functions with this class by implementing the handler and
 * overriding with an empty method
 * 
 * @author dselent
 *    adminhome, logout, reportprob
 */
public abstract class EventHandlerAdapter
implements InvalidLoginEventHandler, SendLoginEventHandler, InvalidCourseEventHandler, ReceiveLoginEventHandler, AddCourseEventHandler, AddInstanceEventHandler, AddSectionEventHandler,
AddUserEventHandler, SendSubmitRegistrationCartEventHandler, DeleteCourseEventHandler, DeleteInstanceEventHandler, DeleteSectionEventHandler, EditCourseEventHandler, 
EditUserEventHandler, GetFacultyEventHandler, GoToAccountInfoEventHandler, GoToAddCourseEventHandler, GoToAddEditUserEventHandler, GoToCartEventHandler, GoToClassSearchEventHandler,
GoToCurrentCoursesEventHandler, GoToEditCourseEventHandler, GoToEditInstanceEventHandler, GoToEditSectionEventHandler, InvalidCourseIdEventHandler, InvalidInstanceEventHandler, 
InvalidReportEventHandler, SaveInstanceEventHandler, SaveSectionEventHandler, SendReportEventHandler, UpdateAccountEventHandler, InvalidAccountInfoEventHandler, AddToCartEventHandler, 
GoToFacultyCourseMapEventHandler, ReceiveAddCourseEventHandler, GoToInstructorHomeEventHandler, GoToAdminHomeEventHandler, GoToLogoutEventHandler, GoToReportAProblemEventHandler,
ReceiveAccountInfoEventHandler, SendAccountInfoEventHandler, GoToDetailedCourseInformationEventHandler, CourseSearchEventHandler, ReceiveCourseSearchEventHandler, ReceiveAddUserEventHandler, ReceiveSubmitRegistrationCartEventHandler,
SendCourseCartRemoveCourseEventHandler, ReceiveCourseCartRemoveCourseEventHandler, CurrentCoursesEventHandler, GetCourseDetailsEventHandler, RemoveCourseFromCartEventHandler,
DeleteUserEventHandler, SendDeleteMessageEventHandler, SendRespondMessageEventHandler, ReceiveInboxInfoEventHandler
{
	@Override
	public void onReceiveInboxInfo(ReceiveInboxInfoEvent evt) {}
	
	@Override
	public void onSendRespondMessage(SendRespondMessageEvent evt) {}
	
	@Override
	public void onSendDeleteMessage(SendDeleteMessageEvent evt) {}
	
	@Override
	public void onDeleteUser(DeleteUserEvent evt) {}
	
	@Override
	public void onRemoveCourseFromCart(RemoveCourseFromCartEvent evt) {}
	
	@Override
	public void onGetCourseDetails(GetCourseDetailsEvent evt) {}
	
	@Override
	public void onCurrentCourses(CurrentCoursesEvent evt) {}
	
	@Override
	public void onReceiveAddUser(ReceiveAddUserEvent evt) {}
	
	@Override
	public void onReceiveCourseSearch(ReceiveCourseSearchEvent evt) {}
	
	@Override
	public void onCourseSearch(CourseSearchEvent evt) {}
	
	@Override
	public void onSendAccountInfo(SendAccountInfoEvent evt) {}
	
	@Override
	public void onReceiveAccountInfo(ReceiveAccountInfoEvent evt) {}
	
	@Override
	public void onGoToReportAProblem(GoToReportAProblemEvent evt) {}
	
	@Override
	public void onGoToLogout(GoToLogoutEvent evt) {}
	
	@Override
	public void onGoToAdminHome(GoToAdminHomeEvent evt) {}
	
	@Override
	public void onGoToInstructorHome(GoToInstructorHomeEvent evt) {}
	
	@Override
	public void onUpdateAccount(UpdateAccountEvent evt) {}
	
	@Override
	public void onSendReport(SendReportEvent evt) {}
	
	@Override
	public void onSaveSection(SaveSectionEvent evt) {}
	
	@Override
	public void onSaveInstance(SaveInstanceEvent evt) {}
	
	@Override
	public void onInvalidReport(InvalidReportEvent evt) {}
	
	@Override
	public void onInvalidInstance(InvalidInstanceEvent evt) {}
	
	@Override
	public void onInvalidCourseId(InvalidCourseIdEvent evt) {}
	
	@Override
	public void onGoToEditSection(GoToEditSectionEvent evt) {}
	
	@Override
	public void onGoToInstanceEdit(GoToEditInstanceEvent evt) {}
	
	@Override
	public void onGoToEditCourse(GoToEditCourseEvent evt) {}
	
	@Override
	public void onGoToCurrentCourses(GoToCurrentCoursesEvent evt) {}
	
	@Override
	public void onGoToClassSearch(GoToClassSearchEvent evt) {}
	
	@Override
	public void onGoToCart(GoToCartEvent evt) {}
	
	@Override
	public void onGoToAddEditUser(GoToAddEditUserEvent evt) {}
	
	@Override
	public void onGoToAddCourse(GoToAddCourseEvent evt) {}
	
	@Override
	public void onGoToAccountInfo(GoToAccountInfoEvent evt) {}
	
	@Override
	public void onGetFaculty(GetFacultyEvent evt) {}
	
	@Override
	public void onEditUser(EditUserEvent evt) {}
	
	@Override
	public void onEditCourse(EditCourseEvent evt) {}
	
	@Override
	public void onInvalidLogin(InvalidLoginEvent evt) {}
	
	@Override
	public void onSendLogin(SendLoginEvent evt) {}
	
	@Override
	public void onInvalidCourse(InvalidCourseEvent evt) {}
	
	@Override
	public void onReceiveLogin(ReceiveLoginEvent evt) {}
	
	@Override
	public void onAddCourse(AddCourseEvent evt) {}
	
	@Override
	public void onAddInstance(AddInstanceEvent evt) {}
	
	@Override
	public void onAddSection(AddSectionEvent evt) {}
	
	@Override
	public void onAddUser(AddUserEvent evt) {}
	
	@Override
	public void onSubmitCart(SendSubmitRegistrationCartEvent evt) {}
	
	@Override
	public void onDeleteCourse(DeleteCourseEvent evt) {}
	
	@Override
	public void onDeleteInstance(DeleteInstanceEvent evt) {}
	
	@Override
	public void onDeleteSection(DeleteSectionEvent evt) {}
	
	@Override
	public void onInvalidAccountInfo(InvalidAccountInfoEvent evt) {}
	
	@Override
	public void onSendSubmitCourseToCart(AddToCartEvent evt) {}
	
	@Override
	public void onGoToFacultyCourseMap(GoToFacultyCourseMapEvent evt) {}
	
	@Override
	public void onReceiveAddCourse(ReceiveAddCourseEvent evt) {}
	
	@Override
	public void onGoToDetailedCourseInformation(GoToDetailedCourseInformationEvent evt) {}
	
	@Override
	public void onReceiveSubmitRegistrationCart(ReceiveSubmitRegistrationCartEvent evt) {}
	
	@Override
	public void onCartRemoveCourse(SendCourseCartRemoveCourseEvent evt) {}
	
	@Override
	public void onReceiveCourseCartRemoveCourseEventHandler(ReceiveCourseCartRemoveCourseEvent evt) {}
}
