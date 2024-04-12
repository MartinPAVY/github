package epsi.software.sakila.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CountryServiceTest {

    @Autowired
    CountryService service;


    @Test
    void read() {
    }

    @Test
    void readAll() {
        service.readAll().stream().forEach(c-> System.out.println(c));
    }
}