package org.example;


public class Main {
    public static void main(String[] args)
    {
    Customer customer1 = new Customer(1,"Иван");
    Product product1 = new Product(1,"Телефон", 10000);
    Product product2 = new Product(2,"Ноутбук", 50000);

    ShoppingCart shoppingCart = new ShoppingCart();

        try {
        shoppingCart.makePurchase(customer1, product1, 2);
        shoppingCart.makePurchase(customer1, product2, 3);
    } catch (IllegalArgumentException e) {
        System.out.println("Ошибка: " + e.getMessage());
    }

    int totalPurchases = shoppingCart.getTotalPurchases();
        System.out.println("Количество совершённых покупок: " + totalPurchases);
}
}