package designPatetrnLearniing.observerDesignPattern;

import java.util.Observable;

public class Subject extends Observable implements Commentary {
    @Override
    public void setCommentary(String desc) {
        notifyObservers(desc);
    }
}
