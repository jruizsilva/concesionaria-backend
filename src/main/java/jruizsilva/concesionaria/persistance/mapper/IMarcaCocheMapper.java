package jruizsilva.concesionaria.persistance.mapper;

import jruizsilva.concesionaria.domain.pojo.MarcaCochePojo;
import jruizsilva.concesionaria.persistance.entity.MarcaCocheEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

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
     * @return Pojos convertidos
     */
    @InheritInverseConfiguration
    MarcaCocheEntity toMarcaCocheEntity(MarcaCochePojo marcaCochePojo);

    /**
     * Convierte entidades MarcasCoche a una lista pojo
     *
     * @param marcasCocheEntities Entidades a transformar
     * @return Lista de pojos
     */
    List<MarcaCochePojo> toMarcasCochePojo(List<MarcaCocheEntity> marcasCocheEntities);

    /**
     * Convierte pojos MarcaCoche a una lista de entidades
     *
     * @param marcaCochePojos Entidades a transformar
     * @return Lista de entidades
     */
    List<MarcaCocheEntity> toMarcasCocheEntity(List<MarcaCochePojo> marcaCochePojos);
}
