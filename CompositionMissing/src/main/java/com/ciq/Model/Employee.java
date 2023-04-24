package com.ciq.Model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name ="Emp_tables")
//
@NamedQueries({
@NamedQuery(name="Employee.findAll",query="from Employee"),
@NamedQuery(name="Employee.g",
query = "select edi,name from Employee"),
@NamedQuery(name="Employee.getById", query = "from Employee where id=1")
})

public class Employee {
	@Id
	@GenericGenerator(name = "myGenerator", strategy = "increment")
	@GeneratedValue(strategy = GenerationType.AUTO,generator = "myGenerotor")

	private int edi;//1,2,3,4
	@Column
	private String name;
	@Column
	private double Salary;
	
	@Embedded
	private LeaveTracker leaveTracker;

	public Employee() {
		
	}

	public Employee(String name, double salary, LeaveTracker leaveTracker) {
		super();
		this.name = name;
		Salary = salary;
		this.leaveTracker = leaveTracker;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getSalary() {
		return Salary;
	}



	public void setSalary(double salary) {
		Salary = salary;
	}



	public LeaveTracker getLeaveTracker() {
		return leaveTracker;
	}



	public void setLeaveTracker(LeaveTracker leaveTracker) {
		this.leaveTracker = leaveTracker;
	}



	@Override
	public String toString() {
		return "Employee [edi=" + edi + ", name=" + name + ", Salary=" + Salary + ", leaveTracker=" + leaveTracker+ "]";
	}
	
	
	
	

}
