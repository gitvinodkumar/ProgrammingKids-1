package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.nt.dao.StudentDao;

public class StudentServiceImpl implements StudentService {

	
	StudentDao dao;
	public void setDao(StudentDao dao) {
		this.dao = dao;
	}
	
	@Override
	public String Register(int rollnum, String name, String job) {
		
		//pass values to dao 
		int result =dao.insert(rollnum, name, job);
		
		if(result==0)
			return "Registartion is failed";
			else
				return "registrateion i succeeed";
		
		
	}

	@Override
	public Map<String, Object> GetDetails(int no)throws DataAccessException {
		Map<String,Object>result=dao.ForMap(no);
		 
		

		return result;
	}

	@Override
	public String getUpdate(String job, int num) throws DataAccessException {
		//access the dao object
		int update =dao.UpdateStudentJob(job, num);
		if(update==0){
			return "not updated ";
		}else{
			return "update is successs";
		}
		
	}

	@Override
	public List<Map<String, Object>> getAllStudents() {
		List<Map<String,Object>>result=dao.getAllStudents();
		return result;
	}

	@Override
	public String StudentDelete(int num) {
		int delete=dao.StudentgetOut(num);
		
		if(delete==0)
			return "not delete";
		else
			return "this is deleted";
		
	}


	

}
