package org.kpi.dao;

import org.kpi.entity.Order;

import java.util.List;

/**
 * Created on 2/19/2017.
 */
public interface OrderDAO {

    List getAll();

    Order getById(Long id);

    void create(Order order);

    void delete(Order id);

}
