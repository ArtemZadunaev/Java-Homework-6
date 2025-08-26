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
        long summ = summarySales(sales);
        long average = summ / sales.length;
        System.out.println("Средние продажи за год "+average);
        return average;
    }

    public long[] maxSalesMonth(long[] sales) {
        long maxSale = 0;
        int count = 0;
        for (int i = 0; i < 2; i++) {//Дважды прогоняется массив, сначала для поиска наивысшего значения,
            for (long sale : sales) {// а потом для поиска количества совпадений, чтобы в дальнейшем создать нужной длинны массив.
                if (sale > maxSale) {
                    maxSale = sale;
                } else if (i == 1 && maxSale == sale) {
                    count++;
                }
            }
        }
        if (count==0){
            count++;
        }
        long[] arrayMaxMonth = new long[count];

        int tmpCount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == maxSale) {
                arrayMaxMonth[tmpCount] = i+1;
                tmpCount++;
            }
        }
        System.out.println(Arrays.toString(arrayMaxMonth) + "были максимальные продажи");
        return arrayMaxMonth;
    }

    public long[] minSalesMonth(long[] sales) {
        long minSale = Long.MAX_VALUE;
        int count = 0;
        for (int i = 0; i < 2; i++) {
            for (long sale : sales) {
                if (sale < minSale) {
                    minSale = sale;
                } else if (i == 1 && minSale == sale) {
                    count++;
                }
            }
        }
        if (count==0){
            count++;
        }
        long[] arrayMinMonth = new long[count];

        int tmpCount = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == minSale) {
                arrayMinMonth[tmpCount] = i+1;
                tmpCount++;
            }
        }
        System.out.println(Arrays.toString(arrayMinMonth) + "были минимальные продажи");
        return arrayMinMonth;
    }

    public int lowerAverageSales(long[] sales) {
        int lowerAvgSalesCount = 0;
        long avg = average(sales);
        for (long sale : sales) {
            if (sale < avg) {
                lowerAvgSalesCount++;
            }
        }
        System.out.println("Количество месяцев продажами ниже среднего"+ lowerAvgSalesCount);
        return lowerAvgSalesCount;
    }

    public int upperAverageSales(long[] sales) {
        long avg = average(sales);
        int upperAvgSalesCount = 0;
        for (long sale : sales) {
            if (sale > avg) {
                upperAvgSalesCount++;
            }
        }
        System.out.println("Количество месяцев продажами ниже среднего"+ upperAvgSalesCount);
        return upperAvgSalesCount;
    }
}
