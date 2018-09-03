package com.nt.bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.SimpleLayout;

public class Log4jProperties {
	
	private static Logger logger=Logger.getLogger(Log4jProperties.class);
	
	public static void main(String[] args) {
		////////////////////////////////////////////////////////////////////
		//create layoutt
		SimpleLayout layout=new SimpleLayout();
		///create file appender
		try{
		FileAppender appender=new FileAppender(layout,"properties.html",true);
		//add appender to logger
		logger.addAppender(appender);
		//set level of that
		logger.setLevel(Level.ALL);
		logger.debug("this is enter into catchblock");
		
		logger.debug("load the driver class");
		Class.forName("com.mysql.jdbc.Driver");
		logger.fatal("create connection object(----)");
		Connection con=DriverManager.getConnection("jdbc:mysql:///mysql","root","root");
		logger.fatal("create preperaed statement");
		PreparedStatement ps=con.prepareStatement("SELECT*FROM STUDENT");
		logger.debug("collect the results from database()");
		ResultSet rs=ps.executeQuery();
		logger.debug("retrive the results");
		while(rs.next()){
			System.out.println(rs.getString(1)+""+rs.getString(2));
		}
		
	}catch(Exception e){
		logger.error("this is cathc block");
	}

}
}
