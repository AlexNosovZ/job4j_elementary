package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TurnTest {
    @Test
    void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = {2, 6, 1, 4};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        int[] input = {1, 2, 3, 4, 5};
        int[] result = Turn.back(input);
        int[] expected = {5, 4, 3, 2, 1};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithSixElementsThenTurnedArray() {
        int[] input = {6, 5, 4, 3, 2, 1};
        int[] result = Turn.back(input);
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertThat(result).containsExactly(expected);
    }

    @Test
    void whenTurnArrayWithSevenElementsThenTurnedArray() {
        int[] input = {7, 6, 5, 4, 3, 2, 1};
        int[] result = Turn.back(input);
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        assertThat(result).containsExactly(expected);
    }
}