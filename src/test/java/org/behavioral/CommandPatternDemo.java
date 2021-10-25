package org.behavioral;

import org.zyl.design.behavioral.command.Broker;
import org.zyl.design.behavioral.command.BuyStock;
import org.zyl.design.behavioral.command.SellStock;
import org.zyl.design.behavioral.command.Stock;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Stock abcStock = new Stock();

        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);

        broker.placeOrders();
    }
}
