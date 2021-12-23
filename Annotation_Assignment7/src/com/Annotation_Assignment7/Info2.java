package com.Annotation_Assignment7;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.sql.*;


@Retention(RUNTIME)
@Target(METHOD)
@interface info{}
public class Info2 {
	
	
	@info
	public void authorid(int auth_id) {
	System.out.println("authorid"+auth_id); 
	}
	
	@info
	public void author(String author) {
	System.out.println("author "+author); }
	
	@info
	public void date(java.util.Date date) {
	System.out.println("Date  "+date);
	}
	
	@info
	public void time(Time time) {
	System.out.println("time "+time);
	}
	
	@info
	public void version(double d) {
	System.out.println("Version "+d);
	} 
	
	public static void main(String[] args) {
	Info2 info=new Info2();
	info.authorid(1);
	info.author("rashmi");
	info.date(new java.util.Date());
	info.time(new java.sql.Time(0));
	info.version(1.8); 
	}
	}




