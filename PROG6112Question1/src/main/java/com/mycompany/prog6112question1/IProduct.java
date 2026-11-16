package com.mycompany.prog6112question1;

public interface IProduct {

    // Calculates the total product sales.
    int TotalSales(int[][] productSales);

    // Calculates the average product sales.
    double AverageSales(int[][] productSales);

    // Finds the highest individual sale.
    int MaxSale(int[][] productSales);

    // Finds the lowest individual sale.
    int MinSale(int[][] productSales);
}
