package one.digitalinnovationMarcos.personapi.utils;

import one.digitalinnovationMarcos.personapi.dto.request.AddressDTO;
import one.digitalinnovationMarcos.personapi.entities.Address;

public class AddressUtils {

	private static final String ADDRESS = "Rua Salvador";
	private static final String ADDRESS_NUMBER = "265";
	private static final String ADDRESS_CEP = "295646-065";
	private static final String ADDRESS_CITY = "São Salvador";
	private static final String ADDRESS_COUNTRY = "Brazil";
	private static final long ADDRESS_ID = 1L;
	
	public static AddressDTO createFakeDTO() {
		return AddressDTO.builder()
				.address(ADDRESS)
				.number(ADDRESS_NUMBER)
				.cep(ADDRESS_CEP)
				.city(ADDRESS_CITY)
				.country(ADDRESS_COUNTRY)
				.build();
	}
	
	public static Address createFakeEntity() {
		return Address.builder()
				.id(ADDRESS_ID)
				.address(ADDRESS)
				.number(ADDRESS_NUMBER)
				.cep(ADDRESS_CEP)
				.city(ADDRESS_CITY)
				.country(ADDRESS_COUNTRY)
				.build();
	}
}
