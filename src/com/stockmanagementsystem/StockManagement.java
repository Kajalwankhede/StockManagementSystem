package com.stockmanagementsystem;

public class StockManagement {
    private String stockName, shareName;
    private int numOfShares, sharePrice, totalValueEachStock;
    public StockManagement(String stockName, String shareName,int numOfShares, int sharePrice,int totalValueEachStock)
    {
        this.stockName=stockName;
        this.shareName=shareName;
        this.numOfShares=numOfShares;
        this.sharePrice=sharePrice;
        this.totalValueEachStock=sharePrice*numOfShares;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }
    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }
    public int getNumOfShares() {
        return numOfShares;
    }

    public void setNumOfShares(int numOfShares) {
        this.numOfShares = numOfShares;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getTotalValueEachStock() {
        return totalValueEachStock;
    }

    public void setTotalValueEachStock(int totalValueEachStock) {
        this.totalValueEachStock = sharePrice*numOfShares;
    }

    @Override
    public String toString() {
        return "StockManagement { " +
                "stockName : '" + stockName  +
                ", numOfShares : " + numOfShares +
                ", shareName : " + shareName +
                ", sharePrice : " + sharePrice +
                ", totalValueEachStock : " + totalValueEachStock +
                '}';
    }
}
