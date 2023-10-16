package org.example;

import java.util.Arrays;
import java.util.Random;

public class FillArrayRandom
{
    public int[] fillArrayRandom()
    {
        int[] arr = new int[10];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("массив случайных чисел:\n" + Arrays.toString(arr));
        return arr;
    }

}
