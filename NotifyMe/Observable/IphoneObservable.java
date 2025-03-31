package NotifyMe.Observable;

import java.util.ArrayList;
import java.util.List;

import NotifyMe.Observers.Observer;

public class IphoneObservable implements StocksObservable {
    private List<Observer> observers = new ArrayList<>();
    private int stockCount = 0;

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int s) {
        stockCount += s;
        if(stockCount != 0) {
            notifySubscribers();
        }
        else {
            System.out.println("product is currently out of stock");
        }
        
    }

    @Override
    public int getStcokCount() {
        return stockCount;
    }
    
}
