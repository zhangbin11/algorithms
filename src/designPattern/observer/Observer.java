package designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Observer {

    public static void main(String[] args) {
        Something something = new Something();
        something.addListeners(new Listener1());
        something.addListeners(new Listener2());
        something.doSomething();
    }

}

class Something {

    List<Listener> listeners = new ArrayList<>();

    public void doSomething() {
        Event event = new Event("event");
        System.out.println("something happened");
        listeners.stream().forEach(it -> {
            it.doSomething(event);
        });
    }

    public void addListeners(Listener listener) {
        listeners.add(listener);
    }

}

class Event {
    String name;

    Event(String name) {
        this.name = name;
    }
}

interface Listener {
    public void doSomething(Event event);
}

class Listener1 implements Listener {

    @Override
    public void doSomething(Event event) {
        System.out.println("Listener1 do sth with on " + event.name + " happened");
    }
}

class Listener2 implements Listener {

    @Override
    public void doSomething(Event event) {
        System.out.println("Listener2 do sth with " + event.name + " happened");
    }
}