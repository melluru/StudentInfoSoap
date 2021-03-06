package com.csc.test;

//import java.util.logging.Logger;

import javax.ws.rs.core.Response;

import junit.framework.Assert;

import org.junit.Test;

import com.csc.models.Student;
import com.csc.resources.StudentsRsrSprHib;

public class StudentsRsrSprHibTest {

	private StudentsRsrSprHib studentsRsrSprHib = new StudentsRsrSprHib();

	//@Test
	public void testPostStudent() {
		Student student = new Student();
		student.setFirstName("TestName");
		Response response = studentsRsrSprHib.postStudent(student);
		Assert.assertEquals(student.getFirstName(),
				((Student) response.getEntity()).getFirstName());
	}

	@Test
	public void testPostStudentLastName() {
		Student student = new Student();
		student.setLastName("");
		Response response = studentsRsrSprHib.postStudent(student);
		Assert.assertEquals(student.getFirstName(),
				((Student) response.getEntity()).getFirstName());
	}
	
	//@Test(expected = IllegalArgumentException.class)
	public void testPostStudentFailure() {
		Student student = new Student();
		student.setFirstName("TestName");
		Response response = studentsRsrSprHib.postStudent(null);
		Assert.assertEquals(student.getFirstName(),
				((Student) response.getEntity()).getFirstName());
	}
}