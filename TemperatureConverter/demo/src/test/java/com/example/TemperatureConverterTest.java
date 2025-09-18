package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TemperatureConverterTest {
    @Test
    void testCelsiusToFahrenheit() {
        assertEquals(10.0, TemperatureConverter.FahrenheitToCelsius(50.0));
    }

    @Test
    void testFahrenheitToCelsius() {
        assertEquals(50.0, TemperatureConverter.CelsiusToFahrenheit(10.0));
    }

    @Test
    void isExtremeTemperature(){
        assertEquals(true, TemperatureConverter.isExtremeTemperature(-49.5));
        assertEquals(true, TemperatureConverter.isExtremeTemperature(53.7));
        assertEquals(false, TemperatureConverter.isExtremeTemperature(43.3));
    }

    @Test
    void testKelvintoCelsius() {
        assertEquals(26.85, TemperatureConverter.KelvinToCelsius(300));
    }
}
