package mycompany.provider;

import mycompany.api.*;

public class Implementation implements Contract {
    public void doSomething(String args) {
        System.out.println("Hello " + args);
    }
}