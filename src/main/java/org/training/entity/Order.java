package org.training.entity;

public class Order {
  private Long id;
  private java.sql.Date orderDate;
  private java.sql.Date executionDate;
  private Double cost;
  private Dealer dealer;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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
