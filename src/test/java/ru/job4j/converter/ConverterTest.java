package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert180RblThen1dot9161Euro() {
        double input = 180;
        double expected = 1.9161;
        double output = Converter.rubleToEuro(input);
        double value = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert9394RblThen100Euro() {
        double input = 9394;
        double expected = 100;
        double output = Converter.rubleToEuro(input);
        double value = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert225RblThen3Dollar() {
        double input = 225;
        double expected = 2.7692;
        double output = Converter.rubleToDollar(input);
        double value = 0.0001;
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvert8125RblThen100Dollar() {
        double input = 8125;
        double expected = 100;
        double value = 0.0001;
        double output = Converter.rubleToDollar(input);
        assertThat(output).isEqualTo(expected, withPrecision(value));
    }
}