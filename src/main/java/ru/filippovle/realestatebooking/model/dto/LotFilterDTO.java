package ru.filippovle.realestatebooking.model.dto;

import lombok.Data;

@Data
public class LotFilterDTO {
    private String title;
    private String city;
    private String address;
    private Double minArea;
    private Double maxArea;
    private Integer minFloor;
    private Integer maxFloor;
    private Integer minRooms;
    private Integer maxRooms;
}