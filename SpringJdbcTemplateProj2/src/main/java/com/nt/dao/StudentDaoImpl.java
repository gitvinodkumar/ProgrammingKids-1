package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao {

	 private static final String query="INSERT INTO STUDENT000 VALUES(?,?,?)";
	private static final String query1="SELECT * FROM STUDENT000 WHERE ROLLNUM=?";
	private static final String query3="UPDATE STUDENT000 SET JOB=? WHERE ROLLNUM=?";
	private static final String query4="SELECT ROLLNUM,NAME,JOB FROM STUDENT000";
	private static final String query5="DELETE FROM STUDENT000 WHERE ROLLNUM=?";
	JdbcTemplate jt;
	
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
		System.out.println(jt);
	}
	
	
	
	@Override
	public int insert(int rollnum, String name, String job) {
		
		int result=jt.update(query, rollnum,name,job);
		
		return result;
	}
	
	public Map<String,Object>ForMap(int no)throws DataAccessException{
		
		Map<String,Object>Result=null;
		Result=jt.queryForMap(query1,no);
		
		return Result;
		
	}



	@Override
	public int UpdateStudentJob(String job,int rollnum) throws DataAccessException {
		//USE JDBC TEMPlate and send values to query as prepared statement
		int update=jt.update(query3,job,rollnum);
		return update;
	}



	@Override
	public List<Map<String, Object>> getAllStudents() {
		
		List<Map<String,Object>>result=jt.queryForList(query4);
		return result;
	}



	@Override
	public int StudentgetOut(int num) {
		int result=jt.update(query5,num);
		return result;
	}




	

}
