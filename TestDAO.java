package com.main;

import java.util.Scanner;
import java.util.ArrayList;
import com.dao.impl.DepartmentsDAOImpl;
import com.model.Departments;



public class TestDAO {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DepartmentsDAOImpl dept=new DepartmentsDAOImpl();
		int flag=0;
		do {
		System.out.println("Choose from any one of the following options");
		System.out.println("1.Insert   2.Update a particular department  3.Delete  4.Show Complete Table  5.Show Details of a particular Department");
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

		case 2:
			System.out.println("Enter the Department Number and the new Department Name");
			Departments d1 = new Departments();
			d1.setDept_no(sc.nextLine());
			d1.setDept_name(sc.nextLine());
			int res1 = dept.update(d1);
			System.out.println("Rows updated :" + res1);
			break;
		
		case 3:
			System.out.println("Enter the dept_no to be deleted");
			int res2=dept.delete(sc.nextLine());
			System.out.println("Rows updated :" + res2);
			break;
			
		case 4:ArrayList<Departments> department = new ArrayList<>();
				department=dept.showAllDepartments();
				for(Departments x:department) {
					System.out.println(x);
				}
				break;
				
			case 5:
				System.out.println("Enter the dept_no to be shown");
				Departments d5=dept.showByDeptNum(sc.nextLine());
				System.out.println(d5);
				break;
		
		
			
		default:
			System.out.println("Enter the correct choice!");
		}
		System.out.println("Press the Corresponding option:\n1.Continue 0. Exit");
		flag = sc.nextInt();
		}while(flag==1);

	}

}
