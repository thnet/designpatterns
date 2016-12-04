package fi.holti.jyu.designpatterns.observer;

public class NightingaleObserver implements Observer{

	public void doNotify() {
		System.out.println("I am observing nightingales!");
	}

}
