package com.bridzelabz.oops1;

public class Employee {
    private int id;
    String empName;
    int empAge;

    
    public int getEmpid(){
        return id;
    }

    public String getEmpName(){
        return empName;
    }

    public int getEmpAge(){
        return empAge;
    }

    public void setEmpAge(int age){
        empAge = age;
    }

    public void setEmpName(String name){
        empName = name;
    }

    public void setEmpid(int id){
        this.id = id;
    }
}
 class EmpTest{
    public static void main(String args[]){
         Employee emp = new Employee();
         emp.setEmpName("Ashay");
         emp.setEmpAge(20);
         emp.setEmpid(13);
         System.out.println("Employee Name: " + emp.getEmpName());
         System.out.println("Employee ID: " + emp.getEmpid());
         System.out.println("Employee Age: " + emp.getEmpAge());
    } 
}


