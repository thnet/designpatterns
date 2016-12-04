package fi.holti.jyu.designpatterns.observer;

public interface Provider {

	void register(Observer observer);
	
	void unregister(Observer observer);
}
