package ru.filippovle.realestatebooking.model.dto;

import lombok.Data;

@Data
public class BookingRequestDTO {
    private String clientName;
    private Long lotId;
    private String contactPhone;
}