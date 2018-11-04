package stocks;

import java.util.*;

public class StockData implements Subject {
    private List<Observer> observers;
    private Map<String, Float> stockPrices;

    public StockData() {
        observers = new ArrayList<Observer>();
        stockPrices = new HashMap<String, Float>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers() {
        ListIterator<Observer> observerList = observers.listIterator();
        while(observerList.hasNext()) {
        	observerList.next().update(stockPrices);
        }
    }

    public void stockPricesUpdated() {
        notifyObservers();
    }

    public void setStockPrice(String stockName, float price) {
        stockPrices.put(stockName, price);
        stockPricesUpdated();
    }


}