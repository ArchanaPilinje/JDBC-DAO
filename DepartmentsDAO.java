package com.dao;

import java.util.List;

import com.model.Departments;

public interface DepartmentsDAO {
	int save(Departments dept);

	int update(Departments dept);

	int delete(int dept_no);

	List<Departments> showAllDepartments();

	Departments showByDeptNum(int dept_no);

}
