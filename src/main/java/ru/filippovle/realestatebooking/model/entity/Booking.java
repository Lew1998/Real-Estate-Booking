package ru.filippovle.realestatebooking.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String clientFullName;
    private LocalDateTime bookingTime;
    private String contactPhone;
    private Long lotId;
}
