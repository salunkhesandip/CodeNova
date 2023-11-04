package com.cleancoders.features.java.codenova.dto;

 public record Person(String name, int age) {
  public Person {
   if (age < 0) {
    throw new IllegalArgumentException("Age is negative");
   }
  }
 }
