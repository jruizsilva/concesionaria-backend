package jruizsilva.concesionaria.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jruizsilva.concesionaria.domain.dto.CustomerDto;
import jruizsilva.concesionaria.domain.dto.ResponseCustomerDto;
import jruizsilva.concesionaria.domain.repository.ICustomerRepository;
import jruizsilva.concesionaria.exception.EmailValidationException;
import jruizsilva.concesionaria.utils.PasswordGenerator;

@Service
public class CustomerServiceImpl implements ICustomerService {
  private final ICustomerRepository customerRepository;
  private final PasswordGenerator passwordGenerator;

  public CustomerServiceImpl(ICustomerRepository customerRepository, PasswordGenerator passwordGenerator) {
    this.customerRepository = customerRepository;
    this.passwordGenerator = passwordGenerator;
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
  public Optional<CustomerDto> findByEmail(String email) {
    return customerRepository.findCustomerByEmail(email);
  }

  @Override
  public ResponseCustomerDto save(CustomerDto newCustomer) {
    if (!newCustomer.getEmail().matches("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-]+)(\\.[a-zA-Z]{2,5}){1,2}$")) {
      throw new EmailValidationException();
    }
    String passwordGenerated = passwordGenerator.generatePassword();
    newCustomer.setPassword(passwordGenerated);
    newCustomer.setActive(1);

    customerRepository.save(newCustomer);

    return new ResponseCustomerDto(passwordGenerated);
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
