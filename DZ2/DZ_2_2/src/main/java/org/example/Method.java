package org.example;

public class Method
{
    public void MaxMinDifference(int[] arr)
    {
        int min = arr[0];
        int max = arr[0];
        if(arr.length == 0)

        {
            throw  new IllegalArgumentException("Массив не должен быть пустым! ");
        }

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Разница max - min = " + (max-min));
    }
}
