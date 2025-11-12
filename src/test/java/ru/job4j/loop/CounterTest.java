package ru.job4j.loop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    @DisplayName("when start is bigger than finish")
    void whenSumNumbersStart5AndFinish0Then0() {
        int start = 5;
        int finish = 0;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersStartMinus100AndFinish101Then101() {
        int start = -100;
        int finish = 101;
        int expected = 101;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersStartMinus5AndFinish0ThenMinus15() {
        int start = -5;
        int finish = 0;
        int expected = -15;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersStart0AndFinish5Then15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumNumbersStart100AndFinish105Then615() {
        int start = 100;
        int finish = 105;
        int expected = 615;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus11To10Then0() {
        int start = -11;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus12To10ThenMinus12() {
        int start = -12;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = -12;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom11ToMinus10Then0() {
        int start = 11;
        int finish = -10;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom99To101Then100() {
        int start = 99;
        int finish = 101;
        int result = Counter.sumByEven(start, finish);
        int expected = 100;
        assertThat(result).isEqualTo(expected);
    }
}