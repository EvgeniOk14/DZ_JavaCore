package org.example;
import java.util.Comparator;
public class Employee
{

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public int getMonth()
    {
        return month;
    }

    public void setMonth(int month)
    {
        this.month = month;
    }

    public int getDay()
    {
        return day;
    }

    public void setDay(int day)
    {
        this.day = day;
    }

    public static Comparator<Employee> getDateComparator()
    {
        return DateComparator;
    }

    public static void setDateComparator(Comparator<Employee> dateComparator)
    {
        DateComparator = dateComparator;
    }

    public Employee(int year, int month, int day)
    {
        this.year = year;
        this.month = month;
        this.day = day;

    }

    private int year;
    private int month;
    private int day;

        public static Comparator<Employee> DateComparator = new Comparator<Employee>()
        {

            @Override
            public int compare(Employee s1, Employee s2)
            {
                int yearComparison = Integer.compare(s1.year, s2.year);
                if (yearComparison != 0)
                {
                    return yearComparison;
                }

                int monthComparison = Integer.compare(s1.month, s2.month);
                if (monthComparison != 0)
                {
                    return monthComparison;
                }

                return Integer.compare(s1.day, s2.day);
            }
        };
    }

