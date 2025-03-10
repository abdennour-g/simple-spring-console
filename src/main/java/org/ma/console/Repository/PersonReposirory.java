package org.ma.console.Repository;

import org.ma.console.entite.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonReposirory extends JpaRepository<Person, UUID> {
}
