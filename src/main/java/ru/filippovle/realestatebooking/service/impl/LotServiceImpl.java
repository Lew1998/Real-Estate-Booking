package ru.filippovle.realestatebooking.service.impl;


import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import ru.filippovle.realestatebooking.mapper.LotMapper;
import ru.filippovle.realestatebooking.model.dto.LotDTO;
import ru.filippovle.realestatebooking.specification.LotSpecifications;
import ru.filippovle.realestatebooking.model.dto.LotFilterDTO;
import ru.filippovle.realestatebooking.model.entity.Lot;
import ru.filippovle.realestatebooking.repository.LotRepository;
import ru.filippovle.realestatebooking.service.LotService;

import java.util.List;


@Service
@RequiredArgsConstructor
public class LotServiceImpl implements LotService {

    private final LotRepository lotRepository;
    private final LotMapper mapper;

    @Override
    public List<LotDTO> getFilteredLots(LotFilterDTO filterDTO) {
        Specification<Lot> spec = Specification.where(LotSpecifications.titleContains(filterDTO.getTitle()))
                .and(LotSpecifications.cityEquals(filterDTO.getCity()))
                .and(LotSpecifications.addressContains(filterDTO.getAddress()))
                .and(LotSpecifications.areaBetween(filterDTO.getMinArea(), filterDTO.getMaxArea()))
                .and(LotSpecifications.floorBetween(filterDTO.getMinFloor(), filterDTO.getMaxFloor()))
                .and(LotSpecifications.roomsBetween(filterDTO.getMinRooms(), filterDTO.getMaxRooms()))
                .and(LotSpecifications.isNotBooked());

        return mapper.listEntityToDto(lotRepository.findAll(spec));
    }
}