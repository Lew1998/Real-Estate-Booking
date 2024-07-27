package ru.filippovle.realestatebooking.model.dto;

import lombok.Data;

@Data
public class LotDTO {
    private Long id;
    private String title;
    private String city;
    private String address;
    private Double area;
    private Integer floor;
    private Integer rooms;
}
