package org.osgiusers.hello.service;

public class HelloServiceImpl implements HelloService{

    public void print(String text){

        System.out.println("HELLO SERVICE: "+text);

    }
}
