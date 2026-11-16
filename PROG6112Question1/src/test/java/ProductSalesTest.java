
package com.mycompany.prog6112question1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductSalesTest {

    // Test that the total sales calculation is correct.
    @Test
    public void CalculateTotalSales_ReturnsTotalSales() {

        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        ProductSales sales = new ProductSales();

        assertEquals(2200, sales.TotalSales(productSales));
    }

    // Test that the average sales calculation is correct.
    @Test
    public void AverageSales_ReturnsAverageProductSales() {

        int[][] productSales = {
            {300, 150, 700},
            {250, 200, 600}
        };

        ProductSales sales = new ProductSales();

        assertEquals(
                366.6667,
                sales.AverageSales(productSales),
                0.001
        );
    }
}
