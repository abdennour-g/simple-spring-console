package org.ma.console.service;

import org.ma.console.Repository.PersonReposirory;
import org.ma.console.entite.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;
import java.util.UUID;

@Service
public class PersonService {
    @Autowired
    private PersonReposirory personReposirory;
    private Scanner scanner = new Scanner(System.in);

    public Person add() {
        return personReposirory.save(gener(null));
    }

    public Person update() {
        System.out.println("id from person to udpate :");
        UUID id = UUID.fromString(scanner.nextLine());
        return personReposirory.save(gener(id));
    }

    public void delete() {
        System.out.println("id from person to delete :");
        UUID id = UUID.fromString(scanner.nextLine());
        personReposirory.deleteById(id);
    }

    public void show() {
        personReposirory.findAll().forEach(System.out::println);
    }

    public void showOne(UUID id) {
        System.out.println(personReposirory.findById(id).get());
    }

    public Person gener(UUID id) {
        System.out.println("name :");
        String name = scanner.nextLine();
        System.out.println("email :");
        String email = scanner.nextLine();
        return new Person(id, name, email);
    }
}
