package org.example;

import java.util.ArrayList;

public class EncreaseSalary
{
    /** Метод повышающий всем работникам зарплату на 100, за исключением директора **/
    public void increaseSalary(ArrayList<Employee> listOfEmployee)
    {
        for(Employee employee: listOfEmployee)
        {
            if(employee.getStatus().equals(StatusEmployee.EMPLOYEE))
            {
                employee.setSalary(employee.getSalary() + 100);

            }
        }
        System.out.println(listOfEmployee.toString());
    }
}
