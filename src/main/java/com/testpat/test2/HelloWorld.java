package com.testpat.test2;

import org.springframework.context.annotation.Bean;

public class HelloWorld implements HelloWorldInterface {

    @Bean
    public void sayHelloWorld() {
        System.out.println("hello world !");
    }

    public void sayNothing() {
        System.out.println("nothing!!");
    }
}
