package jruizsilva.concesionaria.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import jruizsilva.concesionaria.domain.dto.BrandCarDto;
import jruizsilva.concesionaria.domain.repository.IBrandCarRepository;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class BrandCarServiceImpl implements IBrandCarService {
  private final IBrandCarRepository brandCarRepository;

  @Override
  public List<BrandCarDto> findAll() {
    return brandCarRepository.findAll();
  }

  @Override
  public Optional<BrandCarDto> findById(Integer id) {
    return brandCarRepository.findById(id);
  }

  @Override
  public BrandCarDto save(BrandCarDto brandCarDto) {
    return brandCarRepository.save(brandCarDto);
  }

  @Override
  public Optional<BrandCarDto> update(BrandCarDto brandCarDto) {
    if (brandCarRepository.findById(brandCarDto.getId())
        .isEmpty()) {
      return Optional.empty();
    }
    return Optional.of(brandCarRepository.save(brandCarDto));
  }

  @Override
  public boolean deleteById(Integer id) {
    if (brandCarRepository.findById(id)
        .isEmpty()) {
      return false;
    }
    brandCarRepository.deleteById(id);
    return true;
  }
}
