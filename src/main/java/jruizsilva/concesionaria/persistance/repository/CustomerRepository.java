package jruizsilva.concesionaria.persistance.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import jruizsilva.concesionaria.domain.dto.CustomerDto;
import jruizsilva.concesionaria.domain.repository.ICustomerRepository;
import jruizsilva.concesionaria.persistance.mapper.ICustomerMapper;

@Repository
public class CustomerRepository implements ICustomerRepository {

  private final ICustomerRepositoryCrud customerRepositoryCrud;
  private final ICustomerMapper customerMapper;

  public CustomerRepository(ICustomerRepositoryCrud customerRepositoryCrud, ICustomerMapper customerMapper) {
    this.customerRepositoryCrud = customerRepositoryCrud;
    this.customerMapper = customerMapper;
  }

  @Override
  public List<CustomerDto> findAll() {
    return customerMapper.toCustomerDtoList(customerRepositoryCrud.findAll());
  }

  @Override
  public Optional<CustomerDto> findById(Integer id) {
    return customerRepositoryCrud.findById(id).map(customerMapper::toCustomerDto);
  }

  @Override
  public CustomerDto save(CustomerDto customerDto) {
    return customerMapper.toCustomerDto(customerRepositoryCrud.save(customerMapper.toCustomerEntity(customerDto)));
  }

  @Override
  public void deleteById(Integer id) {
    customerRepositoryCrud.deleteById(id);
  }

  @Override
  public Optional<CustomerDto> findCustomerByEmail(String email) {
    return customerRepositoryCrud.findByEmail(email).map(customerMapper::toCustomerDto);
  }
}
