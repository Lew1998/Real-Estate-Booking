package ru.filippovle.realestatebooking.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.filippovle.realestatebooking.model.entity.Booking;
import ru.filippovle.realestatebooking.repository.BookingRepository;
import ru.filippovle.realestatebooking.service.BookingService;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    @Override
    public Booking bookLot(String clientName, Long lotId, String contactPhone) {
        Booking booking = new Booking();
        booking.setClientFullName(clientName);
        booking.setLotId(lotId);
        booking.setContactPhone(contactPhone);
        booking.setBookingTime(LocalDateTime.now());

        return bookingRepository.save(booking);
    }
}