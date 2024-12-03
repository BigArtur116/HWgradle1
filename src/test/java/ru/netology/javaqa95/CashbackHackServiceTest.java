package ru.netology.javaqa95;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void calcBonusTest() {
        CashbackHackService service = new CashbackHackService();
       assertEquals(400, service.remain(600));
    }

    @Test
    public void testIfBonusEquals0() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(1000, service.remain(0));
    }
    @Test
    public void testIfBonusMore1000() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(800, service.remain(1200));
    }

    @Test
    public void testIfBonusEquals1000() {
        CashbackHackService service = new CashbackHackService();
        assertEquals(0, service.remain(1000));
    }
}