package main;

import config.ParameterConfig;
import config.MethodCallConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MethodCallConfig.class);

        Person p = context.getBean(Person.class);
        System.out.println("Dude's name: " + p.getName());
        System.out.println("Dude's job: " + p.getJob() + System.lineSeparator());

        Job j = context.getBean(Job.class);
        System.out.println("Context Job: " + j);


        System.out.println("---------------------------------------------------------------------------------------------------");
        AnnotationConfigApplicationContext context2 = new AnnotationConfigApplicationContext(ParameterConfig.class);

        Person p2 = context2.getBean(Person.class);
        System.out.println("Dudette's name: " + p2.getName());
        System.out.println("Dudette's job: " + p2.getJob() + System.lineSeparator());

        Job j2 = context2.getBean(Job.class);
        System.out.println("Context Job: " + j2);

    }
}
