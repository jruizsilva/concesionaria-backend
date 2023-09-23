package jruizsilva.concesionaria.controller;

import jruizsilva.concesionaria.domain.dto.DtoBrandCar;
import jruizsilva.concesionaria.domain.service.IServiceBrandCar;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/brands-car")
public class ControllerBrandCar {
  private final IServiceBrandCar serviceBrandCar;
  
  @GetMapping
  public ResponseEntity<List<DtoBrandCar>> findAll() {
    return ResponseEntity.status(HttpStatus.OK)
                         .body(serviceBrandCar.findAll());
  }
  
  @GetMapping(path = "/{id}")
  public ResponseEntity<DtoBrandCar> findById(@PathVariable Integer id) {
    return ResponseEntity.of(serviceBrandCar.findById(id));
  }
  
  @PostMapping
  public ResponseEntity<DtoBrandCar> save(@RequestBody DtoBrandCar body) {
    try {
      return ResponseEntity.status(HttpStatus.CREATED)
                           .body(serviceBrandCar.save(body));
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                           .build();
    }
  }
  
  @PutMapping
  public ResponseEntity<DtoBrandCar> update(@RequestBody DtoBrandCar body) {
    return ResponseEntity.of(serviceBrandCar.update(body));
  }
  
  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Boolean> deleteById(@PathVariable Integer id) {
    return new ResponseEntity<>(serviceBrandCar.deleteById(id) ?
                                HttpStatus.OK :
                                HttpStatus.NOT_FOUND);
  }
}
