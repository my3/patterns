package stocks;

import java.util.*;

public class BrokerMonitorDisplay implements Observer, DisplayElement {
    private Map<String, Float> stockPrices;
    private Subject stockData;

    public BrokerMonitorDisplay(Subject stockData) {
        this.stockData = stockData;
        stockData.registerObserver(this);
    }

    public void update(Map<String, Float> stockPrices) {
        this.stockPrices = stockPrices;
        display();
    }

    public void display() {
        System.out.println("Request for display from update: ");
        System.out.println(stockPrices);
    }
}