package ru.netology;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashBackHackServiceTest {

    @Test
    public void ShouldReturn1000() {
        CashBackHackService service = new CashBackHackService();

        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void ShouldReturn900() {
        CashBackHackService service = new CashBackHackService();

        int amount = 100;

        int expected = 900;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @Test
    public void ShouldReturn700() {
        CashBackHackService service = new CashBackHackService();

        int amount = 1300;

        int expected = 700;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }


}