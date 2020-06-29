package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.DBConnectionUtil;
import com.pojo.Diagnostics;

public class DiagnosticsDao {
	
	static Connection connection = null;
	static ResultSet resultSet = null;
	static Statement statement = null;
	static PreparedStatement preparedStatement = null;

	
	public static List<Diagnostics> diagnosticslist () {
		
		List<Diagnostics> list = null;
		Diagnostics d = null;
		
		try {
			
			list = new ArrayList<Diagnostics>();
			String sql = "SELECT * FROM diagnostics_master";
			connection = DBConnectionUtil.openConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				d = new Diagnostics();
				d.setId(resultSet.getInt(1));
				d.setName(resultSet.getString(2));
				d.setCharge(resultSet.getDouble(3));
				list.add(d);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static Diagnostics getdiagnosticsbyid (Diagnostics d) {
		
		Diagnostics da = null;
		
		try {
			
			String sql = "SELECT * FROM diagnostics_master where id="+d.getId();
			connection = DBConnectionUtil.openConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
				da = new Diagnostics();
				d.setId(resultSet.getInt(1));
				d.setName(resultSet.getString(2));
				d.setCharge(resultSet.getDouble(3));
			}	
			}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return da;
		
	}

public static Diagnostics getdiagnostisbyname (Diagnostics d) {
		
		Diagnostics da = null;
		
	try {
			
			String sql = "SELECT * FROM diagnostics_master where name="+d.getName();
			connection = DBConnectionUtil.openConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
				da = new Diagnostics();
				d.setId(resultSet.getInt(1));
				d.setName(resultSet.getString(2));
				d.setCharge(resultSet.getDouble(3));
			}	
			}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return da;
		
	}



	
}
