package ru.filippovle.realestatebooking.service;

import ru.filippovle.realestatebooking.model.dto.BookingDTO;

public interface BookingService {
    BookingDTO bookLot(BookingDTO dto);
}