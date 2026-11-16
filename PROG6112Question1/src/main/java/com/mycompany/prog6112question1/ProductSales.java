package com.mycompany.prog6112question1;

public class ProductSales implements IProduct {

    @Override
    public int TotalSales(int[][] productSales) {

        int total = 0;

        // Add all sales from every year and quarter.
        for (int[] year : productSales) {
            for (int sale : year) {
                total += sale;
            }
        }

        return total;
    }

    @Override
    public double AverageSales(int[][] productSales) {

        int total = TotalSales(productSales);
        int numberOfSales = 0;

        // Count the individual sales values.
        for (int[] year : productSales) {
            numberOfSales += year.length;
        }

        return (double) total / numberOfSales;
    }

    @Override
    public int MaxSale(int[][] productSales) {

        int maximum = productSales[0][0];

        // Find the highest sale.
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale > maximum) {
                    maximum = sale;
                }
            }
        }

        return maximum;
    }

    @Override
    public int MinSale(int[][] productSales) {

        int minimum = productSales[0][0];

        // Find the lowest sale.
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale < minimum) {
                    minimum = sale;
                }
            }
        }

        return minimum;
    }
}
