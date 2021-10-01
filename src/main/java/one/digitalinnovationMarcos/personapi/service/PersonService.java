package one.digitalinnovationMarcos.personapi.service;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import one.digitalinnovationMarcos.personapi.dto.mapper.PersonMapper;
import one.digitalinnovationMarcos.personapi.dto.request.PersonDTO;
import one.digitalinnovationMarcos.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovationMarcos.personapi.entities.Person;
import one.digitalinnovationMarcos.personapi.exception.PersonNotFoundException;
import one.digitalinnovationMarcos.personapi.repositories.PersonRepository;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

	private PersonRepository personRepository;

	private final PersonMapper personMapper = PersonMapper.INSTANCE;
		
	public MessageResponseDTO createPerson(PersonDTO personDTO) {
		
		Person personToSave = personMapper.toModel(personDTO);		
		
		Person savedPerson = personRepository.save(personToSave);
		
		return createMessageResponse(savedPerson.getId(),"Pessoa criada com o ID: ");
	}

	public List<PersonDTO> listAll() {
		List<Person> allPeople = personRepository.findAll();
		return allPeople.stream()
				.map(personMapper::toDTO)
				.collect(Collectors.toList());
	}

	public PersonDTO findById(Long id) throws PersonNotFoundException {
		Person person = verifyIfExists(id);

		return personMapper.toDTO(person);
	}

	public void delete(Long id) throws PersonNotFoundException {
		verifyIfExists(id);
		
		personRepository.deleteById(id);
	}
	
	public MessageResponseDTO updateById(Long id, PersonDTO personDTO) throws PersonNotFoundException {
		verifyIfExists(id);
		
		Person personToUpdate = personMapper.toModel(personDTO);
		
		Person updatedPerson = personRepository.save(personToUpdate);
		
		return createMessageResponse(updatedPerson.getId(),"Atualização na Pessoa com o ID: ");	
	}
	
	private Person verifyIfExists(Long id) throws PersonNotFoundException{
		return personRepository.findById(id)
				.orElseThrow(() -> new PersonNotFoundException(id));
	}

	private MessageResponseDTO createMessageResponse(Long id, String msg) {
		return MessageResponseDTO
				.builder()
				.message(msg+id)
				.build();
	}
	

		
}
