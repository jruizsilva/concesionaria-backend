package jruizsilva.concesionaria.persistance.repository;

import jruizsilva.concesionaria.persistance.entity.BrandCarEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBrandCarJpaRepository extends JpaRepository<BrandCarEntity, Integer> {
}
