package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        var context = new AnnotationConfigApplicationContext(ProjectConfigClass.class);

        Parrot p = context.getBean("parrot1",  Parrot.class);
        System.out.println(p.getName());

        String hello = context.getBean(String.class);
        System.out.println(hello);

        Integer i = context.getBean(Integer.class);
        System.out.println(i);
    }
}
