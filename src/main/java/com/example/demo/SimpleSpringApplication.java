package com.example.demo;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.dao.PersonRepository;
import com.example.demo.ent.Person;

@SpringBootApplication
public class SimpleSpringApplication implements CommandLineRunner {
	@Autowired
	private PersonRepository persDao;

	public static void main(String[] args) {
		SpringApplication.run(SimpleSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		while (true) {
			s.log("new person .................. 1");
			s.log("update person ............... 2");
			s.log("delete person ............... 3");
			s.log("show persons ................ 4");
			s.log("quit ........................ 0");
			s.log("choice ...................... :");
			int choice = (new Scanner(System.in)).nextInt();
			switch (choice) {
			case 1:
				add();
				break;
			case 2:
				update();
				break;
			case 3:
				delete();
				break;
			case 4:
				show();
				break;
			case 0:
				break;
			default:
				break;
			}
		}

	}

	public void add() {
		Person p = gener(-1);
		persDao.save(p);
	}

	public void update() {
		s.log("id from person to udpate :");
		int id = (new Scanner(System.in)).nextInt();
		Person p = gener(id);
		persDao.save(p);
	}

	public void delete() {
		s.log("id from person to delete:");
		int id = (new Scanner(System.in)).nextInt();
		persDao.deleteById(id);
	}

	public Person gener(int id) {
		s.log("cin :");
		int cin = (new Scanner(System.in)).nextInt();
		s.log("nom :");
		String nom = (new Scanner(System.in)).nextLine();
		s.log("tel :");
		String tel = (new Scanner(System.in)).nextLine();
		return id == -1 ? new Person(cin, nom, tel) : new Person(id, cin, nom, tel);
	}

	public void show() {
		List<Person> list = persDao.findAll();
		list.forEach(p -> {
			System.out.println(p);
		});
	}

}
