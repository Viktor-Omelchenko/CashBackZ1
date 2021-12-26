package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.testng.Assert.*;

public class BonusServiceTest {

    @Test
    void shouldCalculateBonus() {
        BonusService service = new BonusService();

        int amount = 1000;
        int expected = 10;
        int actual = service.calculateBonus(amount);


        assertEquals(actual, expected);

    }
}