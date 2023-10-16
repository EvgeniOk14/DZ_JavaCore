package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        int[] arr2 = {1, 5, 0, 0 , 5, 10};
        System.out.println(Arrays.toString(arr2));
        MethodFindZero methodFindZero1 = new MethodFindZero();
        methodFindZero1.FindTwoZero(arr2);


        FillArrayRandom fillArrayRandom = new FillArrayRandom();
        MethodFindZero methodFindZero = new MethodFindZero();
        methodFindZero.FindTwoZero(fillArrayRandom.fillArrayRandom());

    }
}