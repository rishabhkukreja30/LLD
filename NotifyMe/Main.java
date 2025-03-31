package NotifyMe;

import NotifyMe.Observable.IphoneObservable;
import NotifyMe.Observable.StocksObservable;
import NotifyMe.Observers.EmailObserver;
import NotifyMe.Observers.Observer;

public class Main {
    
    public static void main(String[] args) {
        StocksObservable stocksObservable = new IphoneObservable();

        Observer customer1 = new EmailObserver("123@gmail.com", stocksObservable);
        Observer customer2 = new EmailObserver("456@gmail.com", stocksObservable);

        stocksObservable.add(customer1);
        stocksObservable.add(customer2);

        stocksObservable.setStockCount(10);


    }
}
