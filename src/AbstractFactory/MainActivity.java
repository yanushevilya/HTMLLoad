package AbstractFactory;

import AbstractFactory.Factory.FClassic;
import AbstractFactory.Factory.FModern;

public class MainActivity {
    public static void main(String[] args) {
        Customer customer = new Customer(new FClassic());
        customer.paint();
    }
}
