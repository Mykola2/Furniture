package org.training.entity;

public class Sofa {
  private Long id;
  private String barCode;
  private String type;
  private java.sql.Date date;
  private Order order;
  private Employee employee;
  private Project project;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getBarCode() {
    return barCode;
  }

  public void setBarCode(String barCode) {
    this.barCode = barCode;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public java.sql.Date getDate() {
    return date;
  }

  public void setDate(java.sql.Date date) {
    this.date = date;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }
}
