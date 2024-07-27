package ru.filippovle.realestatebooking.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.filippovle.realestatebooking.mapper.BookingMapper;
import ru.filippovle.realestatebooking.model.dto.BookingDTO;
import ru.filippovle.realestatebooking.model.entity.Booking;
import ru.filippovle.realestatebooking.repository.BookingRepository;
import ru.filippovle.realestatebooking.service.BookingService;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;
    private final BookingMapper mapper;

    @Override
    public BookingDTO bookLot(BookingDTO dto) {
        Booking booking = mapper.dtoToEntity(dto);
        booking.setBookingTime(LocalDateTime.now());
        return mapper.entityToDTO(bookingRepository.save(booking));
    }
}