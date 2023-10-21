package mycompany.consumer;

import java.util.*;
import mycompany.api.*;
import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;
import static java.util.stream.Collectors.toList;

public class App {
    public static void main(String[] args) {
        List<Contract> list =
        ServiceLoader.load(Contract.class).stream().map(Provider::get).collect(toList());
        if (list.size() > 0) {
            Contract contract = list.get(0);
            contract.doSomething("Sam");
        } else {
            System.out.println("unable to load service provider");
        }
    }
}