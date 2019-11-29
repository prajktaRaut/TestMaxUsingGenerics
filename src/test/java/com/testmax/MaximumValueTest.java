package com.testmax;

import com.maximumvalue.MaximumValue;
import org.junit.Assert;
import org.junit.Test;

public class MaximumValueTest {

    @Test
    public void givenMethod_FindMaxValue_PresentAtFirstPositionAndReturn() {

        MaximumValue maximumValue=new MaximumValue();
        Integer max=maximumValue.findMaxAtFirstPosition(76,34,45);
        Assert.assertEquals(Integer.valueOf(76),max);

    }


}
