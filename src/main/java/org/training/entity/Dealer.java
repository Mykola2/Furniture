package org.training.entity;

public class Dealer {
  private Long id;
  private String title;
  private String address;
  private String phone;
  private Long currentAccount;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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

  public Long getCurrentAccount() {
    return currentAccount;
  }

  public void setCurrentAccount(Long currentAccount) {
    this.currentAccount = currentAccount;
  }
}
