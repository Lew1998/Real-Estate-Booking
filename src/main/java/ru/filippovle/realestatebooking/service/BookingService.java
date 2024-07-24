package ru.filippovle.realestatebooking.service;

import ru.filippovle.realestatebooking.model.entity.Booking;

public interface BookingService {
    Booking bookLot(String clientName, Long lotId, String contactPhone);
}