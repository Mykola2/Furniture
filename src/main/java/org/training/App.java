package org.training;

import org.training.dao.OrderDAO;
import org.training.dao.OrderDaoImpl;

import java.sql.Connection;
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


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
