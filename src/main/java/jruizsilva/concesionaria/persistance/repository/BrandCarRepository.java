package jruizsilva.concesionaria.persistance.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import jruizsilva.concesionaria.domain.dto.BrandCarDto;
import jruizsilva.concesionaria.domain.repository.IBrandCarRepository;
import jruizsilva.concesionaria.persistance.entity.BrandCarEntity;
import jruizsilva.concesionaria.persistance.mapper.IBrandCarMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class BrandCarRepository implements IBrandCarRepository {
  private final IBrandCarRepositoryCrud repositoryBrandCarJpa;
  private final IBrandCarMapper mapperBrandCar;

  @Override
  public List<BrandCarDto> findAll() {
    return mapperBrandCar.toDtoListBrandCard(repositoryBrandCarJpa.findAll());
  }

  @Override
  public Optional<BrandCarDto> findById(Integer id) {
    return repositoryBrandCarJpa.findById(id)
        .map(mapperBrandCar::toDtoBrandCar);
  }

  @Override
  public BrandCarDto save(BrandCarDto brandCarDto) {
    BrandCarEntity entity = mapperBrandCar.toEntityBrandCar(brandCarDto);
    return mapperBrandCar.toDtoBrandCar(repositoryBrandCarJpa.save(entity));
  }

  @Override
  public void deleteById(Integer id) {
    repositoryBrandCarJpa.deleteById(id);
  }
}
