package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();
    @Test
    void shouldCalculateSum(){
        long actual = service.summarySales(sales);
        long expected = 180;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void shouldCalculateAverage(){
        long actual = service.average(sales);
        long expected = 15;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    void shouldCalculateMaxSalesMonth(){
        long []actual = service.maxSalesMonth(sales);
        long []expected ={6,8};
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    void shouldCalculateMinSalesMonth(){
        long []actual = service.minSalesMonth(sales);
        long []expected ={9};
        Assertions.assertArrayEquals(expected,actual);
    }
    @Test
    void shouldCalculateLowerAverage(){
        long actual = service.lowerAverageSales(sales);
        long expected =5;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    void shouldCalculateUpperAverage(){
        int actual = service.upperAverageSales(sales);
        int expected = 5;
    }
}
