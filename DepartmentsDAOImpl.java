package com.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.dao.DepartmentsDAO;
import com.model.Departments;
import com.utility.ConnectionUtility;

public class DepartmentsDAOImpl implements DepartmentsDAO{

	@Override
	public int save(Departments dept) {

		try {
			PreparedStatement st1 = ConnectionUtility.getCon().prepareStatement("INSERT INTO DEPARTMENts values(?,?)");
			st1.setString(1, dept.getDept_no());
			st1.setString(2, dept.getDept_name());
			return st1.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int update(Departments dept) {

		try {
			String sqlUpdate = "UPDATE departments "
	                + "SET dept_name = ? "
	                + "WHERE dept_no = ?";
			PreparedStatement st1 = ConnectionUtility.getCon().prepareStatement(sqlUpdate);
			st1.setString(1,dept.getDept_name());
			st1.setString(2,dept.getDept_no());
			return st1.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(String dept_no) {
		try {
			String sqlDelete = "DELETE from departments "
	                + "WHERE dept_no = ?";
			PreparedStatement st1 = ConnectionUtility.getCon().prepareStatement(sqlDelete);
			st1.setString(1,dept_no);
			return st1.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public ArrayList<Departments> showAllDepartments() {
		ArrayList<Departments> department = new ArrayList<>();
		
		try {
		Statement st=ConnectionUtility.getCon().createStatement();
		ResultSet rs=st.executeQuery("SELECT * from departments");
		 while(rs.next()){
			 Departments d=new Departments();
			 d.setDept_no(rs.getString(1));
			 d.setDept_name(rs.getString(2));
			 department.add(d);
		 }
		 return department;
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Departments showByDeptNum(String dept_no) {
		try {
			Departments d= new Departments();
			String sqlShow = "Select * from departments "
	                + "WHERE dept_no = ?";
			PreparedStatement st1 = ConnectionUtility.getCon().prepareStatement(sqlShow);
			st1.setString(1,dept_no);
			ResultSet rs1=st1.executeQuery();
			while(rs1.next()){
				d.setDept_no(rs1.getString(1));
				 d.setDept_name(rs1.getString(2));
			}
			return d;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
