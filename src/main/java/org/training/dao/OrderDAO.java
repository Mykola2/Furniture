package org.training.dao;

import org.training.entity.Order;
import org.training.entity.Sofa;

import java.util.List;

/**
 * Created on 2/19/2017.
 */
public interface OrderDAO {

    List<Order> getAll();

    Sofa getById(Long id);

    void create(Sofa sofa);

}
