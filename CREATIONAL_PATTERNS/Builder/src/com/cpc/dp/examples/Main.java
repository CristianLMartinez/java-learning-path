package com.cpc.dp.examples;

public class Main {

  public static void main(String[] args) {
    UserDto user = new UserDto.Builder()
        .name("Cristian")
        .lastName("Lopez")
        .email("cristian@email.com")
        .address("Colombia")
        .cellphone("313 323 32 32")
        .role("CLIENT")
        .build();
  }

}
