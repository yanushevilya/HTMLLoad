package AbstractFactory.Factory;

import AbstractFactory.pChair.iChair;
import AbstractFactory.pSofa.iSofa;
import AbstractFactory.pTable.iTable;

public interface iFactory {
    iChair createChair();
    iSofa createSofa();
    iTable createTable();

}
