package com.ll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SimpleCalculatorTest {
    @Test //테스트케이스 1개 만듦
    @DisplayName("1+2=3")
    public void t1(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        int rs=simpleCalculator.plus(1,2);

        Assertions.assertEquals(3,rs);
    }

    @Test //테스트케이스 2개 만듦
    @DisplayName("2+10=12")
    public void t2(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        int rs=simpleCalculator.plus(2,10);

        Assertions.assertEquals(12,rs);
    }
}
