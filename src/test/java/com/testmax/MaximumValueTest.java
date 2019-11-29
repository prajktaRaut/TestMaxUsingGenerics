package com.testmax;

import com.maximumvalue.MaximumValue;
import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {

    MaximumValue maximumValue=new MaximumValue();
    @Test
    public void givenMethod_FindIntegerMaxValue_PresentAtFirstPositionAndReturn() {

        Integer max= (Integer) maximumValue.findMaxValueOfAnyType(76,45,12);
        Assert.assertEquals(Integer.valueOf(76),max);

    }

    @Test
    public void givenMethod_FindIntegerMaxValue_PresentAtSecondPositionAndReturn() {

        Integer max= (Integer) maximumValue.findMaxValueOfAnyType(34,76,45);
        Assert.assertEquals(Integer.valueOf(76),max);

    }

    @Test
    public void givenMethod_FindIntegerMaxValue_PresentAtThirdPositionAndReturn() {

        Integer max= (Integer) maximumValue.findMaxValueOfAnyType(34,45,76);
        Assert.assertEquals(Integer.valueOf(76),max);

    }

    @Test
    public void givenMethod_FindFloatMaxValue_PresentAtFirstPositionAndReturn() {

        Float max= (Float) maximumValue.findMaxValueOfAnyType(7.6f,3.4f,4.5f);
        Assert.assertEquals(Float.valueOf(7.6f),max);

    }

    @Test
    public void givenMethod_FindFloatMaxValue_PresentAtSecondPositionAndReturn() {

        Float max= (Float) maximumValue.findMaxValueOfAnyType(3.4f,7.6f,4.5f);
        Assert.assertEquals(Float.valueOf(7.6f),max);

    }

    @Test
    public void givenMethod_FindFloatMaxValue_PresentAtThirdPositionAndReturn() {

        Float max= (Float) maximumValue.findMaxValueOfAnyType(3.4f,4.5f,7.6f);
        Assert.assertEquals(Float.valueOf(7.6f),max);

    }

    @Test
    public void givenMethod_FindStringMaxValue_PresentAtFirstPositionAndReturn() {

        String max= (String) maximumValue.findMaxValueOfAnyType("Peach","Apple","Banana");
        Assert.assertEquals("Peach",max);

    }

    @Test
    public void givenMethod_FindStringMaxValue_PresentAtSecondPositionAndReturn() {

        String max= (String) maximumValue.findMaxValueOfAnyType("Apple","Peach","Banana");
        Assert.assertEquals("Peach",max);

    }

    @Test
    public void givenMethod_FindStringMaxValue_PresentAtThirdPositionAndReturn() {

        String max= (String) maximumValue.findMaxValueOfAnyType("Apple","Banana","Peach");
        Assert.assertEquals("Peach",max);

    }

}
