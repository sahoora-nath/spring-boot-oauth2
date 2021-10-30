package com.sa2k.ex.ms.sboauth2.service;

import com.sa2k.ex.ms.sboauth2.model.HotelDBO;

import java.util.List;

public interface HotelService {

    List<HotelDBO> getAllHotels();

    HotelDBO getHotelById(Long id);
}
