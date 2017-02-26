package org.kpi.dao;

import org.kpi.entity.Dealer;
import org.kpi.entity.Order;
import org.kpi.entity.Sofa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class OrderDaoImpl implements OrderDAO {

    private final String SELECT_ALL = "select * from furniture.order " +
            "join dealer on furniture.order.Dealer_idDealer = dealer.idDealer";

    private final String DELETE_BY_ID = "DELETE from furniture.order " +
            "where idOrder = ?";

    private final String CREATE = "INSERT INTO `furniture`.`order`\n" +
            "(`Order Date`,\n" +
            "`Execution Date`,\n" +
            "`Cost`,\n" +
            "`Dealer_idDealer`)\n" +
            " VALUES (?,?,?,?) ";

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


    public Order getById(Long id) {
        return null;
    }

    public void create(Order order) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(CREATE)) {
            preparedStatement.setDate(1, order.getOrderDate());
            preparedStatement.setDate(2, order.getExecutionDate());
            preparedStatement.setDouble(3, order.getCost());
            preparedStatement.setLong(4, order.getDealer().getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void deleteById(Long id) {
        try (PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BY_ID)) {
            preparedStatement.setLong(1,id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
