package jruizsilva.concesionaria.domain.service;

import jruizsilva.concesionaria.domain.dto.DtoBrandCar;
import jruizsilva.concesionaria.domain.repository.IRepositoryBrandCar;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class ServiceBrandCarImpl implements IServiceBrandCar {
  private final IRepositoryBrandCar repositoryBrandCar;
  
  @Override
  public List<DtoBrandCar> findAll() {
    return repositoryBrandCar.findAll();
  }
  
  @Override
  public Optional<DtoBrandCar> findById(Integer id) {
    return repositoryBrandCar.findById(id);
  }
  
  @Override
  public DtoBrandCar save(DtoBrandCar dtoBrandCar) {
    return repositoryBrandCar.save(dtoBrandCar);
  }
  
  @Override
  public Optional<DtoBrandCar> update(DtoBrandCar dtoBrandCar) {
    if (repositoryBrandCar.findById(dtoBrandCar.getId())
                          .isEmpty()) {
      return Optional.empty();
    }
    return Optional.of(repositoryBrandCar.save(dtoBrandCar));
  }
  
  @Override
  public boolean deleteById(Integer id) {
    if (repositoryBrandCar.findById(id)
                          .isEmpty()) {
      return false;
    }
    repositoryBrandCar.deleteById(id);
    return true;
  }
}
