package br.com.educandoweb.course.entities;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class User implements Serializable {

  private static final long serialVersionUID = 1L;
  private UUID id;
  private String name;
  private String phone;
  private String password;
  private String number;

  public User() {}

  public User(UUID id, String name, String phone, String password) {
    this.id = id;
    this.name = name;
    this.phone = phone;
    this.password = password;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof User user)) return false;
    return Objects.equals(getId(), user.getId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getId());
  }
}
