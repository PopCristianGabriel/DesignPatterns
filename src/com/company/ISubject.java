package com.company;

public interface ISubject {

    public void register(IObserver observer);

    public void unregisted(IObserver observer);

    public void notifyObservers();

}
