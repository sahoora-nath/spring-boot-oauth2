package com.sa2k.ex.ms.sboauth2.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name="Hotel")
public class HotelDBO implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double rating;

    @ManyToOne(fetch = FetchType.EAGER)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private CityDBO city;

    private String address;
    private double latitude;
    private double longitude;
    private boolean deleted = false;

    public HotelDBO() {
    }

    public HotelDBO(Long id, String name, Double rating, CityDBO city, String address, double latitude, double longitude, boolean deleted) {
        this.id = id;
        this.name = name;
        this.rating = rating;
        this.city = city;
        this.address = address;
        this.latitude = latitude;
        this.longitude = longitude;
        this.deleted = deleted;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public CityDBO getCity() {
        return city;
    }

    public void setCity(CityDBO city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public HotelDBO build() {
        return new HotelDBO(id, name, rating, city, address, latitude, longitude, deleted);
    }
}
