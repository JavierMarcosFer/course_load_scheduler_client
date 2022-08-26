package org.dselent.course_load_scheduler.client.service;

import org.dselent.course_load_scheduler.client.event.AddCourseEvent;
import org.dselent.course_load_scheduler.client.event.AddToCartEvent;
import org.dselent.course_load_scheduler.client.event.CourseSearchEvent;
import org.dselent.course_load_scheduler.client.event.DeleteCourseEvent;
import org.dselent.course_load_scheduler.client.event.EditCourseEvent;
import org.dselent.course_load_scheduler.client.event.GetCourseDetailsEvent;
import org.dselent.course_load_scheduler.client.event.RemoveCourseFromCartEvent;
import org.dselent.course_load_scheduler.client.event.SendSubmitRegistrationCartEvent;

public interface CourseService extends BaseService{
	void onCourseSearch(CourseSearchEvent evt);
	
	void onEditCourse(EditCourseEvent evt);
	
	void onAddCourse(AddCourseEvent evt);
	
	void onDeleteCourse(DeleteCourseEvent evt);
	
	void onAddToCart(AddToCartEvent evt);
	
	void onSubmitCart(SendSubmitRegistrationCartEvent evt);
	
	void onGetCourseDetails(GetCourseDetailsEvent evt);
	
	void onRemoveCourseFromCart(RemoveCourseFromCartEvent evt);
}
