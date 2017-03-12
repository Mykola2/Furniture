package org.kpi.entity;

import javax.persistence.*;

@Entity
@Table(name = "`order`")
public class Order {
  @Id
  @GeneratedValue
  @Column(name = "idOrder")
  private Integer id;

  private java.sql.Date orderDate;

  private java.sql.Date executionDate;

  @Column
  private Double cost;

  @ManyToOne(fetch=FetchType.LAZY)
  @JoinColumn(name="Dealer_idDealer")
  private Dealer dealer;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public java.sql.Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(java.sql.Date orderDate) {
    this.orderDate = orderDate;
  }

  public java.sql.Date getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(java.sql.Date executionDate) {
    this.executionDate = executionDate;
  }

  public Double getCost() {
    return cost;
  }

  public void setCost(Double cost) {
    this.cost = cost;
  }

  public Dealer getDealer() {
    return dealer;
  }

  public void setDealer(Dealer dealer) {
    this.dealer = dealer;
  }

  @Override
  public String toString() {
    return "Order " +
            "id=" + id +
            ", orderDate=" + orderDate +
            ", executionDate=" + executionDate +
            ", cost=" + cost +
            ", dealer=" + dealer.getTitle() +
            ' ';
  }
}
