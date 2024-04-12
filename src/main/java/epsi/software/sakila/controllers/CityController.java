package epsi.software.sakila.controllers;

import epsi.software.sakila.entities.City;
import epsi.software.sakila.services.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {

    private static final Logger log = LoggerFactory.getLogger(CityController.class);

    private CityService service;

    public CityController(CityService service) {
        this.service = service;
    }

    @GetMapping(value = "/all", produces = {"application/json", "application/xml"})
    public List<City> getAll() {
        log.trace("call the get all city");
        return service.readAll();
    }

    @GetMapping(value = "/{id}", produces = {"application/json", "application/xml"})
    public ResponseEntity<City> getCityById(@PathVariable("id") int id) {
        log.trace("Get city by ID: {}", id);
        City city = service.read(Long.valueOf(id));
        if (city != null) {
            return ResponseEntity.ok(city);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


    @GetMapping(value = "/search/{query}", produces = {"application/json", "application/xml"})
    public List<City> searchCities(@PathVariable("query") String query) {
        log.trace("Search cities by name containing: {}", query);
        return service.searchCitiesByName(query);
    }

}
