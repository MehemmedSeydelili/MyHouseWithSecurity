package com.example.MyHouseWithSecurity.model.view;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class HomeView {

    private Long id;
    private Integer price;
    private Integer squareMeter;
    private Integer roomCount;
    private String location;
    private Boolean isActive;
    private LocalDateTime createdAt;

}
