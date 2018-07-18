package com.pxu.demo;

public class AsyncCalculator implements Calculator {
    int relsut = 0;

    @Override
    public void add(int a, int b) {
        relsut = a + b;
    }

    @Override
    public int getResult() {
        return 1;
    }
}
