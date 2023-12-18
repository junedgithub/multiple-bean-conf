package com.all;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qspiders.Staff;
import com.ty.Student;
import com.ty.Teacher;

public class TestAll {
	public static void main(String[] args) {
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("my_college.xml");
      Student student = (Student)applicationContext.getBean("myStudent");
      Teacher teacher = (Teacher)applicationContext.getBean("myTeacher");
      Staff staff = (Staff)applicationContext.getBean("myStaff");
      student.run();
      teacher.reading();
      staff.work();
	}
}
