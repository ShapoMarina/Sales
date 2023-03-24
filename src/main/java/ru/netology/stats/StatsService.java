package ru.netology.stats;

public class StatsService {
    public int getAmountAllSales(int[] sales) {
        int amountAllSales = 0;

        for (int s : sales) {
            amountAllSales = amountAllSales + s;
        }
        return amountAllSales;
    }

    public int getAverageamountsales(int[] sales) {
        int averageAmount = getAmountAllSales(sales) / sales.length;

        return averageAmount;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int monthsWithBelowAverageSales(int[] sales) {
        int monthsBelowAverage = 0;

        for (int i = 0; i <sales.length ; i++) {
            if (sales[i] < getAverageamountsales(sales)) {
                monthsBelowAverage += 1;
            }
        }
        return monthsBelowAverage;
    }

    public int monthsWithHighAverageSales(int[] sales) {
        int monthsHighAverage = 0;

        for (int i = 0; i <sales.length ; i++) {
            if (sales[i] > getAverageamountsales(sales)) {
                monthsHighAverage += 1;
            }
        }
        return monthsHighAverage;
    }
}

