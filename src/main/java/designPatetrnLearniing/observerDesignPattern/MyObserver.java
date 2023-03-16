package designPatetrnLearniing.observerDesignPattern;

import javax.security.auth.Subject;
import java.util.Objects;
import java.util.Observable;
import java.util.Observer;

public class MyObserver implements Observer {
    private Observable observable;
    public void subscribe(Observable observable){
        this.observable = observable;
        this.observable.addObserver(this);
    }

    public void unSubscribe(){
        this.observable.deleteObserver(this);
        this.observable = null;
    }

    @Override
    public void update(Observable observable, Object desc) {
        if(!Objects.isNull(desc))
            display((String) desc);
    }

    public void display(String desc){
        System.out.println(desc);
    }
}
