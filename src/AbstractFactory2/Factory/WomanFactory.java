package AbstractFactory2.Factory;

import AbstractFactory2.Shoose.WomanShoose;
import AbstractFactory2.Shoose.iShoose;
import AbstractFactory2.Short.WomanShort;
import AbstractFactory2.Short.iShort;

public class WomanFactory implements iFactory{

    @Override
    public iShoose create_shoose() {
        return new WomanShoose();
    }

    @Override
    public iShort create_short() {
        return new WomanShort();
    }
}
