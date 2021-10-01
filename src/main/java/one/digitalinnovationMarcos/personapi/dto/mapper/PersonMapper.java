package one.digitalinnovationMarcos.personapi.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import one.digitalinnovationMarcos.personapi.dto.request.PersonDTO;
import one.digitalinnovationMarcos.personapi.entities.Person;

@Mapper
public interface PersonMapper {

	PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);
	
	@Mapping(target = "birthDate", source = "birthDate", dateFormat = "yyyy-MM-dd")
	Person toModel(PersonDTO personDTO);
	
	PersonDTO toDTO(Person person);
	
}
