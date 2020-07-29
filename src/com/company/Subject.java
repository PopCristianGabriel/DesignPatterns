package com.company;

import java.util.ArrayList;

public class Subject implements ISubject{
    ArrayList<IObserver> observers;

    int field1;
    int field2;

    Subject(){
        this.observers = new ArrayList<>();
    }




    @Override
    public void register(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void unregisted(IObserver observer) {
        int index = this.observers.indexOf(observer);

        this.observers.remove(index);
    }

    @Override
    public void notifyObservers() {
        for(IObserver observer : this.observers){
            observer.update(this.field1,this.field2);
        }
    }

    public int get_field_1(){
        return this.field1;
    }
    public int get_field_2(){
        return this.field2;
    }

    public void set_field_1(int field1){
        this.field1 = field1;
        this.notifyObservers();
    }

    public void set_field_2(int field2){
        this.field2 = field2;
        this.notifyObservers();
    }
}
