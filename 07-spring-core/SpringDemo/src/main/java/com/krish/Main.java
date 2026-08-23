package com.krish;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Alien alien1 = (Alien) context.getBean("alien1");
        alien1.code();
        Alien alien2 = (Alien) context.getBean("alien1");
        alien2.code();

        System.out.println(alien1.age);
        System.out.println(alien2.age);

        alien1.age = 21;
        System.out.println(alien1.age);
        System.out.println(alien2.age);

        Laptop laptop = (Laptop) context.getBean("laptop");
        laptop.playGame();
    }
}