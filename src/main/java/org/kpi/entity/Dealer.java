package org.kpi.entity;

import javax.persistence.*;

@Entity
@Table(name = "dealer")
public class Dealer {

  @Column(name = "idDealer")
  @Id
  @GeneratedValue
  private Integer id;

  @Column
  private String title;

  @Column
  private String address;

  @Column
  private String phone;

  @Column(name = "currentAccount")
  private Integer currentAccount;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Integer getCurrentAccount() {
    return currentAccount;
  }

  public void setCurrentAccount(Integer currentAccount) {
    this.currentAccount = currentAccount;
  }
}
