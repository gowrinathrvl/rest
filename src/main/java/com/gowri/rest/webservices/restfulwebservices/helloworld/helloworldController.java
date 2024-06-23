package com.gowri.rest.webservices.restfulwebservices.helloworld;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//controller
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class helloworldController {
    //Get
    //URI - /hello-world
    //method - "hello world"
    @GetMapping ( path = "/hello-world")
    public String helloWorld(){
        return "Hello World";
    }
   //hello-world-bean
    @GetMapping ( path = "/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        throw new RuntimeException("Some Error Happend, contact customer support ***-***-****");
//        return new HelloWorldBean("Hello World -changed");
    }
    //hello-world/path-variable
    @GetMapping ( path = "/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPathVariable(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s", name));
    }
}
