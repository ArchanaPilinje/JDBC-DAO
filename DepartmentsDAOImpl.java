package com.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 0;
	}

	@Override
	public int update(Departments dept) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int dept_no) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Departments> showAllDepartments() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Departments showByDeptNum(int dept_no) {
		// TODO Auto-generated method stub
		return null;
	}

}
