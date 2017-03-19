package org.kpi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.kpi.entity.Dealer;
import org.kpi.entity.Order;
import org.kpi.entity.Sofa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class OrderDaoImpl implements OrderDAO {

    EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "JPA" );

    EntityManager em = emfactory.createEntityManager();


    public List<Order> getAll() {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Order> cq = cb.createQuery(Order.class);
        Root<Order> rootEntry = cq.from(Order.class);
        CriteriaQuery<Order> all = cq.select(rootEntry);
        TypedQuery<Order> allQuery = em.createQuery(all);
        return allQuery.getResultList();
    }


    public Order getById(Long id) {
        return em.find(Order.class,id);
    }

    @Override
    public void create(Order order) {
        em.merge(order);
    }

    @Override
    public void delete(Order order) {
       em.remove(order);
    }
}
