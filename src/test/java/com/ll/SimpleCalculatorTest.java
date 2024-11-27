package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SimpleCalculatorTest {
    @Test //테스트케이스 1개 만듦
    @DisplayName("1+2=3")
    public void t1(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        int rs=simpleCalculator.plus(1,2);

        assertThat(rs).isEqualTo(3);
    }

    @Test //테스트케이스 2개 만듦
    @DisplayName("2+10=12")
    public void t2(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        int rs=simpleCalculator.plus(2,10);

        assertThat(rs).isEqualTo(12);
    }

    @Test //테스트케이스 3개 만듦
    @DisplayName("20+10=30")
    public void t3(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        int rs=simpleCalculator.plus(20,10);

        assertThat(rs).isEqualTo(30);
    }

    @Test //테스트케이스 3개 만듦
    @DisplayName("10-5=5")
    public void t4(){
        SimpleCalculator simpleCalculator=new SimpleCalculator();
        int rs=simpleCalculator.minus(10,5);

        assertThat(rs).isEqualTo(5);
    }
}
