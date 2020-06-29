package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.DBConnectionUtil;
import com.pojo.TrackingDiagnostics;

public class TrackingDiagnosticsDao {
	
	static Connection connection = null;
	static ResultSet resultSet = null;
	static Statement statement = null;
	static PreparedStatement preparedStatement = null;
	
	public static int create(TrackingDiagnostics t) {
		
		int f = 0;
		try {
			String sql = "INSERT INTO test_conducted VALUES(Null,?,?)";
			connection = DBConnectionUtil.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(2, t.getPatientId());
			preparedStatement.setInt(3, t.getTestConductedId());
			
			

			f = preparedStatement.executeUpdate();
	
	if(f==1){
		return getTestConductedById(t).getId();
		}
			
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			}
		return f;
	}
	
	
	
	public static boolean delete (TrackingDiagnostics t) {
		
		boolean flag = false;
		try {
			String sql = "DELETE FROM test_conducted where id="+t.getId();
			connection = DBConnectionUtil.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}


	public static TrackingDiagnostics getTestConductedById ( TrackingDiagnostics t) {
	
		TrackingDiagnostics tm = null;
	
	try {
		
		String sql = "SELECT * FROM test_conducted where id="+t.getId();
		connection = DBConnectionUtil.openConnection();
		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);
if(resultSet.next()) {
			tm = new TrackingDiagnostics();
			tm.setId(resultSet.getInt(1));
			tm.setPatientId(resultSet.getInt(2));
			tm.setTestConductedId(resultSet.getInt(3));
			
}	
}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return tm;
	
	}

	public static List<TrackingDiagnostics> getTestConductedList () {
		
		List<TrackingDiagnostics> list = null;
		TrackingDiagnostics t = null;
		
		try {
			
			list = new ArrayList<TrackingDiagnostics>();
			String sql = "SELECT * FROM test_conducted";
			connection = DBConnectionUtil.openConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				t = new TrackingDiagnostics();
				t.setId(resultSet.getInt(1));
				t.setPatientId(resultSet.getInt(2));
				t.setTestConductedId(resultSet.getInt(3));
				list.add(t);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}



}
