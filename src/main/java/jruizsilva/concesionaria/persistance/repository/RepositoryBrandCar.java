package jruizsilva.concesionaria.persistance.repository;

import jruizsilva.concesionaria.domain.dto.BrandCarDto;
import jruizsilva.concesionaria.domain.repository.IRepositoryBrandCar;
import jruizsilva.concesionaria.persistance.entity.EntityBrandCar;
import jruizsilva.concesionaria.persistance.mapper.IMapperBrandCar;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class RepositoryBrandCar implements IRepositoryBrandCar {
  private final IRepositoryJpaBrandCar repositoryBrandCarJpa;
  private final IMapperBrandCar mapperBrandCar;
  
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
    EntityBrandCar entity = mapperBrandCar.toEntityBrandCar(brandCarDto);
    return mapperBrandCar.toDtoBrandCar(repositoryBrandCarJpa.save(entity));
  }
  
  @Override
  public void deleteById(Integer id) {
    repositoryBrandCarJpa.deleteById(id);
  }
}
