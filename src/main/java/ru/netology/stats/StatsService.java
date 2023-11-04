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
        for (int i = 0; i < sales.length; i++) {
            averSum = averSum + sales[i];

        }
        return averSum / sales.length;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[maxMonth] <= sales[i]) { // значит, в рассматриваемом i-м месяце продаж больше
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

    public int averageSumDown(long[] sales) {
        int averSumDown = 0;
        long averSum = averageSum(sales);
        for (long sale : sales) {
            if (sale < averSum) {
                averSumDown++;
            }
          }
        return averSumDown;
    }

    public int averageSumUp(long[] sales) {
        int averSumUp = 0;
        long averSum = averageSum(sales);
        for (long sale : sales) {
            if (sale > averSum) {
                averSumUp++;
            }
        }
        return averSumUp;
    }
}