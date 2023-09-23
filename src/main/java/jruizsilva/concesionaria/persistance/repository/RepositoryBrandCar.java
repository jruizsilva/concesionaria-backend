package jruizsilva.concesionaria.persistance.repository;

import jruizsilva.concesionaria.domain.dto.DtoBrandCar;
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
  private final IRepositoryBrandCarJpa repositoryBrandCarJpa;
  private final IMapperBrandCar mapperBrandCar;
  
  @Override
  public List<DtoBrandCar> findAll() {
    return mapperBrandCar.toDtoListBrandCard(repositoryBrandCarJpa.findAll());
  }
  
  @Override
  public Optional<DtoBrandCar> findById(Integer id) {
    return repositoryBrandCarJpa.findById(id)
                                .map(mapperBrandCar::toDtoBrandCar);
  }
  
  @Override
  public DtoBrandCar save(DtoBrandCar dtoBrandCar) {
    EntityBrandCar entity = mapperBrandCar.toEntityBrandCar(dtoBrandCar);
    return mapperBrandCar.toDtoBrandCar(repositoryBrandCarJpa.save(entity));
  }
  
  @Override
  public void deleteById(Integer id) {
    repositoryBrandCarJpa.deleteById(id);
  }
}
