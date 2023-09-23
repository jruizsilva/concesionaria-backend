package jruizsilva.concesionaria.persistance.repository;

import jruizsilva.concesionaria.domain.pojo.PojoBrandCar;
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

    @Override public List<PojoBrandCar> findAll() {
        return mapperBrandCar.toPojoListBrandCard(repositoryBrandCarJpa.findAll());
    }

    @Override public Optional<PojoBrandCar> findById(Integer id) {
        return repositoryBrandCarJpa.findById(id)
                                    .map(mapperBrandCar::toPojoBrandCar);
    }

    @Override public PojoBrandCar save(PojoBrandCar pojoBrandCar) {
        EntityBrandCar entity = mapperBrandCar.toEntityBrandCar(pojoBrandCar);
        return mapperBrandCar.toPojoBrandCar(repositoryBrandCarJpa.save(entity));
    }

    @Override public void deleteById(Integer id) {
        repositoryBrandCarJpa.deleteById(id);
    }
}
