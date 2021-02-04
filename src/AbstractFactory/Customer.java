package AbstractFactory;

import AbstractFactory.pTable.iTable;
import AbstractFactory.pChair.iChair;
import AbstractFactory.pSofa.iSofa;
import AbstractFactory.Factory.iFactory;

public class Customer {

    // Абстрактная мебель
    iTable table;
    iSofa sofa;
    iChair chair;

    // Конструктор, который принимает в качестве параметра Определенную_Фабрику,
    // которая возвращает Определенную_Продукцию
    Customer(iFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
        table = factory.createTable();
    }

    // объект Customer (Заказчик) может имеет метод paint(),
    // который вызывает определенный метод paint() у соответствующего объекта
    void paint() {
        chair.paint();
        sofa.paint();
        table.paint();
    }
}
