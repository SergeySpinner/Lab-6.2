package com.jetbrains;

public class FirstClass implements IClass {

    private int counting = 1;

    public int getCounting() {
        return counting;
    }

    @Override
    public int count(int number) {
        if((number % 10 >= 0)&&(number >= 10)) {
            this.counting++;
            number = number / 10;
            return count(number);
        }
        else
            return getCounting();
    }
}
