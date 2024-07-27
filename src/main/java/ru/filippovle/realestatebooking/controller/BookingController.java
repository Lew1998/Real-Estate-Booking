package ru.filippovle.realestatebooking.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.filippovle.realestatebooking.model.dto.BookingDTO;
import ru.filippovle.realestatebooking.service.BookingService;

@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
public class BookingController {

    private final BookingService bookingService;

    @PostMapping
    public BookingDTO bookLot(@RequestBody BookingDTO dto) {
        return bookingService.bookLot(dto);
    }
}