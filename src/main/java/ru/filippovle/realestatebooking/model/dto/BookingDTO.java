package ru.filippovle.realestatebooking.model.dto;

import lombok.Data;

@Data
public class BookingDTO {
    private String clientFullName;
    private Long lotId;
    private String contactPhone;
}