package com.ciq.ClientTest;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import com.ciq.Model.Employee;
import com.ciq.Util.HibernateUtil;

public class NamedQueries {
	public static void main(String[] args) {
		  
        Session session = HibernateUtil.getseSession();
//       List<Employee> Employee = session.createNamedQuery("Employee.findAll").list();
//       Employee.forEach(System.out::println);
        
//        List<Object[]>list = session.createNamedQuery("Employee.getSpecificColumns").list();
////         List<Object[]> list = namedQuery.list();
//        for (Object[] obj : list) {
//            System.out.println(obj[0]);
//            System.out.println(obj[1]);
//
//	}
        
        List<Object[]> list = session.createNamedQuery("Employee.g").list();
        for (Object[] obj : list) {
        	System.out.println(obj[0]);
        	
		}
        
//        Object result = session.createNamedQuery("Employee.getById").uniqueResult();
//        System.out.println(result);

}
}
