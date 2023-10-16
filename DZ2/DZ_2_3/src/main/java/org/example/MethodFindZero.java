package org.example;

public class MethodFindZero
{
    public boolean FindTwoZero(int[] arr)
    {
        for(int i =0; i < arr.length; i++)
        {
            if(arr[i] == 0 && arr[i] == arr[i+1])
            {
                System.out.println(true);
               return true;
            }
        }
        System.out.println(false);
        return false;
    }
}
