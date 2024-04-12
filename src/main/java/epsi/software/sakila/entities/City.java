package epsi.software.sakila.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

public class City extends Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private Long id;

    @Override
    public String getCountry() {
        return super.getCountry();
    }

    private String city;

    @Column(name = "last_update")
    private LocalDateTime lastUpdate;

    private boolean capital;

    private String picture;
}
