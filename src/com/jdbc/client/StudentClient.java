package com.jdbc.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdbc.dao.StudentDAO;
import com.jdbc.entity.Student;

public class StudentClient {
	/*
			CREATE TABLE `hbdemo`.`student` (
			  `rollNo` INT NOT NULL,
			  `name` VARCHAR(45) NOT NULL,
			  `address` VARCHAR(45) NOT NULL,
			  PRIMARY KEY (`rollNo`));
*/
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		StudentDAO dao = (StudentDAO) ctx.getBean("sdao");
		dao.saveStudent(new Student(10, "Sudarshan", "Pune"));
		System.out.println("Done !!");
	}
}
