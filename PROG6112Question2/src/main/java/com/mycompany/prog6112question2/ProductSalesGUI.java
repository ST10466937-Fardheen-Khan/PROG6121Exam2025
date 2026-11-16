package com.mycompany.prog6112question2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ProductSalesGUI extends JFrame {

    // Create the ProductSales object.
    private final ProductSales sales;

    // GUI components.
    private final JButton loadButton;
    private final JButton saveButton;
    private final JTextArea salesTextArea;
    private final JLabel yearsLabel;

    public ProductSalesGUI() {

        sales = new ProductSales();

        // Set up the application window.
        setTitle("Product Sales Application");
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the buttons.
        loadButton = new JButton("Load Product Data");
        saveButton = new JButton("Save Product Data");

        // Create the text area.
        salesTextArea = new JTextArea(8, 30);
        salesTextArea.setEditable(false);
        salesTextArea.setLineWrap(true);

        // Create the years processed label.
        yearsLabel = new JLabel("Years Processed: ");

        // Set up the button panel.
        JPanel buttonPanel = new JPanel(new GridLayout(2, 1, 5, 5));
        buttonPanel.add(loadButton);
        buttonPanel.add(saveButton);

        // Set up the text area panel.
        JScrollPane scrollPane = new JScrollPane(salesTextArea);
        scrollPane.setPreferredSize(new Dimension(350, 130));

        JPanel contentPanel = new JPanel(new BorderLayout(10, 10));
        contentPanel.setBorder(
                BorderFactory.createEmptyBorder(15, 15, 15, 15)
        );

        contentPanel.add(buttonPanel, BorderLayout.NORTH);
        contentPanel.add(scrollPane, BorderLayout.CENTER);
        contentPanel.add(yearsLabel, BorderLayout.SOUTH);

        add(contentPanel);

        // Create the menu system.
        createMenu();

        // Connect the buttons to their actions.
        loadButton.addActionListener(e -> loadProductData());
        saveButton.addActionListener(e -> saveProductData());
    }

    private void createMenu() {

        JMenuBar menuBar = new JMenuBar();

        // File menu.
        JMenu fileMenu = new JMenu("File");

        JMenuItem exitItem = new JMenuItem("Exit");

        exitItem.addActionListener(e -> System.exit(0));

        fileMenu.add(exitItem);

        // Tools menu.
        JMenu toolsMenu = new JMenu("Tools");

        JMenuItem loadItem = new JMenuItem("Load Product Data");
        JMenuItem saveItem = new JMenuItem("Save Product Data");
        JMenuItem clearItem = new JMenuItem("Clear");

        // Use the same methods as the buttons.
        loadItem.addActionListener(e -> loadProductData());
        saveItem.addActionListener(e -> saveProductData());
        clearItem.addActionListener(e -> clearData());

        toolsMenu.add(loadItem);
        toolsMenu.add(saveItem);
        toolsMenu.add(clearItem);

        menuBar.add(fileMenu);
        menuBar.add(toolsMenu);

        setJMenuBar(menuBar);
    }

    private void loadProductData() {

        // Calculate the report information.
        int total = sales.GetTotalSales();
        double average = sales.GetAverageSales();
        int overLimit = sales.GetSalesOverLimit();
        int underLimit = sales.GetSalesUnderLimit();

        // Display the report in the text area.
        String report =
                "Total Sales: " + total + "\n"
                + "Average Sales: " + Math.round(average) + "\n"
                + "Sales over limit: " + overLimit + "\n"
                + "Sales under limit: " + underLimit;

        salesTextArea.setText(report);

        // Display the number of years processed.
        yearsLabel.setText(
                "Years Processed: " + sales.GetProductsProcessed()
        );
    }

    private void saveProductData() {

        // Check that a report has been loaded.
        if (salesTextArea.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Please load the product data first."
            );

            return;
        }

        // Add the DATA LOG heading and separators.
        String fileContent =
                "DATA LOG\n"
                + "****************************************\n"
                + salesTextArea.getText() + "\n"
                + "****************************************";

        try {

            // Save the report to data.txt.
            Files.writeString(
                    Path.of("data.txt"),
                    fileContent
            );

            JOptionPane.showMessageDialog(
                    this,
                    "Product data saved successfully."
            );

        } catch (IOException e) {

            JOptionPane.showMessageDialog(
                    this,
                    "Error saving data: " + e.getMessage()
            );
        }
    }

    private void clearData() {

        // Clear the text area and years processed label.
        salesTextArea.setText("");
        yearsLabel.setText("");
    }
}