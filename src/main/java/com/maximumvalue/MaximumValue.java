package com.maximumvalue;

public class MaximumValue<E extends Comparable<E>> {

    E a,b,c;

    public MaximumValue(E a, E b, E c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static<E>  E findMaxValueOfAnyType(E i, E j, E k) {

        if (i.toString().compareTo(j.toString()) > 0)
            return i;
        if (j.toString().compareTo(k.toString()) > 0)
            return j;
        if (k.toString().compareTo(i.toString()) > 0)
            return k;

        return null;
    }


    public E testMaximum() {

        E value=findMaxValueOfAnyType(a,b,c);

        return value;

    }
}

