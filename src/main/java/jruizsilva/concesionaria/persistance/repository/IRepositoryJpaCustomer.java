package jruizsilva.concesionaria.persistance.repository;

import jruizsilva.concesionaria.persistance.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IRepositoryJpaCustomer extends JpaRepository<CustomerEntity, Integer> {
  Optional<CustomerEntity> find();
}
