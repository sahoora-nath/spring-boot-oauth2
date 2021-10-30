package com.sa2k.ex.ms.sboauth2.service.impl;

import com.sa2k.ex.ms.sboauth2.exception.ElementNotFoundException;
import com.sa2k.ex.ms.sboauth2.model.CityDBO;
import com.sa2k.ex.ms.sboauth2.repo.CityRepository;
import com.sa2k.ex.ms.sboauth2.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    private CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public CityDBO findCityById(Long id) {
        return cityRepository
                .findById(id)
                .orElseThrow(() -> new ElementNotFoundException("Could not find city with ID provided"));
    }

    @Override
    public List<CityDBO> getAllCity() {
        return cityRepository.findAll();
    }
}
