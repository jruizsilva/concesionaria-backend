package jruizsilva.concesionaria.persistance.mapper;

import jruizsilva.concesionaria.domain.dto.MarcaCocheDTO;
import jruizsilva.concesionaria.persistance.entity.MarcaCocheEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IMarcaCocheMapper {
    @Mapping(source = "id", target = "id")
    @Mapping(source = "description", target = "description")
    MarcaCocheDTO toMarcaCocheDTO(MarcaCocheEntity marcaCocheEntity);

    @InheritInverseConfiguration
    MarcaCocheEntity toMarcaCocheEntity(MarcaCocheDTO marcaCocheDTO);
}
