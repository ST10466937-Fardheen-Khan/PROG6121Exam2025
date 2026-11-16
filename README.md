
# PROG6112 – Question 2: Product Sales Application

## Overview
This project is a Java GUI application developed for the PROG6112 Programming 1B examination. It processes product sales data for a local sound equipment retailer.

The application calculates total sales, average sales, sales over the limit and sales under the limit.

## Features
- Load Product Data.
- Save Product Data to a text file.
- Calculate total product sales.
- Calculate average product sales.
- Calculate sales over and under the sales limit of 500.
- Display the number of years processed.
- Clear the displayed report.
- File and Tools menu system.
- Unit testing using JUnit 5.

## Product Sales Data

| Product | Year 1 | Year 2 |
|---|---:|---:|
| Microphone | 300 | 250 |
| Speakers | 150 | 200 |
| Mixing Desk | 700 | 600 |

## Expected Results

| Description | Result |
|---|---:|
| Total Sales | 2200 |
| Average Sales | 367 |
| Sales Over Limit | 2 |
| Sales Under Limit | 4 |
| Years Processed | 2 |

## Technologies Used
- Java
- Apache NetBeans IDE
- Maven
- Java Swing
- JUnit 5

## How to Run
1. Clone or download this repository.
2. Open the project in Apache NetBeans.
3. Allow Maven to load the required dependencies.
4. Run the `Main.java` file.
5. Click **Load Product Data** to generate the sales report.
6. Click **Save Product Data** to save the report to `data.txt`.

## Unit Tests
The application includes two unit tests:
- `GetSalesOverLimit_ReturnsNumberOfSales`
- `GetSalesUnderLimit_ReturnsNumberOfSales`

## Author
Fardheen Khan

## Module
PROG6112 – Programming 1B
