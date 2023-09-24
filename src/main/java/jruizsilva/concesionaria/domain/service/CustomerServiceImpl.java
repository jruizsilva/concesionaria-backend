package jruizsilva.concesionaria.domain.service;

import java.util.List;
import java.util.Optional;

import jruizsilva.concesionaria.domain.dto.CustomerDto;
import jruizsilva.concesionaria.domain.repository.ICustomerRepository;
import jruizsilva.concesionaria.persistance.mapper.ICustomerMapper;

public class CustomerServiceImpl implements ICustomerService {
  private final ICustomerRepository customerRepository;

  public CustomerServiceImpl(ICustomerRepository customerRepository, ICustomerMapper customerMapper) {
    this.customerRepository = customerRepository;
  }

  @Override
  public List<CustomerDto> findAll() {
    return customerRepository.findAll();
  }

  @Override
  public Optional<CustomerDto> findById(Integer id) {
    return customerRepository.findById(id);
  }

  @Override
  public CustomerDto save(CustomerDto brandCarDto) {
    return customerRepository.save(brandCarDto);
  }

  @Override
  public Optional<CustomerDto> update(CustomerDto customerDto) {
    if (customerRepository.findById(customerDto.getId())
        .isEmpty()) {
      return Optional.empty();
    }
    return Optional.of(customerRepository.save(customerDto));
  }

  @Override
  public boolean deleteById(Integer id) {
    if (customerRepository.findById(id)
        .isEmpty()) {
      return false;
    }
    customerRepository.deleteById(id);
    return true;
  }

}
