package NotifyMe.Observers;

import NotifyMe.Observable.StocksObservable;

public class EmailObserver implements Observer {
    private String emailId;
    private StocksObservable stocksObservable;

    public EmailObserver(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        System.out.println("user with email: " + emailId + " product is in stock , hurry up !");
    }
    
}
