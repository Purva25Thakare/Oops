package com.bridzelabz.oops1;

public class College {
	String name;
	College(String n){
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
	
class Student{
	
	String stName;
	int rollNo;
	Student(String stName,int rollNo){
		
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [stName=" + stName + ", rollNo=" + rollNo + "]";
	}
	class StTest{
		public static void main(String[] args) {
			Student st = new Student("Ashay",12);
			st.getRollNo();
			st.getStName();
			System.out.println("The roll no is" +st.getRollNo()+ "The name of student is" +st.stName);
		}
	}
}