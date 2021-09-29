package one.digitalinnovationMarcos.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import one.digitalinnovationMarcos.personapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
