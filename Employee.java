package org.apex.assignment;

public class Employee {
	private int empNo;
	private String empName;
	private String address;
	private String State;
	private int zipCode;
	private String phone;
	private String designation;
	private int experienceinYears;
	private String emailAddress;
	private double basic;
	private double hra;
	private double bonus;	
	
	public Employee(int empNo, String empName, String address, String state, 
			int zipCode, String phone,
			String designation, int experienceinYears, String emailAddress, 
			double basic, double hra, double bonus) {
		this.empNo = empNo;
		this.empName = empName;
		this.address = address;
		State = state;
		this.zipCode = zipCode;
		this.phone = phone;
		this.designation = designation;
		this.experienceinYears = experienceinYears;
		this.emailAddress = emailAddress;
		this.basic = basic;
		this.hra = hra;
		this.bonus = bonus;
	}

	
	
	public int getEmpNo() {
		return empNo;
	}



	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}



	public String getEmpName() {
		return empName;
	}



	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getState() {
		return State;
	}



	public void setState(String state) {
		State = state;
	}



	public int getZipCode() {
		return zipCode;
	}



	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public int getExperienceinYears() {
		return experienceinYears;
	}



	public void setExperienceinYears(int experienceinYears) {
		this.experienceinYears = experienceinYears;
	}



	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}



	public double getBasic() {
		return basic;
	}



	public void setBasic(double basic) {
		this.basic = basic;
	}



	public double getHra() {
		return hra;
	}



	public void setHra(double hra) {
		this.hra = hra;
	}



	public double getBonus() {
		return bonus;
	}



	public void setBonus(double bonus) {
		this.bonus = bonus;
	}



	public void empDetails() {
		System.out.println("Emp No: "+getEmpNo());
		System.out.println("Name: "+getEmpName());
		System.out.println("Address: "+getAddress());
		System.out.println("State: "+getState());
		System.out.println("Zip Code: "+getZipCode());
		System.out.println("Phone: "+getPhone());
		System.out.println("Designation: "+getDesignation());
		System.out.println("Exp: "+getExperienceinYears());
		System.out.println("Email: "+getEmailAddress());
		System.out.println("Basic: "+getBasic());
		System.out.println("HRA: "+getHra());
		System.out.println("Bonus: "+getBonus()+"%");
		System.out.println("Total Salary: "+getTotalSalary( 
				getBasic(), getHra(), getBonus() ));
	}
	
	public double getTotalSalary(double base, double hra, double bonus) {
		double totalSalary = base + hra + (bonus/100 * base);
		return totalSalary;
	}
	
	
	
	
	
}
