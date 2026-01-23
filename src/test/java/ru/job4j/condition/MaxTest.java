package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MaxTest {

    @Test
    void when100And101When101() {
        int expected = 101;
        int output = Max.max(100, 101);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when100And101And99When101() {
        int expected = 101;
        int output = Max.max(100, 101, 99);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when500And101And99And500When100() {
        int expected = 500;
        int output = Max.max(500, 101, 99, 100);
        assertThat(output).isEqualTo(expected);
    }
}