package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dao.StudentDao;
import com.model.Student;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        StudentDao sd=context.getBean(StudentDao.class);
      System.out.println(sd.deleteStudentBySid(5));
       
// =========== insertStudent===================================================insertStudent=============================
//        Student s=new Student();
//        s.setSname("Varsha");
//        s.setScity("Narhe");
//        s.setSpercentage(50.28);
//        System.out.println(sd.insertStudent(s));
    }
}
