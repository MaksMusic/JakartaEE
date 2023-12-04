package com.example.jakartaee.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cart {
private String name;
private int count;

}
