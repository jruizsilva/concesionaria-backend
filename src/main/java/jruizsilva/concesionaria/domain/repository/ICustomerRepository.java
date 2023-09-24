package jruizsilva.concesionaria.domain.repository;

import java.util.List;
import java.util.Optional;

import jruizsilva.concesionaria.domain.dto.CustomerDto;

public interface ICustomerRepository {
  List<CustomerDto> findAll();
  
  Optional<CustomerDto> findById(Integer id);
  
  CustomerDto save(CustomerDto customerDto);
  
  void deleteById(Integer id);
  
  Optional<CustomerDto> findCustomerByEmail(String email);
}
