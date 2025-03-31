package NotifyMe.Observers;

import NotifyMe.Observable.StocksObservable;

public class MobileObserver implements Observer {
    private String number;
    private StocksObservable stocksObservable;

    public MobileObserver(String number, StocksObservable stocksObservable) {
        this.number = number;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        System.out.println("user wih=th number " + number + " product is in stock , hurry up !");
    }
    
}
