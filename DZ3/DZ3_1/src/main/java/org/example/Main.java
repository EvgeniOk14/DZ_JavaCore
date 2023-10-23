package org.example;

import java.time.LocalDate;

public class Main
{
    public static void main(String[] args)
    {
        Employee employee1 = new Employee(2020, 03 ,03);
        Employee employee2 = new Employee(2023, 03,03);
        int result = Employee.DateComparator.compare(employee1, employee2);
        if (result < 0)
        {
            System.out.println("employee1 предшествует employee2");
        } else if (result > 0)
        {
            System.out.println("employee2 предшествует + employee1");
        }
        else
        {
            System.out.println("employee1 и  employee2 + имеют одинаковую дату");
        }
    }
}