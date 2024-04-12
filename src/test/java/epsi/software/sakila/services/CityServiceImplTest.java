package epsi.software.sakila.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.*;

@Service
class CityServiceImplTest {

    @Autowired
    CountryService service;
    @Test
    void create() {
    }

    @Test
    void read() {
    }

    @Test
    void readAll() {
        service.readAll().stream().forEach(c-> System.out.println(c));
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}