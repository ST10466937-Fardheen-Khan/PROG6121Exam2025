package com.mycompany.prog6112question2;

public class ProductSales implements IProductSales {

    // Sales limit specified in the examination.
    private static final int SALES_LIMIT = 500;

    // Product sales data stored in a two-dimensional array.
    private final int[][] productSales = {
        {300, 150, 700},
        {250, 200, 600}
    };

    @Override
    public int[][] GetProductSales() {

        // Return a copy of the sales data.
        int[][] copy = new int[productSales.length][];

        for (int i = 0; i < productSales.length; i++) {
            copy[i] = productSales[i].clone();
        }

        return copy;
    }

    @Override
    public int GetTotalSales() {

        int total = 0;

        // Calculate the total of all product sales.
        for (int[] year : productSales) {
            for (int sale : year) {
                total += sale;
            }
        }

        return total;
    }

    @Override
    public int GetSalesOverLimit() {

        int count = 0;

        // Count sales greater than the sales limit.
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale > SALES_LIMIT) {
                    count++;
                }
            }
        }

        return count;
    }

    @Override
    public int GetSalesUnderLimit() {

        int count = 0;

        // Count sales below the sales limit.
        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale < SALES_LIMIT) {
                    count++;
                }
            }
        }

        return count;
    }

    @Override
    public int GetProductsProcessed() {

        // Each row represents one year.
        return productSales.length;
    }

    @Override
    public double GetAverageSales() {

        int total = GetTotalSales();
        int count = 0;

        // Count all individual product sales.
        for (int[] year : productSales) {
            count += year.length;
        }

        return (double) total / count;
    }
}
