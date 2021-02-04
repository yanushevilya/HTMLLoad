package AbstractFactory2.Factory;
import AbstractFactory2.Shoose.iShoose;
import AbstractFactory2.Short.iShort;


public interface iFactory {
    iShoose create_shoose();
    iShort create_short();
}
