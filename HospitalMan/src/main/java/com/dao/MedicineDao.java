package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.dao.DBConnectionUtil;
import com.pojo.Medicine;

public class MedicineDao {
	
	static Connection connection = null;
	static ResultSet resultSet = null;
	static Statement statement = null;
	static PreparedStatement preparedStatement = null;

	public static boolean update(Medicine m) {
		
		boolean flag = false;
		try {
			String sql = "UPDATE medicines_master SET quantity_avaialable = '"+m.getQuantityAvaialable()+"' where id="+m.getId();
			connection = DBConnectionUtil.openConnection();
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.executeUpdate();
			flag = true;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	public static List<Medicine> medicinelist () {
		
		List<Medicine> list = null;
		Medicine med = null;
		
		try {
			
			list = new ArrayList<Medicine>();
			String sql = "SELECT * FROM medicines_master";
			connection = DBConnectionUtil.openConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				med = new Medicine();
				med.setId(resultSet.getInt(1));
				med.setName(resultSet.getString(2));
				med.setQuantityAvaialable(resultSet.getInt(3));
				med.setRate(resultSet.getDouble(4));
				list.add(med);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static Medicine getmedicinebyid (Medicine m) {
		
		Medicine med = null;
		
		try {
			
			String sql = "SELECT * FROM medicines_master where id="+m.getId();
			connection = DBConnectionUtil.openConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
				med = new Medicine();
				med.setId(resultSet.getInt(1));
				med.setName(resultSet.getString(2));
				med.setQuantityAvaialable(resultSet.getInt(3));
				med.setRate(resultSet.getDouble(4));
			}	
			}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return med;
		
	}

public static Medicine getmedicinebyname (Medicine m) {
		
		Medicine med = null;
		
		try {
			
			String sql = "SELECT * FROM medicines_master where name="+m.getName();
			connection = DBConnectionUtil.openConnection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery(sql);
			if(resultSet.next()) {
				med = new Medicine();
				med.setId(resultSet.getInt(1));
				med.setName(resultSet.getString(2));
				med.setQuantityAvaialable(resultSet.getInt(3));
				med.setRate(resultSet.getDouble(4));
			}	
			}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return med;
		
	}



	
}
