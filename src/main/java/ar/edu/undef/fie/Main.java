package ar.edu.undef.fie;

import ar.edu.undef.fie.domain.Client;
import ar.edu.undef.fie.domain.Library;
import ar.edu.undef.fie.domain.Menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library ateneo = new Library("Ateneo");
        ateneo.addBook("Deitel C++", "Desconocido", "Programacion", 10);
        ateneo.addBook("El Alquimista", "Pablo Cohelo", "Drama", 10);
        ateneo.addBook("Cronica de una muerte anunciada", "Garcia Marquez", "Drama", 10);
        ateneo.addBook("50 sombras de Gray", "Desconocido", "Drama", 10);
        ateneo.addBook("Harry Potter ", "Desconocido", "Aventura", 10);
        ateneo.addClients("Jonathan", "32494800");
        ateneo.addClients("Cristian", "32494799");



        int option = 0;
        Menu menu = new Menu(option);

        do {
            menu.showMenu();
            menu.actions(ateneo);

        } while (menu.getOption() != 5);




    }
}