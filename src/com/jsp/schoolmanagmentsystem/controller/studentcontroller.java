package com.jsp.schoolmanagmentsystem.controller;

import com.jsp.schoolmanagmentsystem.dao.StudentDao;
import com.jsp.schoolmanagmentsystem.dto.Student;

public class studentcontroller {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(2);
		s1.setName("saNKET");
		s1.setEmail("XYZ@gmail.com");
		
		StudentDao studentDao=new StudentDao();
		Student student=studentDao.saveStudent(s1);
	//	studentDao.deleteStudent(1);                      
//	    studentDao.readStudent(3);
	//    studentDao.readAll();
		
		
//		if(student !=null) {
//			System.out.println("student data updated");
//		}else {
//			System.out.println("student data not updated");
//			
//		}
		
		
	}

}
