package ar.edu.undef.fie;

import ar.edu.undef.fie.domain.Client;
import ar.edu.undef.fie.domain.Librabry;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Librabry ateneo = new Librabry("Ateneo");
        Client jorge = new Client("Jorge", "32494800");


        //Requerimiento 1 Añadir libros al inventraio con  sus cantidades
        ateneo.addBook("Deitel C++", "Desconocido", "Programacion", 10);
        ateneo.addBook("El Alquimista", "Pablo Cohelo", "Drama", 10);
        ateneo.addBook("Cronica de una muerte anunciada", "Garcia Marquez", "Drama", 10);
        ateneo.addBook("50 sombras de Gray", "Desconocido", "Drama", 10);
        ateneo.addBook("Harry Potter ", "Desconocido", "Aventura", 10);

        //Requerimiento 2 realizar pedidos de libros.
        ateneo.makeOrder("Deitel C++", jorge);
        ateneo.makeOrder("El Alquimista", jorge);

        //Requerimiento 3 Mostrar los libros disponibles en el inventario con sus cantidades
        System.out.println("Requerimiento 3 Mostrar los libros disponibles en el inventario");
        System.out.println("-------------------------------------------------------------------");
        ateneo.displayInventory();

        //Requerimiento 4 mostrar pedidos de un cliente
        System.out.println("\n Requerimiento 4 mostrar pedidos de un cliente");
        System.out.println("-------------------------------------------------------------------");
        jorge.displayOrders();


        //Requerimiento 5 actualizar inventario,
        System.out.println("\nRequerimiento 5 actualizar inventario, agrego 10 a 50 sombras");
        System.out.println("-------------------------------------------------------------------");
        ateneo.updateInvertory("50 sombras de Gray", 10, "add");

        System.out.println("\nMuestro la actualizacion");
        System.out.println("-------------------------------------------------------------------");
        ateneo.displayInventory();






    }
}