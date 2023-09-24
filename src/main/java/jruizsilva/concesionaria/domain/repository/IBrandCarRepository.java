package jruizsilva.concesionaria.domain.repository;

import java.util.List;
import java.util.Optional;

import jruizsilva.concesionaria.domain.dto.BrandCarDto;

public interface IBrandCarRepository {
    List<BrandCarDto> findAll();

    Optional<BrandCarDto> findById(Integer id);

    BrandCarDto save(BrandCarDto brandCarDto);

    void deleteById(Integer id);
}
