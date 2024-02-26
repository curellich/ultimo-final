package ar.edu.undef.fie.domain;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private String name;
    private String author;

    private String topic;

    private Integer stock;

    private List<Order> orders;

    public Book(String name, String author, String topic, Integer stock) {
        this.name = name;
        this.author = author;
        this.topic = topic;
        this.stock = stock;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void decreaseStock() {
        this.stock--;
    }

    public void decreaseStockByNumber(int number) {
        this.stock = this.stock - number;
    }

    public void increaseStockByNumber(int number) {
        this.stock = this.stock + number;
    }

    public void makeOrder(Book book, Client client) {
        Order order = new Order(this.orders.size() + 1, book, client);
        client.addOrder(order);
        decreaseStock();
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", topic='" + topic + '\'' +
                ", stock=" + stock +
                '}';
    }
}
