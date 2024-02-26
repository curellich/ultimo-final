package ar.edu.undef.fie.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private String name;

    private Map<String, Book> inventory;

    private List<Client> clients;

    public Library(String name) {
        this.name = name;
        this.inventory = new HashMap<>();
        this.clients = new ArrayList<>();
    }

    public void addClients(String name, String dni) {
        Client client = new Client(name, dni);
        clients.add(client);
    }

    public void addBook(String name, String author, String topic, Integer stock) {
        Book book = new Book(name, author, topic, stock);
        inventory.put(book.getName(), book);
    }

    public void updateInvertory(String name, int amount, String action) {

        if (action.equals("add")) {
            inventory.get(name).increaseStockByNumber(amount);
        } else if (action.equals("remove")) {
            inventory.get(name).decreaseStockByNumber(amount);
        }

    }

    public void makeOrder(String bookName, Client client) {
        this.inventory.get(bookName).makeOrder(this.inventory.get(bookName), client);
    }


    public void displayInventory() {
        for (var book : this.inventory.entrySet()) {
            System.out.println(book.toString());
        }
    }

    public List<Client> getClients() {
        return clients;
    }

    public void displayClients() {
        for (int i = 0; i < clients.size(); i++) {
            System.out.println(i + "." + clients.get(i).toString());
        }
    }
}
