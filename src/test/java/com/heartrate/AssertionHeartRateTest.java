package karvonen_practice.src.main.java.com.heartrate;

import java.util.HexFormat;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import com.heartrate.*;
/**
 * Unit test for simple App.
 */
public class AssertionHeartRateTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    void testtargetHeartRate()
    {
        //Assertions.Assert ssertequals(Heart.targetHeartRate(22,65,55),138);
        Assertions.assertEquals(138,Heart.targetHeartRate(22, 65, 55));
    }
}
