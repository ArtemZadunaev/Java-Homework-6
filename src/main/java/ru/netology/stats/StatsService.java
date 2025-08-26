package ru.netology.stats;

import java.util.Arrays;

public class StatsService {
    public long summarySales(long[] sales) {
        long summ = 0;
        for (long sale : sales) {
            summ += sale;
        }
        System.out.println("Суммарные продажи за год: "+summ);
        return summ;
    }

    public long average(long[] sales) {
        long average = summarySales(sales)/sales.length;
        System.out.println("Средние продажи за год "+average);
        return average;
    }

    public int maxSalesMonth(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        System.out.println("Максимальные продажи в "+maxMonth+" месяце");
        return maxMonth + 1;
    }

    public int minSalesMonth(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        System.out.println("Минимальные продажи в "+minMonth+" месяце");
        return minMonth + 1;

    }

    public int lowerAverageSales(long[] sales) {
        int lowerAvgSalesCount = 0;
        long average = average(sales);
        for (long sale : sales) {
            if (sale < average) {
                lowerAvgSalesCount++;
            }
        }
        System.out.println("Количество месяцев продажами ниже среднего "+ lowerAvgSalesCount);
        return lowerAvgSalesCount;
    }

    public int upperAverageSales(long[] sales) {
        int upperAvgSalesCount = 0;
        long average = average(sales);
        for (long sale : sales) {
            if (sale > average) {
                upperAvgSalesCount++;
            }
        }
        System.out.println("Количество месяцев продажами ниже среднего"+ upperAvgSalesCount);
        return upperAvgSalesCount;
    }
}
