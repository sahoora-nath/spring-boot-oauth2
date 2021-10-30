package com.sa2k.ex.ms.sboauth2.service.impl;

import com.sa2k.ex.ms.sboauth2.model.HotelDBO;
import com.sa2k.ex.ms.sboauth2.repo.HotelRepository;
import com.sa2k.ex.ms.sboauth2.service.HotelService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService {
    private HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public List<HotelDBO> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public HotelDBO getHotelById(Long id) {
        Optional<HotelDBO> hotelDBOOptional = hotelRepository.findById(id);
        return hotelDBOOptional.orElse(null);
    }
}
