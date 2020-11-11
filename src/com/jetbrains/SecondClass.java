package com.jetbrains;

public class SecondClass implements IClass {
    private int counting = 0;
    @Override
    public int count(int number) {
        for(int i = 2; i < 100;  i++) {
            if ((number % i == 0) && (number != 1)) {
                number = number / i;
                counting++;
                return count(number);
            }
        }
        return counting;
    }
}
