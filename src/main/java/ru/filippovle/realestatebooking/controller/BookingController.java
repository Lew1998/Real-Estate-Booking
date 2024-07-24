package ru.filippovle.realestatebooking.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.filippovle.realestatebooking.model.dto.BookingRequestDTO;
import ru.filippovle.realestatebooking.model.entity.Booking;
import ru.filippovle.realestatebooking.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @PostMapping
    public Booking bookLot(@RequestBody BookingRequestDTO bookingRequest) {
        return bookingService.bookLot(
                bookingRequest.getClientName(),
                bookingRequest.getLotId(),
                bookingRequest.getContactPhone()
        );
    }
}