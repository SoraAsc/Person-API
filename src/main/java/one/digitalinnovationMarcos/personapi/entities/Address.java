package one.digitalinnovationMarcos.personapi.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String address;
	@Column(nullable = false)
	private String number;
	@Column(nullable = false)
	private String cep;
	@Column(nullable = false)
	private String city;
	@Column(nullable = false)
	private String country;	
			
}
