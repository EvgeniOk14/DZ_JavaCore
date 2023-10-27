package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Ведите логин не более 20 символов: ");
        Scanner scanner1 = new Scanner(System.in);
        String login = scanner1.nextLine();

        System.out.println("Ведите пароль не более 20 символов: ");
        Scanner scanner2 = new Scanner(System.in);
        String password = scanner2.nextLine();

        System.out.println("Ведите подтверждение пароля: ");
        Scanner scanner3 = new Scanner(System.in);
        String confirmPassword = scanner3.nextLine();


        AuthorizationPerson authorizationPerson = new AuthorizationPerson();
        System.out.println(authorizationPerson.getCustomer(login, password, confirmPassword));

    }
}