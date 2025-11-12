package DesignPatterns.Observer;

public interface Publisher {
    void notifyObservers();
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
}
