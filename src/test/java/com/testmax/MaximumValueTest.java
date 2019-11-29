package com.testmax;

import com.maximumvalue.MaximumValue;
import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {

    @Test
    public void givenMethod_FindIntegerMaxValue_PresentAtFirstPositionAndReturn() {

        MaximumValue maximumValue=new MaximumValue();
        Integer max=maximumValue.findMaxAccordingToPosition(76,34,45);
        Assert.assertEquals(Integer.valueOf(76),max);

    }

    @Test
    public void givenMethod_FindIntegerMaxValue_PresentAtSecondPositionAndReturn() {

        MaximumValue maximumValue=new MaximumValue();
        Integer max=maximumValue.findMaxAccordingToPosition(34,76,45);
        Assert.assertEquals(Integer.valueOf(76),max);

    }

    @Test
    public void givenMethod_FindIntegerMaxValue_PresentAtThirdPositionAndReturn() {

        MaximumValue maximumValue=new MaximumValue();
        Integer max=maximumValue.findMaxAccordingToPosition(34,45,76);
        Assert.assertEquals(Integer.valueOf(76),max);

    }

    @Test
    public void givenMethod_FindFloatMaxValue_PresentAtFirstPositionAndReturn() {

        MaximumValue maximumValue=new MaximumValue();
        Float max=maximumValue.findMaxAccordingToPosition(7.6f,3.4f,4.5f);
        Assert.assertEquals(Float.valueOf(7.6f),max);

    }

    @Test
    public void givenMethod_FindFloatMaxValue_PresentAtSecondPositionAndReturn() {

        MaximumValue maximumValue=new MaximumValue();
        Float max=maximumValue.findMaxAccordingToPosition(3.4f,7.6f,4.5f);
        Assert.assertEquals(Float.valueOf(7.6f),max);

    }

}
