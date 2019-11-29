package com.testmax;

import com.maximumvalue.MaximumValue;
import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {

    @Test
    public void givenMethod_FindIntegerMaxValue_PresentAtFirstPositionAndReturn() {

        Integer max=MaximumValue.findMaxValueOfAnyType(76,34,45);
        Assert.assertEquals(Integer.valueOf(76),max);

    }

    @Test
    public void givenMethod_FindIntegerMaxValue_PresentAtSecondPositionAndReturn() {

        Integer max=MaximumValue.findMaxValueOfAnyType(34,76,45);
        Assert.assertEquals(Integer.valueOf(76),max);

    }

    @Test
    public void givenMethod_FindIntegerMaxValue_PresentAtThirdPositionAndReturn() {

        Integer max=MaximumValue.findMaxValueOfAnyType(34,45,76);
        Assert.assertEquals(Integer.valueOf(76),max);

    }

    @Test
    public void givenMethod_FindFloatMaxValue_PresentAtFirstPositionAndReturn() {

        Float max=MaximumValue.findMaxValueOfAnyType(7.6f,3.4f,4.5f);
        Assert.assertEquals(Float.valueOf(7.6f),max);

    }

    @Test
    public void givenMethod_FindFloatMaxValue_PresentAtSecondPositionAndReturn() {

        Float max=MaximumValue.findMaxValueOfAnyType(3.4f,7.6f,4.5f);
        Assert.assertEquals(Float.valueOf(7.6f),max);

    }

    @Test
    public void givenMethod_FindFloatMaxValue_PresentAtThirdPositionAndReturn() {

        Float max=MaximumValue.findMaxValueOfAnyType(3.4f,4.5f,7.6f);
        Assert.assertEquals(Float.valueOf(7.6f),max);

    }

    @Test
    public void givenMethod_FindStringMaxValue_PresentAtFirstPositionAndReturn() {

        String max=MaximumValue.findMaxValueOfAnyType("Peach","Apple","Banana");
        Assert.assertEquals("Peach",max);

    }

    @Test
    public void givenMethod_FindStringMaxValue_PresentAtSecondPositionAndReturn() {

        String max=MaximumValue.findMaxValueOfAnyType("Apple","Peach","Banana");
        Assert.assertEquals("Peach",max);

    }

    @Test
    public void givenMethod_FindStringMaxValue_PresentAtThirdPositionAndReturn() {

        String max=MaximumValue.findMaxValueOfAnyType("Apple","Banana","Peach");
        Assert.assertEquals("Peach",max);

    }

    @Test
    public void givenMethod_FindIntegerMaxValue_UsingparameterConstructore_ReturnMaxValue() {

        Integer maxValue=new MaximumValue<Integer>(76,87,12).testMaximum();
        Assert.assertEquals(Integer.valueOf(87),maxValue);
    }

    @Test
    public void givenMethod_FindFloatMaxValue_UsingparameterConstructore_ReturnMaxValue() {

        Float maxValue=new MaximumValue<Float>(8.6f,7.6f,1.2f).testMaximum();
        Assert.assertEquals(Float.valueOf(8.6f),maxValue);
    }

    @Test
    public void givenMethod_FindStringMaxValue_UsingparameterConstructore_ReturnMaxValue() {

        String maxValue=new MaximumValue<String>("Apple","Banana","Peach").testMaximum();
        Assert.assertEquals("Peach",maxValue);
    }



}
