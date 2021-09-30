package one.digitalinnovationMarcos.personapi.dto.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressDTO {

	private Long id;
	
	@NotEmpty
	@Size(min=12, max = 100)
	private String address;
	
	@NotEmpty
	@Size(min=2, max = 10)
	private String number;	

	@Size(min=2, max = 100)
	private String cep;
	
	@NotEmpty
	@Size(min=5, max = 100)
	private String city;
	
	@NotEmpty
	@Size(min=5, max = 100)
	private String country;	

}
