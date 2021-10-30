package com.sa2k.ex.ms.sboauth2.controllers;

import com.sa2k.ex.ms.sboauth2.model.CityDBO;
import com.sa2k.ex.ms.sboauth2.service.CityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/city")
public class CityRestController {
    private CityService cityService;

    public CityRestController(CityService cityService) {
        this.cityService = cityService;
    }

    @GetMapping
    public List<CityDBO> getAllCity() {
        return cityService.getAllCity();
    }
}
