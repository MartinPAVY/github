package epsi.software.sakila.controllers;

import epsi.software.sakila.entities.Country;
import epsi.software.sakila.services.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/country")
public class CountryController {

    private static final Logger log = LoggerFactory.getLogger(CountryController.class);

    private CountryService service;

    public CountryController(CountryService service) {
        this.service = service;
    }

    @GetMapping(value = "/all", produces = {"application/json", "application/xml"})
    public List<Country> getAll() {
        log.trace("call the get all country");
        return service.readAll();
    }

    @GetMapping(value = "/{id}", produces = {"application/json", "application/xml"})
    public ResponseEntity<Country> getCountryById(@PathVariable("id") int id) {
        log.trace("Get country by ID: {}", id);
        Country country = service.read(Long.valueOf(id));
        if (country != null) {
            return ResponseEntity.ok(country);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
