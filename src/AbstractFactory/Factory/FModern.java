package AbstractFactory.Factory;

import AbstractFactory.pChair.iChair;
import AbstractFactory.pChair.pClassicChair;
import AbstractFactory.pChair.pModernChair;
import AbstractFactory.pSofa.iSofa;
import AbstractFactory.pSofa.pModernSofa;
import AbstractFactory.pTable.iTable;
import AbstractFactory.pTable.pModernTable;

public class FModern implements iFactory{

    @Override
    public iChair createChair() {
        return new pModernChair();
    }

    @Override
    public iSofa createSofa() {
        return new pModernSofa();
    }

    @Override
    public iTable createTable() {
        return new pModernTable();
    }
}
