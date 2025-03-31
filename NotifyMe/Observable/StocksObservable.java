
package NotifyMe.Observable;

import NotifyMe.Observers.Observer;

public interface StocksObservable {

    void add(Observer observer);
    void remove(Observer observer);
    void notifySubscribers();
    void setStockCount(int s);
    int getStcokCount();

    
}