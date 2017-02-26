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
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/furniture", // change to your database name
                   "root", //change to your connection username
                    "root"); //same for password
            OrderDAO orderDao = new OrderDaoImpl(conn);
            System.out.println(orderDao.getAll());

            Order order = createOrder();
            orderDao.create(order);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static Order createOrder() {
        Order order = new Order();
        java.util.Date now = new java.util.Date();
        order.setOrderDate(new Date(now.getTime()));
        order.setCost(200.0);
        order.setExecutionDate(new Date(now.getTime() + 1000));
        Dealer dealer = new Dealer();
        dealer.setId((long) 1);
        dealer.setCurrentAccount((long) 123124);
        dealer.setTitle("dealertitle1");
        order.setDealer(dealer);
        return order;
    }

}
