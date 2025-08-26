package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
StatsService service = new StatsService();
service.summarySales(sales);
service.average(sales);
service.maxSalesMonth(sales);
service.minSalesMonth(sales);
service.lowerAverageSales(sales);
service.upperAverageSales(sales);
    }
}
