/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample;

import java.util.LinkedList;

/**
 * @author luis
 */
public class Store {

    public static void main(String[] args) {

        LinkedList<Customer> queue = new LinkedList();
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Ben"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Fred"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);
    }

    static void serveCustomer(LinkedList<Customer> queue) {
        Customer customerc = queue.poll();
        customerc.serve();
    }


}
