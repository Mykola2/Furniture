package org.kpi;

import org.kpi.dao.OrderDAO;
import org.kpi.dao.OrderDaoImpl;
import org.kpi.entity.Dealer;
import org.kpi.entity.Order;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
            OrderDaoImpl orderDao = new OrderDaoImpl();
            //orderDao.openCurrentSessionwithTransaction();
            System.out.println(orderDao.getAll());
            //Order order = createOrder();
           // orderDao.create(order);
           // orderDao.closeCurrentSessionwithTransaction();

    }

    private static Order createOrder() {
        Order order = new Order();
        java.util.Date now = new java.util.Date();
        order.setOrderDate(new Date(now.getTime()));
        order.setCost(800.0);
        order.setExecutionDate(new Date(now.getTime()));
        Dealer dealer = new Dealer();
        dealer.setId(1);
        dealer.setCurrentAccount(123124);
        dealer.setTitle("dealertitle1");
        order.setDealer(dealer);
        return order;
    }

}
