package ru.netology;


import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashBackHackServiceTest {

    @Test
    public void ShouldReturn1000() {
        CashBackHackService service = new CashBackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(expected, actual);

    }

    @Test
    public void ShouldReturn900() {
        CashBackHackService service = new CashBackHackService();
        int amount = 100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(expected, actual);

    }

    @Test
    public void ShouldReturn700() {
        CashBackHackService service = new CashBackHackService();
        int amount = 1300;
        int actual = service.remain(amount);
        int expected = 700;
        assertEquals(expected, actual);
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