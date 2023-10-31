package org.example;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private String name;
    private List<Double> listOfGrades;

    private String specialty;
    private Double averageGrade;

    public Student(String name, List<Double> listOfGrades, String specialty)
    {
        this.name = name;
        this.listOfGrades = listOfGrades;
        this.specialty = specialty;
        this.averageGrade = getAverageGrade();
    }

//    public double getAverageGrade(ArrayList<Double> listOfGrades)
//    {
//       return averageGrade = listOfGrades.stream().mapToDouble(n -> n).average().orElse(0.0);
//    }

    public double getAverageGrade() {
        if (listOfGrades == null || listOfGrades.isEmpty()) {
            return 0.0; // Избегаем деления на ноль
        }
        return listOfGrades.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
    }


    public String getSpecialty() {
        return specialty;
    }


    @Override
    public String toString()
    {
        StringBuilder sb =  new StringBuilder();
        sb.append("\n").append("Имя студента: ").append(name).append("\n")
                .append("Лист оценок студента :").append(listOfGrades).append("\n")
                .append("Специальность студента: ").append(specialty).append("\n")
                .append("Средняя оценка студента: ").append(averageGrade).append("\n");
        return sb.toString();
    }
}
