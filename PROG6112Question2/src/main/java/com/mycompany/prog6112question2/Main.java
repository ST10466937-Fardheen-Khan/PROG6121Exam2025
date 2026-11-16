package com.mycompany.prog6112question2;

import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {

        // Launch the Product Sales GUI.
        SwingUtilities.invokeLater(() -> {
            ProductSalesGUI gui = new ProductSalesGUI();
            gui.setVisible(true);
        });
    }
}
