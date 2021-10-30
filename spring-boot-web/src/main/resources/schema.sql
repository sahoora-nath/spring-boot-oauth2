drop table HOTEL if exists;

CREATE TABLE Hotel (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    deleted BOOL,
    rating DECIMAL(3, 2),
    city_id NUMBER(3),
    address VARCHAR(50),
    latitude DECIMAL(10, 7),
    longitude DECIMAL(10, 7),
    PRIMARY KEY (id)
);

drop table city if exists;
CREATE TABLE city (
    id   INTEGER      NOT NULL AUTO_INCREMENT,
    name VARCHAR(128) NOT NULL,
    city_centre_latitude DECIMAL(10, 7),
    city_centre_longitude DECIMAL(10, 7),
    PRIMARY KEY (id)
);