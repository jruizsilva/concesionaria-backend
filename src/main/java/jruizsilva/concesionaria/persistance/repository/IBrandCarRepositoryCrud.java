package jruizsilva.concesionaria.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jruizsilva.concesionaria.persistance.entity.BrandCarEntity;

public interface IBrandCarRepositoryCrud extends JpaRepository<BrandCarEntity, Integer> {
}
