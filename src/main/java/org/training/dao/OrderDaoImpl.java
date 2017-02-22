package org.training.dao;

import org.training.entity.Dealer;
import org.training.entity.Order;
import org.training.entity.Sofa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class OrderDaoImpl implements OrderDAO {

    private final String SELECT_ALL = "select * from furniture.order " +
            "join dealer on furniture.order.Dealer_idDealer = dealer.idDealer";

    private Connection connection;

    public OrderDaoImpl(Connection connection) {
        this.connection = connection;
    }

    public List<Order> getAll() {
        List<Order> orders = new ArrayList<>();
        try (PreparedStatement statement = connection.prepareStatement(SELECT_ALL)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Order order = new Order();
                order.setId(resultSet.getLong("idOrder"));
                order.setOrderDate(resultSet.getDate("Order Date"));
                order.setExecutionDate(resultSet.getDate("Execution Date"));
                order.setCost(resultSet.getDouble("Cost"));
                Dealer dealer = getDealer(resultSet);
                order.setDealer(dealer);
                orders.add(order);
            }
            return orders;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    private Dealer getDealer(ResultSet resultSet) throws SQLException {
        Dealer dealer = new Dealer();
        dealer.setId(resultSet.getLong("idDealer"));
        dealer.setAddress(resultSet.getString("Address"));
        dealer.setTitle(resultSet.getString("Title"));
        dealer.setCurrentAccount(resultSet.getLong("Current Account"));
        dealer.setPhone(resultSet.getString("Phone"));
        return dealer;
    }


    public Sofa getById(Long id) {
        return null;
    }

    public void create(Sofa sofa) {

    }
}
