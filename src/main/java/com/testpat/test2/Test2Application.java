package com.testpat.test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Test2Application {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("HelloWorld.xml");

        HelloWorld hello = (HelloWorld) context.getBean("HelloWorld");
        hello.sayHelloWorld();
        hello.sayNothing();
        SpringApplication.run(Test2Application.class, args);
    }
}
