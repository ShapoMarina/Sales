package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    void shouldCalculateAmountAllSales() {
        StatsService service = new StatsService();

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;

        int actual = service.getAmountAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAverageamountsales() {
        StatsService service = new StatsService();

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 15;

        int actual = service.getAverageamountsales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthWithMaxsales() {
        StatsService service = new StatsService();

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 8;

        int actual = service.maxSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthWithMinsales() {
        StatsService service = new StatsService();

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;

        int actual = service.minSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsWithBelowAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;

        int actual = service.monthsWithBelowAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthsWithHighAverageSales() {
        StatsService service = new StatsService();

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;

        int actual = service.monthsWithHighAverageSales(sales);

        Assertions.assertEquals(expected, actual);
    }
}
