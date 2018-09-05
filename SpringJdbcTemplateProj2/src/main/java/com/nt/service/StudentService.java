package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

public interface StudentService {
	
	public String Register(int rollnum,String name,String job);
	
	public Map<String,Object>GetDetails(int no);
	
	public String getUpdate(String job,int num)throws DataAccessException;
	
	public List<Map<String,Object>>getAllStudents();
	public String StudentDelete(int num);

}
