package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RectangleTest {

    @Test
    void whenLength3AndWidth4ThenDiagonal5() {
        double length = 3;
        double width = 4;
        double expected = 5.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength5AndWidth12ThenDiagonal13() {
        double length = 5;
        double width = 12;
        double expected = 13.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength7AndWidth24ThenDiagonal25() {
        double length = 7;
        double width = 24;
        double expected = 25.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength0dot6AndWidth0dot8ThenDiagonal1() {
        double length = 0.6;
        double width = 0.8;
        double expected = 1.0;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength1AndWidth1ThenDiagonal1dot41() {
        double length = 1;
        double width = 1;
        double expected = 1.41;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength4dot2Width4dot2ThenDiagonal5dor94() {
        double length = 4.2;
        double width = 4.2;
        double expected = 5.94;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}