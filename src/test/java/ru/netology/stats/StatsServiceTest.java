package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StatsServiceTest {
    @Test
        public void testSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testAverSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.averageSum(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);

    }

}


