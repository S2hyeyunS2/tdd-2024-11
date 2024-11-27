package com.ll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
    @Test //테스트케이스 1개 만듦
    @DisplayName("1+2=3")
    public void testPlus(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        int rs=simpleCalculator.plus(1,2);

        Assertions.assertEquals(3,rs);
    }
}
