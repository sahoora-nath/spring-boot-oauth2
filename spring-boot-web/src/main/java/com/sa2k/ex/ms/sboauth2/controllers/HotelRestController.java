package com.sa2k.ex.ms.sboauth2.controllers;

import com.sa2k.ex.ms.sboauth2.model.HotelDBO;
import com.sa2k.ex.ms.sboauth2.service.HotelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hotel")
public class HotelRestController {
    private HotelService hotelService;

    public HotelRestController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping
    public List<HotelDBO> findAllHotels() {
        return hotelService.getAllHotels();
    }

    @GetMapping("/{id}")
    public HotelDBO getHotelById(@PathVariable(value = "id") Long id) {
        return hotelService.getHotelById(id);
    }
}
