package com.dao;

import java.util.List;

import com.model.Departments;

public interface DepartmentsDAO {
	int save(Departments dept);

	int update(String dept_name);

	int delete(String dept_no);

	List<Departments> showAllDepartments();

	Departments showByDeptNum(String dept_no);

}
