package jruizsilva.concesionaria.persistance.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import jruizsilva.concesionaria.domain.dto.CustomerDto;
import jruizsilva.concesionaria.persistance.entity.CustomerEntity;

@Mapper(componentModel = "spring")
public interface ICustomerMapper {
  CustomerDto toCustomerDto(CustomerEntity customerEntity);

  CustomerEntity toCustomerEntity(CustomerDto customerDto);

  List<CustomerDto> toCustomerDtoList(List<CustomerEntity> customerEntityList);

  List<CustomerEntity> toCustomerEntityList(List<CustomerDto> customerDtoList);
}
