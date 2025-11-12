package ru.job4j.loop;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CounterTest {

    @Test
    @DisplayName("when start is bigger than finish")
    void whenStart5AndFinish0Then0() {
        int start = 5;
        int finish = 0;
        int expected = 0;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus100AndFinish101Then101() {
        int start = -100;
        int finish = 101;
        int expected = 101;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus5AndFinish0ThenMinus15() {
        int start = -5;
        int finish = 0;
        int expected = -15;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart0AndFinish5Then15() {
        int start = 0;
        int finish = 5;
        int expected = 15;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart100AndFinish105Then615() {
        int start = 100;
        int finish = 105;
        int expected = 615;
        int output = Counter.sum(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}