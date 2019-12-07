/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.*;  
  
/**
 *
 * @author ALVIN
 */
public class Test {
    public static void main(String args[])
    {
        Resource resource = new ClassPathResource("applicationContext.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
        
        ApplicationContext context;  
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Student student = (Student)factory.getBean("studentbean");
        student.displayInfo();
    }
}
