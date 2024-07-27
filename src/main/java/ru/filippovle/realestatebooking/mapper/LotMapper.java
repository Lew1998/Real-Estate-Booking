package ru.filippovle.realestatebooking.mapper;

import org.mapstruct.Mapper;
import ru.filippovle.realestatebooking.model.dto.LotDTO;
import ru.filippovle.realestatebooking.model.entity.Lot;

import java.util.List;

@Mapper(componentModel = "spring")
public interface LotMapper {
    LotDTO entityToDto(Lot lot);

    List<LotDTO> listEntityToDto(List<Lot> lot);
}
