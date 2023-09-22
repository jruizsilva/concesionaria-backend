package jruizsilva.concesionaria.persistance.mapper;

import jruizsilva.concesionaria.domain.pojo.MarcaCochePojo;
import jruizsilva.concesionaria.persistance.entity.MarcaCocheEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * Mapper que transforma objetos de MarcaCoche a Pojos o entidades
 */
@Mapper(componentModel = "spring")
public interface IMarcaCocheMapper {
    //    Si tiene el mismo nombre es opcional

    /**
     * Convierte una entidad MarcaCoche a un Pojo
     *
     * @param marcaCocheEntity Entidad a convertir
     * @return Pojo convertido
     */
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    MarcaCochePojo toMarcaCochePojo(MarcaCocheEntity marcaCocheEntity);

    /**
     * Convierte un Pojo MarcaCoche a una entidad
     *
     * @param marcaCochePojo Entidad a convertir
     * @return Pojo convertido
     */
    @InheritInverseConfiguration
    MarcaCocheEntity toMarcaCocheEntity(MarcaCochePojo marcaCochePojo);
}
