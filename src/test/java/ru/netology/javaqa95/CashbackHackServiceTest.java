package ru.netology.javaqa95;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void calcBonusTest() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(600), 400);
    }

    @Test
    public void testIfBonusEquals0() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void testIfBonusMore1000() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1200), 800);
    }

    @Test
    public void testIfBonusEquals1000() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(1000), 0);
    }
}