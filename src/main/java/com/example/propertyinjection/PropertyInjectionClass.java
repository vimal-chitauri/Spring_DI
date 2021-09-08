package com.example.propertyinjection;

import aref.Car;
import emp.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropertyInjectionClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configNew.xml");
        //primitive Data injection
        Student student1 = (Student) context.getBean("Student");
        //collection type data injection
        Emp emp = (Emp) context.getBean("emp");
        //refrence type data injection
        Car car = (Car) context.getBean("car");
        System.out.println(student1);
        System.out.println(emp);
        System.out.println(car);
    }
}
