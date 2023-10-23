package org.example;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        /**Создаём всех сотрудников **/
        Employee director = new Director("Михаил", "Михайлов", StatusEmployee.DIRECTOR, 1000);
        Employee employee1 = new Employee("Иван", "Иванов", StatusEmployee.EMPLOYEE, 100);
        Employee employee2 = new Employee("Пётр", "Петров", StatusEmployee.EMPLOYEE, 100);
        Employee employee3 = new Employee("Николай", "Николаев", StatusEmployee.EMPLOYEE, 100);
        Employee employee4 = new Employee("Антон", "Антонов", StatusEmployee.EMPLOYEE, 100);
        Employee employee5 = new Employee("Кирилл", "Кириллов", StatusEmployee.EMPLOYEE, 100);

        /** Добавляем всех сотрудников в единый список **/
        ArrayList<Employee> listOfEmployee = new ArrayList<>();
        listOfEmployee.add(director);
        listOfEmployee.add(employee1);
        listOfEmployee.add(employee2);
        listOfEmployee.add(employee3);
        listOfEmployee.add(employee4);
        listOfEmployee.add(employee5);

        /** Печатаем всех сотрудников до повышения зарплаты **/
        System.out.println(listOfEmployee.toString());

        EncreaseSalary encreaseSalary = new EncreaseSalary();

        /** Поднимаем зарплату на 100  всем работникам, кроме директора **/
        encreaseSalary.increaseSalary(listOfEmployee);

    }
}