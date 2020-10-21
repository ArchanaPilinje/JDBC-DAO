package com.main;

import java.util.Scanner;

import com.dao.impl.DepartmentsDAOImpl;
import com.model.Departments;

public class TestDAO {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DepartmentsDAOImpl dept=new DepartmentsDAOImpl();
		System.out.println("Choose from any one of the following options");
		System.out.println("1.Insert   2.Update  3.Delete  4.Show Complete Table  5.Show A particular Department");
		int ch=sc.nextInt();
		sc.nextLine();
		switch (ch) {
		case 1:
			System.out.println("Enter the Department Number and Department Name");
			Departments d = new Departments();
			d.setDept_no(sc.nextLine());
			d.setDept_name(sc.nextLine());
			int res = dept.save(d);
			System.out.println("Rows updated :" + res);
			break;

		

		default:
			System.out.println("Enter the correct choice!");
		}

	}

}
