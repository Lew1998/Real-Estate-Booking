package ru.filippovle.realestatebooking.service;

import ru.filippovle.realestatebooking.model.dto.LotFilterDTO;
import ru.filippovle.realestatebooking.model.entity.Lot;

import java.util.List;

public interface LotService {
    List<Lot> getFilteredLots(LotFilterDTO filterDTO);
}