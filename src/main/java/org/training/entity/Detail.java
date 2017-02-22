package org.training.entity;

public class Detail {
  private Long id;
  private String material;
  private String type;
  private String characteristic;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getCharacteristic() {
    return characteristic;
  }

  public void setCharacteristic(String characteristic) {
    this.characteristic = characteristic;
  }
}
