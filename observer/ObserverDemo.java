import stocks.*;

public class ObserverDemo {
    public static void main(String[] args) {
        StockData stockData = new StockData();
        new BrokerMonitorDisplay(stockData);

        stockData.setStockPrice("GOOG", 123.4F);
    }
}