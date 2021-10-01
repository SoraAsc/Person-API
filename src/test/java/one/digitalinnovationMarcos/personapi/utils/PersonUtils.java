package one.digitalinnovationMarcos.personapi.utils;

import java.time.LocalDate;
import java.util.Collections;

import one.digitalinnovationMarcos.personapi.dto.request.PersonDTO;
import one.digitalinnovationMarcos.personapi.entities.Person;

public class PersonUtils {

	private static final String FIRST_NAME = "Rodrigo";
	private static final String LAST_NAME = "Peleias";
	private static final String CPF_NUMBER = "165.158.045-79";
	private static final long PERSON_ID = 1L;
	public static final LocalDate BIRTH_DATE = LocalDate.of(2010,5,1);

	public static PersonDTO createFakeDTO() {
		return PersonDTO.builder()
				.firstName(FIRST_NAME)
				.lastName(LAST_NAME)
				.cpf(CPF_NUMBER)
				.birthDate("2005-09-15")
				.phones(Collections.singletonList(PhoneUtils.createFakeDTO()))
				.address(AddressUtils.createFakeDTO())
				.build();
	}
	
	public static Person createFakeEntity() {
		return Person.builder()
				.id(PERSON_ID)
				.firstName(FIRST_NAME)
				.lastName(LAST_NAME)
				.cpf(CPF_NUMBER)
				.birthDate(BIRTH_DATE)
				.phones(Collections.singletonList(PhoneUtils.createFakeEntity()))
				.address(AddressUtils.createFakeEntity())
				.build();
	}
}
