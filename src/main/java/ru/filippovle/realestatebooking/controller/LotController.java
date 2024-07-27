package ru.filippovle.realestatebooking.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.filippovle.realestatebooking.model.dto.LotDTO;
import ru.filippovle.realestatebooking.model.dto.LotFilterDTO;
import ru.filippovle.realestatebooking.service.LotService;

import java.util.List;

@RestController
@RequestMapping("/api/lots")
@RequiredArgsConstructor
public class LotController {

    private final LotService lotService;

    @GetMapping("/search")
    public List<LotDTO> getFilteredLots(@ModelAttribute LotFilterDTO filterDTO) {
        return lotService.getFilteredLots(filterDTO);
    }
}