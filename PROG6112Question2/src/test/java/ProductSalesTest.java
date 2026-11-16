
package com.mycompany.prog6112question2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductSalesTest {

    // Test the number of sales above the sales limit.
    @Test
    public void GetSalesOverLimit_ReturnsNumberOfSales() {

        ProductSales sales = new ProductSales();

        assertEquals(2, sales.GetSalesOverLimit());
    }

    // Test the number of sales below the sales limit.
    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {

        ProductSales sales = new ProductSales();

        assertEquals(4, sales.GetSalesUnderLimit());
    }
}
