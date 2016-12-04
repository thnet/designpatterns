package fi.holti.jyu.designpatterns.observer;

public class OwlObserver implements Observer{

	public void doNotify() {
		System.out.println("I am observing owls!");
	}

}
