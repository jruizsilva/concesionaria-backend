package jruizsilva.concesionaria.persistance.repository;

import jruizsilva.concesionaria.domain.pojo.BrandCarPojo;
import jruizsilva.concesionaria.domain.repository.IBrandCarRepository;
import jruizsilva.concesionaria.persistance.entity.BrandCarEntity;
import jruizsilva.concesionaria.persistance.mapper.IBrandCarMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class BrandCarRepository implements IBrandCarRepository {
    private final IBrandCarJpaRepository repositoryBrandCar;
    private final IBrandCarMapper mapperBrandCar;

    @Override public List<BrandCarPojo> findAll() {
        return mapperBrandCar.toPojoListBrandCard(repositoryBrandCar.findAll());
    }

    @Override public Optional<BrandCarPojo> findById(Integer id) {
        return repositoryBrandCar.findById(id)
                                 .map(mapperBrandCar::toPojoBrandCar);
    }

    @Override public BrandCarPojo save(BrandCarPojo brandCarPojo) {
        BrandCarEntity entity = mapperBrandCar.toEntityBrandCar(brandCarPojo);
        return mapperBrandCar.toPojoBrandCar(repositoryBrandCar.save(entity));
    }

    @Override public void deleteById(Integer idBrandCar) {
        repositoryBrandCar.deleteById(idBrandCar);
    }
}
