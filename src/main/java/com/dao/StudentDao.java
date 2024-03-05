package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.model.Student;

public class StudentDao {
	
	private JdbcTemplate j;
	
	public void setJ(JdbcTemplate j) {
		this.j = j;
	}

//================================	insertStudent(Student s)==============================================
	
	public int insertStudent(Student s)
	{
		String sql = "insert into student(sname ,scity, spercentage) values(? ,?, ?)";
		return j.update(sql,new Object[] {s.getSname(),s.getScity(),s.getSpercentage()});
	}

//	=================================deleteStudentBySid=====================================================
	public int deleteStudentBySid(int sid) {
		String sql="delete from student where sid=?";
		return j.update(sql,sid);
	}
	
	public int updateStudentBySname(String sname, String newName) {
	    String sql = "UPDATE student SET sname = ? WHERE sname = ?";
	    return j.update(sql, newName,  sname);
	}

}
