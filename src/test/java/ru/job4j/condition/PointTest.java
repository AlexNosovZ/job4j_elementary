package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void whenPoints00And20Then2() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        double expected = 2.0;
        double output = p1.distance(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus1Minus1And1And1Then2Dot83() {
        Point p1 = new Point(-1, -1);
        Point p2 = new Point(1, 1);
        double expected = 2.83;
        double output = p1.distance(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2Minus2And2And2Then5Dot66() {
        Point p1 = new Point(-2, -2);
        Point p2 = new Point(2, 2);
        double expected = 5.66;
        double output = p1.distance(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints0And0And3And4Then5() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        double expected = 5;
        double output = p1.distance(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints1And2And2And4Then2dot24() {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(2, 4);
        double expected = 2.24;
        double output = p1.distance(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus2AndMinus3And4And1Then7dot21() {
        Point p1 = new Point(-2, -3);
        Point p2 = new Point(4, 1);
        double expected = 7.21;
        double output = p1.distance(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints7AndMinus3And7AndMinus3Then0() {
        Point p1 = new Point(7, -3);
        Point p2 = new Point(7, -3);
        double expected = 0;
        double output = p1.distance(p2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}