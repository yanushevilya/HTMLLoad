package AbstractFactory.Factory;

import AbstractFactory.pChair.iChair;
import AbstractFactory.pChair.pClassicChair;
import AbstractFactory.pSofa.iSofa;
import AbstractFactory.pSofa.pClassicSofa;
import AbstractFactory.pTable.iTable;
import AbstractFactory.pTable.pClassicTable;

public class FClassic implements iFactory{

    @Override
    public iChair createChair() {
        return new pClassicChair();
    }

    @Override
    public iSofa createSofa() {
        return new pClassicSofa();
    }

    @Override
    public iTable createTable() {
        return new pClassicTable();
    }
}
