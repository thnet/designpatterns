package fi.holti.jyu.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ProviderImpl implements Provider{
	private List<Observer> observers= new ArrayList<Observer>();
	
	public void register(Observer observer) {
		observers.add(observer);
	}

	public void unregister(Observer observer) {
		observers.remove(observer);
	}
	
	public void doNotify(){
		for(Observer observer : observers){
			observer.doNotify();
		}
	}

}
