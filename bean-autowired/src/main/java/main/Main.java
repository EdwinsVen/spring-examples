package main;

import beans.Location;
import beans.Person;
import config.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Person p = context.getBean(Person.class);

        System.out.println("Person's name: " + p.getName());
        System.out.println("Person's Job: " + p.getJob());
        System.out.println("Person's location: " + p.getLocation());
        System.out.println("Person's phone number: " +
                p.getNumber().getAreaCode() + "-" + p.getNumber().getPrefix() + "-" + p.getNumber().getLineNumber());



    }
}
