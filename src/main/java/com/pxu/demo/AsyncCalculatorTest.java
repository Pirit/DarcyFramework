package com.pxu.demo;

import java.time.temporal.ChronoUnit;

import static com.redhat.synq.Synq.after;

public class AsyncCalculatorTest {
    private Calculator calc = new AsyncCalculator();

    public int asyncAddTest() {
        int result = after(() -> calc.add(2, 2))
                .expectCallTo(calc::getResult, rs -> rs == 4)
//                .failIfCallTo(calc::getResult, rs -> rs != null && rs == 4)
//                .throwing(new AssertionError("Learn to add!"))
                .waitUpTo(10, ChronoUnit.SECONDS);
        return result;
    }

    public static void main(String[] args) {
        AsyncCalculatorTest asct = new AsyncCalculatorTest();
        int rs = asct.asyncAddTest();
        System.out.println(rs);
    }
}
