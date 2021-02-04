package AbstractFactory2.Factory;

import AbstractFactory2.Shoose.ManShoose;
import AbstractFactory2.Shoose.iShoose;
import AbstractFactory2.Short.ManShort;
import AbstractFactory2.Short.iShort;

public class ManFactory implements iFactory {
    @Override
    public iShoose create_shoose() {
        return new ManShoose();
    }

    @Override
    public iShort create_short() {
        return new ManShort();
    }
}
