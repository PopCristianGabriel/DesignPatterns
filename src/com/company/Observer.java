package com.company;

public class Observer implements IObserver{
    private static int idTracker;
    private int myId;

    private Subject myBoss;

    int field1;
    int field2;


    Observer(Subject myBoss){
        this.myBoss = myBoss;

        this.myId = this.idTracker++;

        this.myBoss.register(this);

        this.field2 = this.myBoss.get_field_2();
        this.field1 =  this.myBoss.get_field_1();
    }

    @Override
    public void update(int field1, int field2) {
        this.field1 = field1;
        this.field2 = field2;
    }


    public void print_values(){
        System.out.println(this.myId + " " + this.field1 + " " + this.field2);
    }
}
