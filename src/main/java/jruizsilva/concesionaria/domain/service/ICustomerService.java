package jruizsilva.concesionaria.domain.service;

import java.util.List;
import java.util.Optional;

import jruizsilva.concesionaria.domain.dto.CustomerDto;
import jruizsilva.concesionaria.domain.dto.ResponseCustomerDto;

public interface ICustomerService {
  List<CustomerDto> findAll();

  Optional<CustomerDto> findById(Integer id);

  ResponseCustomerDto save(CustomerDto customerDto);

  Optional<CustomerDto> update(CustomerDto customerDto);

  Optional<CustomerDto> findByEmail(String email);

  boolean deleteById(Integer id);
}
