package one.digitalinnovationMarcos.personapi.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import one.digitalinnovationMarcos.personapi.dto.request.PersonDTO;
import one.digitalinnovationMarcos.personapi.dto.response.MessageResponseDTO;
import one.digitalinnovationMarcos.personapi.entities.Person;
import one.digitalinnovationMarcos.personapi.repositories.PersonRepository;
import one.digitalinnovationMarcos.personapi.utils.PersonUtils;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {
	
	@Mock
	private PersonRepository personRepository;
	
	@InjectMocks
	private PersonService personService;
	
	@Test
	void testGivenPersonDTOThenReturnSavedMessage() {
		PersonDTO personDTO = PersonUtils.createFakeDTO();
		Person expectedSavedPerson = PersonUtils.createFakeEntity();
	
		Mockito.when(personRepository.save(Mockito.any(Person.class)))
			.thenReturn(expectedSavedPerson);
		
		MessageResponseDTO expectedSucessMessage = createExpectedSucessMessage(expectedSavedPerson.getId());
		
		MessageResponseDTO sucessMessage = personService.createPerson(personDTO);
	
		Assertions.assertEquals(expectedSucessMessage,sucessMessage);
	}

	private MessageResponseDTO createExpectedSucessMessage(Long id) {
		return MessageResponseDTO.builder()
				.message("Pessoa criada com o ID: " + id)
				.build();
	}
	
}
