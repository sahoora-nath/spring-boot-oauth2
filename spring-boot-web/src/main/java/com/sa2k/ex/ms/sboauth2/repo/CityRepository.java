package com.sa2k.ex.ms.sboauth2.repo;

import com.sa2k.ex.ms.sboauth2.model.CityDBO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<CityDBO, Long> {

}