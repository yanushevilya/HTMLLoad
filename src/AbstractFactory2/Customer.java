package AbstractFactory2;

import AbstractFactory2.Factory.iFactory;
import AbstractFactory2.Short.iShort;
import AbstractFactory2.Shoose.iShoose;

public class Customer {
    iShort shorte;
    iShoose shoose;

    Customer(iFactory factory) {
        shorte = factory.create_short();
        shoose = factory.create_shoose();
    }

    void shit() {
        shorte.shit();
        shoose.shit();
    }

}
