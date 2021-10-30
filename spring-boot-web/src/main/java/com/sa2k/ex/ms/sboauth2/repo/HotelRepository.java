package com.sa2k.ex.ms.sboauth2.repo;

import com.sa2k.ex.ms.sboauth2.model.HotelDBO;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotelRepository extends JpaRepository<HotelDBO, Long> {
    @Query("select h from HotelDBO h where h.city.id=:cityId order by abs(h.city.cityCentreLatitude-h.latitude), abs(h.city.cityCentreLongitude-h.longitude)")
    List<HotelDBO> findNearest3HotelByCityCenter(@Param("cityId") Long cityId, Pageable pageable);

    default List<HotelDBO> findNearest3HotelByCityCenter(Long cityId) {
        return findNearest3HotelByCityCenter(cityId, PageRequest.of(0,3));
    }
}
