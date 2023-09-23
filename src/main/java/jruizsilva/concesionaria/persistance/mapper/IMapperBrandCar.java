package jruizsilva.concesionaria.persistance.mapper;

import jruizsilva.concesionaria.domain.pojo.PojoBrandCar;
import jruizsilva.concesionaria.persistance.entity.EntityBrandCar;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper que transforma objetos de BrandCar a Pojos o entidades
 */
@Mapper(componentModel = "spring")
public interface IMapperBrandCar {
    //    Si tiene el mismo nombre es opcional

    /**
     * Convierte una entidad BrandCar a un Pojo
     *
     * @param entityBrandCar Entidad a convertir
     * @return Pojo convertido
     */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    PojoBrandCar toPojoBrandCar(EntityBrandCar entityBrandCar);

    /**
     * Convierte un Pojo BrandCar a una entidad
     *
     * @param pojoBrandCar Entidad a convertir
     * @return Pojos convertidos
     */
    @InheritInverseConfiguration
    EntityBrandCar toEntityBrandCar(PojoBrandCar pojoBrandCar);

    /**
     * Convierte entidades MarcasCoche a una lista pojo
     *
     * @param marcasCocheEntities Entidades a transformar
     * @return Lista de pojos
     */
    List<PojoBrandCar> toPojoListBrandCard(List<EntityBrandCar> marcasCocheEntities);

    /**
     * Convierte pojos BrandCar a una lista de entidades
     *
     * @param pojoBrandCars Entidades a transformar
     * @return Lista de entidades
     */
    List<EntityBrandCar> toEntityListBrand(List<PojoBrandCar> pojoBrandCars);
}
