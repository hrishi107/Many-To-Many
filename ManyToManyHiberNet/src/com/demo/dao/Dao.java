package com.demo.dao;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.demo.util.HibernetConnection;

public class Dao {

	public static void main(String[] args) {
		Session sessionObj=null;
		Transaction tx=null;
		try {
			/*Configuration cfg=new Configuration();
			cfg.configure("hibernet.cfg.xml");
			SessionFactory sessionFactoryObj=cfg.buildSessionFactory();
			 */			
			/*HibernetConnection hibernetConnectionObj=new HibernetConnection();
			
			Student s1=new Student();
			s1.setStudentName("Shubham");

			Student s2=new Student();
			s2.setStudentName("Pushkar");
			

			Course c1=new Course();
			c1.setCourseName("Physics");


			Course c2=new Course();
			c2.setCourseName("Maths");


			Set s =new HashSet();
			s.add(c1);
			s.add(c2);
			
			Set sObj =new HashSet();
			sObj.add(s1);
			sObj.add(s2);
			s1.setCourseSet(s);
			s2.setCourseSet(s);
			c1.setStudentSet(sObj);
			c1.setStudentSet(sObj);
			sessionObj=hibernetConnectionObj.getConnection().openSession();
			tx=sessionObj.beginTransaction();
			sessionObj.save(s1);
			sessionObj.save(s2);
			sessionObj.save(c1);
			sessionObj.save(c2);
			
			tx.commit();*/
			HibernetConnection hibernetConnectionObj=new HibernetConnection();
			sessionObj=hibernetConnectionObj.getConnection().openSession();			
			Query query=sessionObj.createQuery("select SCS.sname,SCC.coursename "
					+ " FROM StudentCourse SC"
					+ " JOIN SC.student SCS"
					+ " JOIN SC.course SCC"
					+ " where SC.fkcid=1");

			List ll = (List) query.list();
			Iterator it=ll.iterator();
			while(it.hasNext())
			{
				Object Obj[] = (Object[])it.next();
				
				System.out.println(Obj[0]+ " -- "+Obj[1]);
			}
			
			System.out.println("successfull");
			
		} catch (Exception e) {
			e.printStackTrace();

		    tx.rollback();
			
		}
		finally{
			sessionObj.close();		
		}
		
	}
	
}
