package com.cpc.dp.examples;

public class UserDto {

  private static String name;
  private static String lastName;
  private static String email;
  private static String password;
  private static String cellphone;
  private static String role;
  private static String address;

  public UserDto(String name, String lastName, String email, String password, String cellphone, String role,
      String address) {
    this.name = name;
    this.lastName = lastName;
    this.email = email;
    this.password = password;
    this.role = role;
    this.address = address;
    this.cellphone = cellphone;
  }

  public UserDto(Builder builder) {
    this.name = builder.name;
    this.lastName = builder.lastName;
    this.email = builder.email;
    this.password = builder.password;
    this.cellphone = builder.cellphone;
    this.role = builder.role;
    this.address = builder.address;
  }

  // ? Start Builder Class
  public static class Builder {

    private String name;
    private String lastName;
    private String email;
    private String password;
    private String cellphone;
    private String role;
    private String address;

    // * You can find the name of the method as "set<Name of the attribute"
    // * Or only with the default name.
    public UserDto.Builder name(String name) {
      this.name = name;
      return this;
    }

    public UserDto.Builder lastName(String lastname) {
      this.lastName = lastname;
      return this;
    }

    public UserDto.Builder email(String lastname) {
      this.email = email;
      return this;
    }

    public UserDto.Builder password(String lastname) {
      this.password = password;
      return this;
    }

    public UserDto.Builder cellphone(String cellphone) {
      this.cellphone = cellphone;
      return this;
    }

    public UserDto.Builder role(String role) {
      this.role = role;
      return this;
    }

    public UserDto.Builder address(String address) {
      this.address = address;
      return this;
    }

    public UserDto build() {
      return new UserDto(this);
    }

  }

}
