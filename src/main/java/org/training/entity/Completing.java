package org.training.entity;

public class Completing {
  private Long id;
  private Double price;
  private String producer;
  private java.sql.Date date;
  private java.sql.Date operationalLifetime;
  private Detail detail;

  public Long getIdcompleting() {
    return id;
  }

  public void setIdcompleting(Long idcompleting) {
    this.id = idcompleting;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public String getProducer() {
    return producer;
  }

  public void setProducer(String producer) {
    this.producer = producer;
  }

  public java.sql.Date getDate() {
    return date;
  }

  public void setDate(java.sql.Date date) {
    this.date = date;
  }

  public java.sql.Date getOperationalLifetime() {
    return operationalLifetime;
  }

  public void setOperationalLifetime(java.sql.Date operationalLifetime) {
    this.operationalLifetime = operationalLifetime;
  }

  public Detail getDetail() {
    return detail;
  }

  public void setDetail(Detail detail) {
    this.detail = detail;
  }
}
