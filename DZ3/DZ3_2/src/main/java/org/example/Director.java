package org.example;

import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class Director extends Employee
{
    private int id;
    private String name;
    private String serName;
    private StatusEmployee status;
    private int salary;
    private static int currentDirectorId =1;

    public Director(String name, String serName, StatusEmployee status, int salary) {
        this.id = currentDirectorId++;
        this.name = name;
        this.serName = serName;
        this.status = StatusEmployee.DIRECTOR;
        this.salary = salary;
    }



    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("\n").append("Порядковый номер: ").append(id).append("\n")
                .append("Имя: ").append(name).append("\n")
                .append("фамилия: ").append(serName).append("\n")
                .append("Статус: ").append(status).append("\n")
                .append("Запрлата: ").append(salary).append("\n");
        return sb.toString();
    }

}
