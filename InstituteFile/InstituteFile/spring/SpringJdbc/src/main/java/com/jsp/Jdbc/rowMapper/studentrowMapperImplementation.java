package com.jsp.Jdbc.rowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.jsp.Jdbc.entity.Student;
@Component
public class studentrowMapperImplementation implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Student std=new Student();
		std.setStd_id(rs.getInt(1));
		std.setStd_name(rs.getString(2));
		std.setStd_mail(rs.getString(3));
		std.setStd_mobile(rs.getString(4));
		std.setStd_dob(rs.getDate(5));
		std.setStd_stream(rs.getString(6));
		std.setStd_per(rs.getDouble(7));
		return std;
	}

}
