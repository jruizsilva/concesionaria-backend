package jruizsilva.concesionaria.domain.service;

import jruizsilva.concesionaria.domain.dto.BrandCarDto;
import jruizsilva.concesionaria.domain.repository.IBrandCarRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class BrandCarServiceImpl implements IBrandCarService {
  private final IBrandCarRepository repositoryBrandCar;
  
  @Override
  public List<BrandCarDto> findAll() {
    return repositoryBrandCar.findAll();
  }
  
  @Override
  public Optional<BrandCarDto> findById(Integer id) {
    return repositoryBrandCar.findById(id);
  }
  
  @Override
  public BrandCarDto save(BrandCarDto brandCarDto) {
    return repositoryBrandCar.save(brandCarDto);
  }
  
  @Override
  public Optional<BrandCarDto> update(BrandCarDto brandCarDto) {
    if (repositoryBrandCar.findById(brandCarDto.getId())
                          .isEmpty()) {
      return Optional.empty();
    }
    return Optional.of(repositoryBrandCar.save(brandCarDto));
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
