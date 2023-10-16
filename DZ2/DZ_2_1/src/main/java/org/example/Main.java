package org.example;

public class Main {
    public static void main(String[] args)
    {
        int[] arr1 = {2, 1, 2, 3, 4};
        int[] arr2 = {2, 2, 0};
        int[] arr3 = {1, 3, 5};

        EvenMethod evenMethod1 = new EvenMethod();
        evenMethod1.evenMethod(arr1);
        EvenMethod evenMethod2 = new EvenMethod();
        evenMethod2.evenMethod(arr2);
        EvenMethod evenMethod3 = new EvenMethod();
        evenMethod3.evenMethod(arr3);

    }
}