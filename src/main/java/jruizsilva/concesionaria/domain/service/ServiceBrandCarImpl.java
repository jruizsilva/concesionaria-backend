package jruizsilva.concesionaria.domain.service;

import jruizsilva.concesionaria.domain.pojo.PojoBrandCar;
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
  public List<PojoBrandCar> findAll() {
    return repositoryBrandCar.findAll();
  }
  
  @Override
  public Optional<PojoBrandCar> findById(Integer id) {
    return repositoryBrandCar.findById(id);
  }
  
  @Override
  public PojoBrandCar save(PojoBrandCar pojoBrandCar) {
    return repositoryBrandCar.save(pojoBrandCar);
  }
  
  @Override
  public boolean deleteById(Integer id) {
    try {
      repositoryBrandCar.deleteById(id);
      return true;
    } catch (Exception e) {
      return false;
    }
  }
}
