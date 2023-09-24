package jruizsilva.concesionaria.persistance.repository;

import java.util.List;
import java.util.Optional;

import jruizsilva.concesionaria.domain.dto.CustomerDto;
import jruizsilva.concesionaria.domain.repository.ICustomerRepository;

public class CustomerRepository implements ICustomerRepository {
  @Override
  public List<CustomerDto> findAll() {
    return null;
  }
  
  @Override
  public Optional<CustomerDto> findById(Integer id) {
    return Optional.empty();
  }
  
  @Override
  public CustomerDto save(CustomerDto customerDto) {
    return null;
  }
  
  @Override
  public void deleteById(Integer id) {
  }
  
  @Override
  public Optional<CustomerDto> findCustomerByEmail(String email) {
    return Optional.empty();
  }
}
