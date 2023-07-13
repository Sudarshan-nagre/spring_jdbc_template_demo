package com.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.jdbc.entity.Student;

public class StudentDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveStudent(Student st) {
		String query = "insert into student values('" + st.getRollNo() + "','" + st.getName() + "','" + st.getAddress()
				+ "')";
		return jdbcTemplate.update(query);
	}

	public int updateStudent(Student st) {
		String query = "update student set name='" + st.getName() + "',address='" + st.getAddress() + "' where rollNo='"
				+ st.getRollNo() + "' ";
		return jdbcTemplate.update(query);
	}

	public int deleteStudent(Student st) {
		String query = "delete from student where rollNo='" + st.getRollNo() + "' ";
		return jdbcTemplate.update(query);
	}
	public List<Map<String, Object>> getStudents() {
		String q = "select * from student";
		List<Map<String, Object>> ll =  jdbcTemplate.queryForList(q);
		
		return ll;
	}
}
