package jruizsilva.concesionaria.domain.repository;

import jruizsilva.concesionaria.domain.dto.CustomerDto;

import java.util.List;
import java.util.Optional;

public interface IRepositoryCustomer {
  List<CustomerDto> findAll();
  
  Optional<CustomerDto> findById(Integer id);
  
  CustomerDto save(CustomerDto customerDto);
  
  void deleteById(Integer id);
  
  Optional<CustomerDto> findCustomerByEmail(String email);
}
