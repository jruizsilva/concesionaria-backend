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

import jruizsilva.concesionaria.domain.dto.CustomerDto;
import jruizsilva.concesionaria.domain.dto.ResponseCustomerDto;
import jruizsilva.concesionaria.domain.service.ICustomerService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "customers")
public class CustomerController {
  private final ICustomerService customerService;

  @GetMapping
  public ResponseEntity<List<CustomerDto>> findAll() {
    return ResponseEntity.ok(customerService.findAll());
  }

  @GetMapping("/{id}")
  public ResponseEntity<CustomerDto> findById(@PathVariable Integer id) {
    return ResponseEntity.of(customerService.findById(id));
  }

  @GetMapping("/{email}")
  public ResponseEntity<CustomerDto> findByEmail(@PathVariable String email) {
    return ResponseEntity.of(customerService.findByEmail(email));
  }

  @PostMapping
  public ResponseEntity<ResponseCustomerDto> save(@RequestBody CustomerDto customerDto) {
    try {
      return ResponseEntity.status(HttpStatus.CREATED)
          .body(customerService.save(customerDto));
    } catch (Exception e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST)
          .build();
    }
  }

  @PutMapping
  public ResponseEntity<CustomerDto> update(@RequestBody CustomerDto body) {
    return ResponseEntity.of(customerService.update(body));
  }

  @DeleteMapping(path = "/{id}")
  public ResponseEntity<Boolean> deleteById(@PathVariable Integer id) {
    return new ResponseEntity<>(customerService.deleteById(id) ? HttpStatus.OK : HttpStatus.NOT_FOUND);
  }
}
