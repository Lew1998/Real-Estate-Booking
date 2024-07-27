package ru.filippovle.realestatebooking.service;

import ru.filippovle.realestatebooking.model.dto.LotDTO;
import ru.filippovle.realestatebooking.model.dto.LotFilterDTO;

import java.util.List;

public interface LotService {
    List<LotDTO> getFilteredLots(LotFilterDTO filterDTO);
}