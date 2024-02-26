package ar.edu.undef.fie.domain;

import java.util.Scanner;

public class Menu {

    private int option;


    public Menu(int option) {
        this.option = option;
    }

    public int getOption() {
        return option;
    }

    public int showMenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una opcion");
        System.out.println("1. Añadir libros");
        System.out.println("2. Realizar pedidos");
        System.out.println("3. Ver libros disponibles");
        System.out.println("4. Ver pedidos de clientes");
        System.out.println("5. Salir");
        this.option = scanner.nextInt();
        return option;
    }


    public void actions(Library library){
        Scanner scanner = new Scanner(System.in);

        switch (this.option){
            case 1:
                System.out.println("Ingrese titulo: ");
                String title = scanner.nextLine();
                System.out.println("Ingrese author: ");
                String author = scanner.nextLine();
                System.out.println("Ingrese genero: ");
                String topic = scanner.nextLine();
                System.out.println("Ingrese stock: ");
                int stcok = scanner.nextInt();
                library.addBook(title, author, topic, stcok);
                break;
            case 2:
                System.out.println("Ingrese titulo del libro a pedir: ");
                String bookTitle = scanner.nextLine();
                library.displayClients();
                System.out.println("Elija un numero de cliente: ");
                int clientNumber = scanner.nextInt();
                Client client = library.getClients().get(clientNumber);
                library.makeOrder(bookTitle, client);
                break;
            case 3:
                library.displayInventory();
                break;
            case 4:
                library.displayClients();
                System.out.println("Elija un numero de cliente: ");
                int clientNumber2 = scanner.nextInt();
                library.getClients().get(clientNumber2).displayOrders();
            case 5:
                break;

        }

    }
}
