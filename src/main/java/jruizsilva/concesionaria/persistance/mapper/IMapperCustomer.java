package jruizsilva.concesionaria.persistance.mapper;

import jruizsilva.concesionaria.domain.dto.CustomerDto;
import jruizsilva.concesionaria.persistance.entity.CustomerEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IMapperCustomer {
  CustomerDto toCustomerDto(CustomerEntity customerEntity);
  
  CustomerEntity toCustomerEntity(CustomerDto customerDto);
  
  List<CustomerDto> toCustomerDtoList(List<CustomerEntity> customerEntityList);
  
  List<CustomerEntity> toCustomerEntityList(List<CustomerDto> customerDtoList);
}
