package jruizsilva.concesionaria.controller;

import jruizsilva.concesionaria.domain.dto.BrandCarDto;
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
  public ResponseEntity<List<BrandCarDto>> findAll() {
    return ResponseEntity.status(HttpStatus.OK)
                         .body(serviceBrandCar.findAll());
  }
  
  @GetMapping(path = "/{id}")
  public ResponseEntity<BrandCarDto> findById(@PathVariable Integer id) {
    return ResponseEntity.of(serviceBrandCar.findById(id));
  }
  
  @PostMapping
  public ResponseEntity<BrandCarDto> save(@RequestBody BrandCarDto body) {
    try {
      return ResponseEntity.status(HttpStatus.CREATED)
                           .body(serviceBrandCar.save(body));
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                           .build();
    }
  }
  
  @PutMapping
  public ResponseEntity<BrandCarDto> update(@RequestBody BrandCarDto body) {
    return ResponseEntity.of(serviceBrandCar.update(body));
  }
  
  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Boolean> deleteById(@PathVariable Integer id) {
    return new ResponseEntity<>(serviceBrandCar.deleteById(id) ?
                                HttpStatus.OK :
                                HttpStatus.NOT_FOUND);
  }
}
