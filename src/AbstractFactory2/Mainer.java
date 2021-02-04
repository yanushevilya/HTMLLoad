package AbstractFactory2;

import AbstractFactory2.Factory.ManFactory;

public class Mainer {


    public static void main(String[] args) {
        Customer customer = new Customer(new ManFactory());
        customer.shit();
    }
}
