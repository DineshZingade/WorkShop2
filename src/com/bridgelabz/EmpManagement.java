package com.bridgelabz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EmpManagement {

	static private String FirstName, LastName, eMailId;
	static long MobileNo;
	static int Salary;

	public EmpManagement(String FirstName, String LastName, String eMailI, Long MobileNo, int Salary) {
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.eMailId = eMailId;
		this.MobileNo = MobileNo;
		this.Salary = Salary;

	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String geteMailId() {
		return eMailId;
	}

	public void seteMailId(String eMailId) {
		this.eMailId = eMailId;
	}

	public long getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}

	public int getSalary() {
		return Salary;
	}

	public void setSalary(int salary) {
		Salary = salary;
	}

	public void highestNumber() {
		List<EmpManagement> list = new ArrayList<EmpManagement>();
		list.add(new EmpManagement("Dinesh", "Zingade", "dinesh@gmail.com", 9404291279L, 30000));
		list.add(new EmpManagement("Mahesh", "Bhosale", "mahesh@gmail.com", 5454545454L, 50000));
		list.add(new EmpManagement("pratap", "Pawar", "mahesh@gmail.com", 5454545454L, 32513));
		list.add(new EmpManagement("manish", "Bhosale", "mahesh@gmail.com", 5454545454L, 70000));
		list.add(new EmpManagement("ShubhamSir", "Bhosale", "mahesh@gmail.com", 5454545454L, 100000));

		double max = list.get(0).getSalary();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSalary() > max) {
				max = list.get(i).getSalary();

			}
		}
		System.out.println("Highest Salary from the list is :");
		System.out.println(max);
	}

	public static void main(String[] args) {

		List<EmpManagement> list = new ArrayList<EmpManagement>();
		list.add(new EmpManagement("Dinesh", "Zingade", "dinesh@gmail.com", 9404291279L, 30000));
		list.add(new EmpManagement("Mahesh", "Bhosale", "mahesh@gmail.com", 5454545454L, 50000));
		list.add(new EmpManagement("pratap", "Pawar", "mahesh@gmail.com", 5454545454L, 32513));
		list.add(new EmpManagement("manish", "Bhosale", "mahesh@gmail.com", 5454545454L, 70000));
		list.add(new EmpManagement("ShubhamSir", "Bhosale", "mahesh@gmail.com", 5454545454L, 100000));

		for (EmpManagement s : list) {
			System.out.println(s.FirstName);
			System.out.println(s.LastName);
			System.out.println(s.eMailId);
			System.out.println(s.MobileNo);
			System.out.println(s.Salary);
		}

		EmpManagement obj = new EmpManagement(FirstName, LastName, eMailId, MobileNo, Salary);
		obj.highestNumber();

	}
}
