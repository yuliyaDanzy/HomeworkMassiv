package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long salesSum = 0;
        for (int i = 0; i < sales.length; i++) {
            salesSum = salesSum + sales[i];
        }
        return salesSum;
    }
    public long averageSum(long[] sales) {
        long averSum = 0;
        for (int i =0; i < sales.length; i++) {
            averSum = averSum + sales[i];

        }
        return averSum / sales.length;
    }

}

