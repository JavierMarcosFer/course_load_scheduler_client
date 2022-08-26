package org.dselent.course_load_scheduler.client.network;

public final class NetworkRequestStrings
{
	public static final String SERVER_LOCATION = "http://localhost:8080/";
	public static final String BASE_REQUEST = "course_load_scheduler/";
	public static final String EDIT_USER = "user/edit";
	public static final String COURSE_SEARCH = "course/search";
	public static final String LOGIN = "login";
	public static final String ACCOUNT = "user/account";
	public static final String USER_INFO_UPDATE = "user/info/update";
	public static final String ADD_USER = "user/add";
	public static final String EDIT_COURSE = "course/edit";
	public static final String ADD_COURSE = "course/add";
	public static final String DELETE_COURSE = "course/delete";
	public static final String CURRENT_COURSES = "course/current"; //TODO, figure out what to do with this one in particular
	public static final String REPORT_PROBLEM = "home/report";
	public static final String ADD_TO_CART = "course/addToCart";
	public static final String COURSE_DETAILS = "course/details";
	public static final String REMOVE_FROM_CART = "cart/remove";
	public static final String DELETE_MESSAGE = "home/delete";
	
	private NetworkRequestStrings() {};
}