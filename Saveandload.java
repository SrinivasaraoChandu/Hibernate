package com.nbos.hb.service;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

import com.nbos.hb.pojos.Employee;
//This example demonstrates data insert.
public class HBSaveExample {

    public static void main(String[] args) {
        // getting a named logger
        Logger log = Logger.getLogger("hib");

        // create hibernate configuration
        Configuration cfg = new Configuration();
        // read configuration file: hibernate.cfg.xml
        cfg = cfg.configure();
        // create SessionFactory using confuguration loaded
        SessionFactory sf = cfg.buildSessionFactory();
        // open session using session factory. this is a one time step
        Session s = sf.openSession();
        // begin transaction
        Transaction tx = s.beginTransaction();

        // create Employee object and set data
        Employee emp = new Employee();
        // set employee id, this will be the primary key
        emp.setEmpId(100);
        // employee name
        emp.setEmpName("Srinivas");
        // save employee data
        Integer pk = (Integer) s.save(emp);

        log.info("The inserted record's primary key is : " + pk);
        // commit will persiste changes in database
        tx.commit();
        // close sessing will release database connection
        s.close();
        // close session factory will release any resources held by hibernate
        sf.close();
    }

}
