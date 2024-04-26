package ru.netology;


import org.junit.Test;

import static org.junit.Assert.*;

public class CashBackHackServiceTest {

    @Test
    public void ShouldReturn440() {
        CashBackHackService service = new CashBackHackService();
        int amount = 2560;
        int actual = service.remain(amount);
        int expected = 440;
        assertEquals(actual, expected);

    }

    @Test
    public void ShouldReturn860() {
        CashBackHackService service = new CashBackHackService();
        int amount = 140;
        int actual = service.remain(amount);
        int expected = 860;
        assertEquals(actual, expected);

    }

    @Test
    public void ShouldReturn800() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1200;
        int actual = service.remain(amount);
        int expected = 800;
        assertEquals(actual, expected);
    }

    @Test
    public void ShouldReturnZero() {
        CashBackHackService service = new CashBackHackService();

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }
}