package com.maximumvalue;

public class MaximumValue {

    public Integer findMaxAccordingToPosition(Integer i, Integer j, Integer k) {

        if (i.compareTo(j) > 0)
            return i;
        if (j.compareTo(k) > 0)
            return j;
        if (k.compareTo(i) > 0)
            return k;

        return null;
    }

    public Float findMaxAccordingToPosition(Float i, Float j, Float k) {

        if (i.compareTo(j) > 0)
            return i;
        if (j.compareTo(k) > 0)
            return j;
        if (k.compareTo(i) > 0)
            return k;

        return null;

    }
}

