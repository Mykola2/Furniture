package org.training.entity;

public class Project {
  private Long id;
  private java.sql.Date date;
  private String drawing;
  private Employee employee;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public java.sql.Date getDate() {
    return date;
  }

  public void setDate(java.sql.Date date) {
    this.date = date;
  }

  public String getDrawing() {
    return drawing;
  }

  public void setDrawing(String drawing) {
    this.drawing = drawing;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }
}
