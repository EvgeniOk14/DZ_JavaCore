package org.example;

import lombok.Builder;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

@Builder

public class Main
{
    public static void main(String[] args) {

        /** Создали список для студетов **/
        ArrayList<Student> listOfStudens = new ArrayList<>();

        /** Создание списка оценок **/
        ArrayList<Double> listofGrades = DoubleStream
                .iterate(1.0, n -> Math.min(5.0, Math.round((n + 0.1) * 10.0) / 10.0))
                .limit(5)
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        /** Создание списка имён **/
        List<String> listOfNames = Arrays.asList("Иван", "Маша", "Кирилл", "Михаил", "Сергей", "Владимир", "Екатерина", "Светлана", "Антон");
        /** Создание мписка специальностей **/
        List<String> specialities = Arrays.asList("Математика", "Физика", "Информатика", "Биология", "Химия", "Информатика", "Информатика");

        /** Создание студентов с заполнеными полями в случайном порядке  **/
        Random random = new Random();
        ArrayList<Student> students = (ArrayList<Student>) Stream.generate(() ->
                {
                    String name = listOfNames.get(random.nextInt(listOfNames.size()));
                    List<Double> studentGrades = listofGrades
                            .stream()
                            .map(grade -> 4.0 + random.nextInt(4) + grade * 0.1)
                            .collect(Collectors.toList());
                    String speciality = specialities.get(random.nextInt(specialities.size()));
                    return new Student(name, studentGrades, speciality);
                })
                .limit(10).collect(Collectors.toList());

        /** Распечатываем все созданных студентов **/
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        students.forEach(student -> System.out.println(student.toString()));
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

        /** Делаем выборку по заданным параметрам **/
        List<Student> topInformaticsStudents = students.stream()
                .filter(student -> student.getSpecialty().equals("Информатика"))
                .filter(student -> student.getAverageGrade() > 4.5)

                .sorted(Comparator.comparing(Student::getAverageGrade).reversed())
                .collect(Collectors.toList());
        /** Печать результата выборки **/
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        topInformaticsStudents.forEach(student -> System.out.println(student.toString()));
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");


    }
}