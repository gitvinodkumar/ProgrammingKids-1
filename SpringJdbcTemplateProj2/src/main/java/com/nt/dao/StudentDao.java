package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

public interface StudentDao {

	
	public int insert(int rollnum,String name,String job);

	public Map<String, Object> ForMap(int no)throws DataAccessException;
	public int UpdateStudentJob(String job,int rollnum)throws DataAccessException;
	
	public List<Map<String,Object>>getAllStudents();
	
	public int StudentgetOut(int num);
	
}
