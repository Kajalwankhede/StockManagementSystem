package com.stockmanagementsystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StockManagementPortfolio {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("********** Welcome To Stock Management System **********");
        addStockData();
        printStockReport();
    }

    public static List<StockManagement> list = new ArrayList<>();

    public static void addStockData() {
        System.out.println("Enter how many stocks you want: ");
        int stockCount = sc.nextInt();
        for (int i = 1; i <= stockCount; i++) {
            System.out.println("Enter the stock name: ");
            String stockName = sc.next();
            System.out.println("Enter the Share name: ");
            String shareName = sc.next();
            System.out.println("Enter the number of shares: ");
            int numOfShares = sc.nextInt();
            System.out.println("Enter price of the each share: ");
            int sharePrice = sc.nextInt();
            int totalValueEachStock = numOfShares * sharePrice;
            System.out.println("Total value of each Stock: " + totalValueEachStock);
            StockManagement stock = new StockManagement(stockName, shareName, numOfShares, sharePrice, totalValueEachStock);
            list.add(stock);
        }
    }

    public static void printStockReport() {
        if (!list.isEmpty()) {
            System.out.println("\n   Stock Details:");
            Iterator i = list.iterator();
            while (i.hasNext()) {
                System.out.println(i.next());
            }
        } else
            System.out.println("list is empty.");
    }
}
