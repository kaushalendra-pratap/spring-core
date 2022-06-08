package com.sunglowsys.test;

import com.sunglowsys.domain.Patient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ASS {
    public static void main(String[] args) {
        System.out.println("hello");
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Patient patient = new Patient(); context.getBean("patient");
        patient.getId();
        patient.getFirstName();
        patient.getLastName();
        patient.getEmail();
        System.out.println(patient);
    }
}
