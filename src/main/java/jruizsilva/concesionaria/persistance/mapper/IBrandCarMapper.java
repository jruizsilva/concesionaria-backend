package jruizsilva.concesionaria.persistance.mapper;

import jruizsilva.concesionaria.domain.pojo.BrandCarPojo;
import jruizsilva.concesionaria.persistance.entity.BrandCarEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper que transforma objetos de BrandCar a Pojos o entidades
 */
@Mapper(componentModel = "spring")
public interface IBrandCarMapper {
    //    Si tiene el mismo nombre es opcional

    /**
     * Convierte una entidad BrandCar a un Pojo
     *
     * @param brandCarEntity Entidad a convertir
     * @return Pojo convertido
     */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    BrandCarPojo toPojoBrandCar(BrandCarEntity brandCarEntity);

    /**
     * Convierte un Pojo BrandCar a una entidad
     *
     * @param brandCarPojo Entidad a convertir
     * @return Pojos convertidos
     */
    @InheritInverseConfiguration
    BrandCarEntity toEntityBrandCar(BrandCarPojo brandCarPojo);

    /**
     * Convierte entidades MarcasCoche a una lista pojo
     *
     * @param marcasCocheEntities Entidades a transformar
     * @return Lista de pojos
     */
    List<BrandCarPojo> toPojoListBrandCard(List<BrandCarEntity> marcasCocheEntities);

    /**
     * Convierte pojos BrandCar a una lista de entidades
     *
     * @param brandCarPojos Entidades a transformar
     * @return Lista de entidades
     */
    List<BrandCarEntity> toEntityListBrand(List<BrandCarPojo> brandCarPojos);
}
