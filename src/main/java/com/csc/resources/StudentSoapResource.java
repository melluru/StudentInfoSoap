package com.csc.resources;

//import java.util.logging.Logger;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.csc.bo.StudentBO;
import com.csc.models.Student;

@WebService
public class StudentSoapResource{

	Logger log = LoggerFactory.getLogger(StudentSoapResource.class);
   
	//private ApplicationContext appContext;
	/*public StudentSoapResource() {
		appContext = new ClassPathXmlApplicationContext(
				"spring/config/springContext.xml");
	}*/
	
	StudentBO studentBo;

	@WebMethod(exclude=true)
	public void setStudentBo(StudentBO studentBo) {
		this.studentBo = studentBo;
		log.info("Inside setStudentBo method");
		//StudentBO studentBo = (StudentBO) appContext.getBean("studentBo");
		//studentBo.insert(student);
		//return "HelloWorldStudent";
	}

	@WebMethod(operationName="postStudent")
	public Student postStudents(Student student) {
		log.info("Entering student --------------------");

		studentBo.insert(student);

		return  student;
	}
	
	/*	@WebMethod(operationName="postStudents")
	public String postStudents(Students students) {

		LOG.info("Entering students --------------------");
		LOG.info(students.getList().get(0).getFirstName());

		StudentBO studentBo = (StudentBO) appContext.getBean("studentBo");
		studentBo.insertMultiple(students);

		return  "HelloWorldStudents";
	} */

	@WebMethod(operationName="getStudent")
	public Student getMsg(Integer msg) {

		//StudentBO studentBo = (StudentBO) appContext.getBean("studentBo");
		//Student student2 = studentBo.findByStudentId(msg);

		return studentBo.findByStudentId(msg);
	}
	
	@WebMethod(operationName="getHelloMsg")
	public String getHelloMsg() {
		log.info("Inside getHelloMsg method");
		
		 return studentBo.printMessage();

	}
}

