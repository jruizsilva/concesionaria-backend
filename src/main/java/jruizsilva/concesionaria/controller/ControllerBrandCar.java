package jruizsilva.concesionaria.controller;

import jruizsilva.concesionaria.domain.pojo.PojoBrandCar;
import jruizsilva.concesionaria.domain.service.IServiceBrandCar;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/brand-cars")
public class ControllerBrandCar {
    private final IServiceBrandCar serviceBrandCar;

    @GetMapping
    public ResponseEntity<List<PojoBrandCar>> findAll() {
        return ResponseEntity.status(HttpStatus.OK)
                             .body(serviceBrandCar.findAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<PojoBrandCar> findById(@PathVariable Integer id) {
        return ResponseEntity.of(serviceBrandCar.findById(id));
    }

    @PostMapping
    public ResponseEntity<PojoBrandCar> save(@RequestBody PojoBrandCar pojoBrandCar) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED)
                                 .body(serviceBrandCar.save(pojoBrandCar));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                                 .build();
        }
    }
}
