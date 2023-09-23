package jruizsilva.concesionaria.persistance.repository;

import jruizsilva.concesionaria.persistance.entity.EntityBrandCar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositoryBrandCarJpa extends JpaRepository<EntityBrandCar, Integer> {
}
