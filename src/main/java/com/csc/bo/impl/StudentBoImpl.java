package com.csc.bo.impl;

import com.csc.bo.StudentBO;
import com.csc.dao.StudentDAO;
import com.csc.models.Student;
import com.csc.models.Students;

public class StudentBoImpl implements StudentBO {

	StudentDAO stdDao;

	public void setStudentDao(StudentDAO stdDao) {
		this.stdDao = stdDao;
	}

	public void insert(Student std) {
		// TODO Auto-generated method stub
		stdDao.insert(std);
	}

	public void insertMultiple(Students students) {
		stdDao.insertMultiple(students);
	}

	public Student findByStudentId(int id) {
		// TODO Auto-generated method stub
		return stdDao.findByStudentId(id);
	}
	
	public String printMessage() {
		return "Hello from Java Code Geeks JAXWS with Spring Tutorial";
	}

}
