package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int expected = 120;
        int number = 5;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int number = 0;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void  whenCalculateFactorialForOneThenOne() {
        int expected = 1;
        int number = 1;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void  whenCalculateFactorialForTwoThenTwo() {
        int expected = 2;
        int number = 2;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void  whenCalculateFactorialFor10Then3628800() {
        int expected = 3628800;
        int number = 10;
        int output = Factorial.calculate(number);
        assertThat(output).isEqualTo(expected);
    }
}