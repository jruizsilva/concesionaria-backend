package jruizsilva.concesionaria.persistance.mapper;

import jruizsilva.concesionaria.domain.dto.BrandCarDto;
import jruizsilva.concesionaria.persistance.entity.EntityBrandCar;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

/**
 * Mapper que transforma objetos de BrandCar a Dto o entidades
 */
@Mapper(componentModel = "spring")
public interface IMapperBrandCar {
  //    Si tiene el mismo nombre es opcional
  
  /**
   * Convierte una entidad BrandCar a un Dto
   *
   * @param entityBrandCar Entidad a convertir
   * @return Dto convertido
   */
  @Mapping(
      source = "id",
      target = "id"
  )
  @Mapping(
      source = "description",
      target = "description"
  )
  BrandCarDto toDtoBrandCar(EntityBrandCar entityBrandCar);
  
  /**
   * Convierte un Dto BrandCar a una entidad
   *
   * @param brandCarDto Entidad a convertir
   * @return Dto convertidos
   */
  @InheritInverseConfiguration
  EntityBrandCar toEntityBrandCar(BrandCarDto brandCarDto);
  
  /**
   * Convierte entidades MarcasCoche a una lista Dto
   *
   * @param marcasCocheEntities Entidades a transformar
   * @return Lista de Dto
   */
  List<BrandCarDto> toDtoListBrandCard(List<EntityBrandCar> marcasCocheEntities);
  
  /**
   * Convierte Dto BrandCar a una lista de entidades
   *
   * @param brandCarDtos Entidades a transformar
   * @return Lista de entidades
   */
  List<EntityBrandCar> toEntityListBrand(List<BrandCarDto> brandCarDtos);
}
