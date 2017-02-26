package org.kpi.dao;

import org.kpi.entity.Order;
import org.kpi.entity.Sofa;

import java.util.List;

/**
 * Created on 2/19/2017.
 */
public interface OrderDAO {

    List<Order> getAll();

    Order getById(Long id);

    void create(Order order);

    void deleteById(Long id);

}
