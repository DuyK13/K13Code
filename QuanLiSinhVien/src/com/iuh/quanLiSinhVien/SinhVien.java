package com.iuh.quanLiSinhVien;

//id, name, age, address và gpa
public class SinhVien {
	
	private String id;
	private String name;
	private int age;
	private String address;
	private double gpa;
	
	public SinhVien(String id, String name, int age, String address, double gpa) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.gpa = gpa;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age < 0)
			this.age = 0;
		else
			this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		if(gpa < 0)
			this.gpa = 0;
		else
			this.gpa = gpa;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id: " + this.id + "\t"
				+ "Name: " + this.name +"\t"
						+ "Age: " + this.age + "\t"
								+ "Address: " + this.address +"\t"
										+ "GPA: " + this.gpa +"\n" ;
	}
	
	
	
	
}
