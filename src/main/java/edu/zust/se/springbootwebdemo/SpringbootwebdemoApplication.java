package edu.zust.se.springbootwebdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringbootwebdemoApplication {

    @PostConstruct
    public void initMethod(){
        System.out.println("------------Hello world!------------");
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringbootwebdemoApplication.class, args);
    }

}
