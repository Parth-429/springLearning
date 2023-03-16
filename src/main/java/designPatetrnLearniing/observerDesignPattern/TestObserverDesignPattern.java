package designPatetrnLearniing.observerDesignPattern;
import java.util.Observable;
import java.util.Timer;

public class TestObserverDesignPattern {

    public static void main(String[] args) {
        Observable observable = new Subject();
        MyObserver myObserver = new MyObserver();
        myObserver.subscribe(observable);
        ((Subject)observable).setCommentary("Hello Bro");
    }
}
