package org.ma.console.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class Menu {
    @Bean
    CommandLineRunner go(PersonService personService) {
        return a -> {
            /// //////////////
            while (true) {
                System.out.println("new person .................. 1");
                System.out.println("update person ............... 2");
                System.out.println("delete person ............... 3");
                System.out.println("show persons ................ 4");
                System.out.println("choice ...................... :");
                int choice = (new Scanner(System.in)).nextInt();
                switch (choice) {
                    case 1:
                        personService.add();
                        break;
                    case 2:
                        personService.update();
                        break;
                    case 3:
                        personService.delete();
                        break;
                    case 4:
                        personService.show();
                        break;
                    default:
                        break;
                }
            }

            /// ///////////
        };
    }
}
