package one.digitalinnovationMarcos.personapi.service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovationMarcos.personapi.dto.mapper.PersonMapper;
import one.digitalinnovationMarcos.personapi.dto.request.PersonDTO;
import one.digitalinnovationMarcos.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovationMarcos.personapi.entity.Person;
import one.digitalinnovationMarcos.personapi.exception.PersonNotFoundException;
import one.digitalinnovationMarcos.personapi.repositories.PersonRepository;

@Service
public class PersonService {

	private PersonRepository personRepository;

	private final PersonMapper personMapper = PersonMapper.INSTANCE;
	
	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public MessageResponseDTO createPerson(PersonDTO personDTO) {
		
		Person personToSave = personMapper.toModel(personDTO);		
		
		Person savedPerson = personRepository.save(personToSave);
		return MessageResponseDTO
				.builder()
				.message("Pessoa criada com o ID: "+savedPerson.getId())
				.build();	
	}

	public List<PersonDTO> listAll() {
		List<Person> allPeople = personRepository.findAll();
		return allPeople.stream()
				.map(personMapper::toDTO)
				.collect(Collectors.toList());
	}

	public PersonDTO findById(Long id) throws PersonNotFoundException {
		Person person = personRepository.findById(id)
		.orElseThrow(() -> new PersonNotFoundException(id));

		return personMapper.toDTO(person);
	}

		
}
