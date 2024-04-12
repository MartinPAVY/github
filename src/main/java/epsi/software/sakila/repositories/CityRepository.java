package epsi.software.sakila.repositories;

import epsi.software.sakila.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {
    List<City> findCityByCityIsContaining(String query);
}
