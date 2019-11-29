package com.maximumvalue;

public class MaximumValue<E extends Comparable> {

    public E findMaxValueOfAnyType(E... param) {

        for (int i=0;i<param.length-1;i++)
        {
            for (int j=0;j<param.length-i-1;j++)
            {
                if (param[j].compareTo(param[j+1])>0) {
                    E temp = param[j];
                    param[j] = param[j + 1];
                    param[j + 1] = temp;
                }
            }

        }
        this.printMax( param[param.length-1]);
        return param[param.length-1];

    }

    public void printMax(E value)
    {
        System.out.println("Maximum value is "+value);

    }

}

