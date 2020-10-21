package com.dao;

import java.util.ArrayList;

import com.model.Departments;

public interface DepartmentsDAO {
	int save(Departments dept);

	int update(Departments dept);

	int delete(String dept_no);

	ArrayList<Departments> showAllDepartments();

	Departments showByDeptNum(String dept_no);

}
