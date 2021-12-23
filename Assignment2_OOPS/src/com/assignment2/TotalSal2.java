package com.assignment2;

  class Employee {
	 int getSalary()
	 {
		 int sal=10000;
		 return sal;
	 }

}
 
 class Manager extends Employee
 {
	 int getSalary() 
	 {
		 int sal=100000;
		 return sal;
	 }
 }
 
 class Labour extends Employee
 {
	 int getSalary() 
	 {
		 int sal=10000;
		 return sal;
	 }
 }
 
   class TotalSal2{
	 public static void main(String args[]) {
		 Manager m= new Manager();
		 System.out.println("salary of Manager " + m.getSalary());
		 
		 Employee l= new Labour();
		 System.out.println("salary of Labour " + l.getSalary());
	 }
 }