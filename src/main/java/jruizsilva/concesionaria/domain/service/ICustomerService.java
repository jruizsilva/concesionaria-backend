package jruizsilva.concesionaria.domain.service;

import java.util.List;
import java.util.Optional;

import jruizsilva.concesionaria.domain.dto.CustomerDto;

public interface ICustomerService {
  List<CustomerDto> findAll();

  Optional<CustomerDto> findById(Integer id);

  CustomerDto save(CustomerDto customerDto);

  Optional<CustomerDto> update(CustomerDto customerDto);

  boolean deleteById(Integer id);
}
