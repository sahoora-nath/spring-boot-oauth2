package com.sa2k.ex.ms.sboauth2.service;

import com.sa2k.ex.ms.sboauth2.model.CityDBO;

import java.util.List;

public interface CityService {
    CityDBO findCityById(Long Id);
    List<CityDBO> getAllCity();
}
