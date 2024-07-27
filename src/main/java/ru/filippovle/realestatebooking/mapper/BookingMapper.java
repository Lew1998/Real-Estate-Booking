package ru.filippovle.realestatebooking.mapper;

import org.mapstruct.Mapper;
import ru.filippovle.realestatebooking.model.dto.BookingDTO;
import ru.filippovle.realestatebooking.model.entity.Booking;

@Mapper(componentModel = "spring")
public interface BookingMapper {
    BookingDTO entityToDTO(Booking booking);

    Booking dtoToEntity(BookingDTO dto);
}
