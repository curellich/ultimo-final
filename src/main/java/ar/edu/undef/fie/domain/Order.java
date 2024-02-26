package ar.edu.undef.fie.domain;

public class Order {

    private int orderNumber;

    private Book book;

    private Client client;

    public Order(int orderNumber, Book book, Client client) {
        this.orderNumber = orderNumber;
        this.book = book;
        this.client = client;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber=" + orderNumber +
                ", book=" + book +
                ", client=" + client +
                '}';
    }
}
