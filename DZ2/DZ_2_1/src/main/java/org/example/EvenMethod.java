package org.example;

public class EvenMethod
{
    private int count = 0;

    public void evenMethod(int[] arr)
        {
            for (int items: arr)
            {
                if(items % 2 == 0)
                {
                    count++;
                }
            }
            System.out.println("Количество чётных элементов в массиве равно: " + count);
        }
 }
