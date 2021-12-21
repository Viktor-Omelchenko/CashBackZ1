package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateTest {

    @Test
    public void calculateMiles() {

            Calculate service = new Calculate();

            int miles = 1000;
            int expected = 20;
            int actual = service.calculateMiles(miles);


            assertEquals(actual, expected);

    }
}