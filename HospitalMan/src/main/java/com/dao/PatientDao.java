package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.dao.DBConnectionUtil;
import com.pojo.Patient;

public class PatientDao {
	
	static Connection connection = null;
	static ResultSet resultSet = null;
	static Statement statement = null;
	static PreparedStatement preparedStatement = null;

public static int create(Patient p) {
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    Date datenow = new Date();
    String s=dateFormat.format(datenow);
	int f = 0;
	try {
		String sql = "INSERT INTO patient VALUES(Null,?,?,?,?,?,?,?,?)";
		connection = DBConnectionUtil.openConnection();
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(2, p.getSsnId());
		preparedStatement.setString(3, p.getName());
		preparedStatement.setInt(4, p.getAge());
		preparedStatement.setString(5, s);
		preparedStatement.setString(6, p.getTypeOfBed());
		preparedStatement.setString(7, p.getAddress()+","+p.getCity()+","+p.getState());
		preparedStatement.setString(8, p.getCity());
		preparedStatement.setString(9, p.getState());
		
		Patient pa=new Patient();
		pa.setSsnId(p.getSsnId());
pa=getpatientbyssnid(pa);
if(pa!=null)
{
	return 0;
}
else{
		f = preparedStatement.executeUpdate();
}
if(f==1){
	return getpatientbyssnid(p).getId();
	}
		
	}
	catch(SQLException ex) {
		ex.printStackTrace();
		}
	return f;
}

public static boolean update(Patient p) {
	
	boolean flag = false;
	try {
		String sql = "UPDATE patient SET name = '"+p.getName()+"', "
				+ "address = '"+p.getAddress()+"', age = '"+p.getAge()+"',state = '"+p.getState()+"',city = '"+p.getCity()+"',type_of_bed = '"+p.getTypeOfBed()+"',date_of_admission = '"+p.getDateOfAdmission()+"' where id="+p.getId();
		connection = DBConnectionUtil.openConnection();
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.executeUpdate();
		flag = true;
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return flag;
	}

public static boolean delete (Patient p) {
	
	boolean flag = false;
	try {
		String sql = "DELETE FROM patient where id="+p.getId();
		connection = DBConnectionUtil.openConnection();
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.executeUpdate();
		flag = true;
	}catch(SQLException e) {
		e.printStackTrace();
	}
	return flag;
	}


public static Patient getpatientbyssnid (Patient p) {
	
	Patient patient = null;
	
	try {
		
		String sql = "SELECT * FROM patient where ssnid="+p.getSsnId();
		connection = DBConnectionUtil.openConnection();
		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);
if(resultSet.next()) {
			patient = new Patient();
			patient.setId(resultSet.getInt(1));
			patient.setSsnId(resultSet.getString(2));
			patient.setName(resultSet.getString(3));
			patient.setAge(resultSet.getInt(4));
			patient.setDateOfAdmission(resultSet.getString(5));
			patient.setTypeOfBed(resultSet.getString(6));
			patient.setAddress(resultSet.getString(7));
			patient.setCity(resultSet.getString(8));
			patient.setState(resultSet.getString(9));
}	
}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return patient;
	
	}

public static Patient getpatientbypatientid (Patient p) {
	
	Patient patient = null;
	
	try {
		
		String sql = "SELECT * FROM patient where id="+p.getId();
		connection = DBConnectionUtil.openConnection();
		statement = connection.createStatement();
		resultSet = statement.executeQuery(sql);
		if(resultSet.next()) {
			patient = new Patient();
			patient.setId(resultSet.getInt(1));
			patient.setSsnId(resultSet.getString(2));
			patient.setName(resultSet.getString(3));
			patient.setAge(resultSet.getInt(4));
			patient.setDateOfAdmission(resultSet.getString(5));
			patient.setTypeOfBed(resultSet.getString(6));
			patient.setAddress(resultSet.getString(7));
			patient.setCity(resultSet.getString(8));
			patient.setState(resultSet.getString(9));
		}	
		}
	catch(SQLException e) {
		e.printStackTrace();
	}
	return patient;
	
}






}
