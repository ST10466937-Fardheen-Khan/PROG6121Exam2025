package com.mycompany.prog6112question1;

public class Main {

    public static void main(String[] args) {

        // Single-dimensional array containing quarter names.
        String[] quarters = {
            "Quarter 1", "Quarter 2", "Quarter 3"
        };

        // Two-dimensional array containing the product sales.
        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        // Create an object of the ProductSales class.
        ProductSales sales = new ProductSales();

        // Display the report heading.
        System.out.println("PRODUCT SALES REPORT");
        System.out.println("---------------------------------------------");

        // Display the column headings.
        System.out.printf("%-15s", "Year");

        for (String quarter : quarters) {
            System.out.printf("%-15s", quarter);
        }

        System.out.println();

        // Display each year's sales.
        for (int i = 0; i < productSales.length; i++) {

            System.out.printf("%-15s", "Year " + (i + 1));

            for (int sale : productSales[i]) {
                System.out.printf("%-15d", sale);
            }

            System.out.println();
        }

        System.out.println("---------------------------------------------");

        // Display the calculated sales information.
        System.out.println("Total Sales: "
                + sales.TotalSales(productSales));

        System.out.printf("Average Sales: %.2f%n",
                sales.AverageSales(productSales));

        System.out.println("Maximum Sale: "
                + sales.MaxSale(productSales));

        System.out.println("Minimum Sale: "
                + sales.MinSale(productSales));
    }
}
