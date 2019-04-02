package com.demo.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernetConnection {
	public static SessionFactory getConnection()
	{
		Configuration cfg=new Configuration();
		cfg.configure("hibernet.cfg.xml");
		SessionFactory sessionFactoryObj=cfg.buildSessionFactory();
		return sessionFactoryObj;
	}
}
