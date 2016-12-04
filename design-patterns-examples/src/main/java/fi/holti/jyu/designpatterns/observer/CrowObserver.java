package fi.holti.jyu.designpatterns.observer;

public class CrowObserver implements Observer{

	public void doNotify() {
		System.out.println("I am observing crows!");
	}

}
