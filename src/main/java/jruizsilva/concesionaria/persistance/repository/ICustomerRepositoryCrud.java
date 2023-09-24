package jruizsilva.concesionaria.persistance.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import jruizsilva.concesionaria.persistance.entity.CustomerEntity;

public interface ICustomerRepositoryCrud extends JpaRepository<CustomerEntity, Integer> {
  Optional<CustomerEntity> findByEmail(String email);
}
