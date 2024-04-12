package epsi.software.sakila.services;


import epsi.software.sakila.entities.City;
import epsi.software.sakila.repositories.CityRepository;

import java.util.List;

public class CityServiceImpl implements CityService {


    private CityRepository cityRepository;

    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public City create(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City read(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    @Override
    public List<City> readAll() {
        return cityRepository.findAll();
    }

    @Override
    public City update(City city) {
        return null;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
