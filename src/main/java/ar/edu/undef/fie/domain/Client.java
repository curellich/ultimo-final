package ar.edu.undef.fie.domain;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;

    private String dni;

    private List<Order> orders;

    public Client(String name, String dni) {
        this.name = name;
        this.dni = dni;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order){
        orders.add(order);
    }

    public void displayOrders(){
        for(var order : orders){
            System.out.println(order.toString());
        }
    }
}
