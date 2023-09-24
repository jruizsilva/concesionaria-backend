package jruizsilva.concesionaria.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jruizsilva.concesionaria.domain.dto.BrandCarDto;
import jruizsilva.concesionaria.domain.service.IBrandCarService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/brands-car")
public class BrandCarController {
  private final IBrandCarService brandCarService;

  @GetMapping
  public ResponseEntity<List<BrandCarDto>> findAll() {
    return ResponseEntity.status(HttpStatus.OK)
        .body(brandCarService.findAll());
  }

  @GetMapping(path = "/{id}")
  public ResponseEntity<BrandCarDto> findById(@PathVariable Integer id) {
    return ResponseEntity.of(brandCarService.findById(id));
  }

  @PostMapping
  public ResponseEntity<BrandCarDto> save(@RequestBody BrandCarDto body) {
    try {
      return ResponseEntity.status(HttpStatus.CREATED)
          .body(brandCarService.save(body));
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .build();
    }
  }

  @PutMapping
  public ResponseEntity<BrandCarDto> update(@RequestBody BrandCarDto body) {
    return ResponseEntity.of(brandCarService.update(body));
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Boolean> deleteById(@PathVariable Integer id) {
    return new ResponseEntity<>(brandCarService.deleteById(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
  }
}
