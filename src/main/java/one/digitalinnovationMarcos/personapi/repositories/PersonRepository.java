package one.digitalinnovationMarcos.personapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovationMarcos.personapi.entities.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {

}
