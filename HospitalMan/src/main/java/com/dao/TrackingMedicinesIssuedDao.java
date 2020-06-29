package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.DBConnectionUtil;
import com.pojo.TrackingMedicinesIssued;

public class TrackingMedicinesIssuedDao {
	
	static Connection connection = null;
	static ResultSet resultSet = null;
	static Statement statement = null;
	static PreparedStatement preparedStatement = null;
	
	public static int create(TrackingMedicinesIssued t) {
		
		int f = 0;
		try {
			String sql = "INSERT INTO tracking_medicines_issued VALUES(Null,?,?,?)";
			connection = DBConnectionUtil.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setInt(2, t.getMedicineId());
			preparedStatement.setInt(3, t.getPatientId());
			preparedStatement.setInt(4, t.getQuantityIssued());
			
			

			f = preparedStatement.executeUpdate();
	
	if(f==1){
		return getIssuedMedById(t).getId();
		}
			
		}
		catch(SQLException ex) {
			ex.printStackTrace();
			}
		return f;
	}
	
	public static boolean update(TrackingMedicinesIssued t) {
		
		boolean flag = false;
		try {
			String sql = "UPDATE tracking_medicines_issued SET quantity_issued = '"+t.getQuantityIssued()+"' where id="+t.getId();
			connection = DBConnectionUtil.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
		}
	
	public static boolean delete (TrackingMedicinesIssued t) {
		
		boolean flag = false;
		try {
			String sql = "DELETE FROM tracking_medicines_issued where id="+t.getId();
			connection = DBConnectionUtil.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}


	public static TrackingMedicinesIssued getIssuedMedById ( TrackingMedicinesIssued t) {
	
		TrackingMedicinesIssued tm = null;
	
	try {
		
		String sql = "SELECT * FROM tracking_medicines_issued where id="+t.getId();
		connection = DBConnectionUtil.openConnection();
		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);
if(resultSet.next()) {
			tm = new TrackingMedicinesIssued();
			tm.setId(resultSet.getInt(1));
			tm.setMedicineId(resultSet.getInt(2));
			tm.setPatientId(resultSet.getInt(3));
			tm.setQuantityIssued(resultSet.getInt(4));
			
}	
}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return tm;
	
	}

	public static List<TrackingMedicinesIssued> getIssuedMedList () {
		
		List<TrackingMedicinesIssued> list = null;
		TrackingMedicinesIssued t = null;
		
		try {
			
			list = new ArrayList<TrackingMedicinesIssued>();
			String sql = "SELECT * FROM tracking_medicines_issued";
			connection = DBConnectionUtil.openConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				t = new TrackingMedicinesIssued();
				t.setId(resultSet.getInt(1));
				t.setMedicineId(resultSet.getInt(2));
				t.setPatientId(resultSet.getInt(3));
				t.setQuantityIssued(resultSet.getInt(4));
				list.add(t);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}



}
