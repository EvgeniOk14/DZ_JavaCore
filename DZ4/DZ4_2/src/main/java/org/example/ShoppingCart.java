package org.example;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart
{
    private List<Order> orders = new ArrayList<>();

    public Order makePurchase(Customer customer, Product product, int quantity)
    {
        if (customer == null || product == null || quantity <= 0)
        {
            throw new IllegalArgumentException("Не действительный Покупатель, Товар, или Количество");
        }

        Order order = new Order(customer, product, quantity);
        orders.add(order);
        return order;
    }

    public int getTotalPurchases()
    {
        return orders.size();
    }
}
