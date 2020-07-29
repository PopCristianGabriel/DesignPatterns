package com.company;

public class Main {

    public static void main(String[] args) {
	Subject subject = new Subject();
    subject.set_field_1(1);
    subject.set_field_2(2);

	Observer observer1 = new Observer(subject);

	Observer observer2 = new Observer(subject);

	observer1.print_values();
	observer2.print_values();

	subject.set_field_2(100);

	//subject.notifyObservers();

	observer1.print_values();
	observer2.print_values();

	subject.unregisted(observer1);

	subject.set_field_1(300);

	observer1.print_values();
	observer2.print_values();





    }
}
