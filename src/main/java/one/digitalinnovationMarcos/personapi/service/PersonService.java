package one.digitalinnovationMarcos.personapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import one.digitalinnovationMarcos.personapi.entity.Person;
import one.digitalinnovationMarcos.personapi.repository.PersonRepository;

@Service
public class PersonService {

	private PersonRepository personRepository;

	@Autowired
	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	@PostMapping
	public Person createPerson(Person person) {
		Person savedPerson = personRepository.save(person);
		return savedPerson;	
	}
	
	
}
