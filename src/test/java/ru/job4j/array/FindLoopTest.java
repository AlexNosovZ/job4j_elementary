package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int element = 5;
        int result = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14};
        int element = 10;
        int result = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHas12Then11() {
        int[] data = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 13, 14};
        int element = 12;
        int result = FindLoop.indexOf(data, element);
        int expected = 11;
        assertThat(result).isEqualTo(expected);
    }
}