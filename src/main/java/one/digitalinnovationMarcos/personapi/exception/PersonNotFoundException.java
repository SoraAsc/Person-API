package one.digitalinnovationMarcos.personapi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends Exception {

	public PersonNotFoundException(Long id) {
		super("Person not found with ID "+id);
	}
	
}
