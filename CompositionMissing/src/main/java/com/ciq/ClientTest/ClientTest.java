package com.ciq.ClientTest;

import org.hibernate.Session;

import com.ciq.Model.Employee;
import com.ciq.Model.LeaveTracker;
import com.ciq.Util.HibernateUtil;

public class ClientTest {
	public static void main(String[] args) {
		Session se= HibernateUtil.getseSession();
		se.getTransaction().begin();
		LeaveTracker it=new LeaveTracker(12, 65, 89, 9);
		Employee em=new Employee("Bhargav", 25000.00, it);
		se.persist(em);
		se.getTransaction().commit();
		se.close(); 
	}

}
