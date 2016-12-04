package fi.holti.jyu.designpatterns.observer;

public class ObserverMain {

	public static void main(String[] args) {
		ProviderImpl providerImpl = new ProviderImpl();
		
		Observer owlObserver = new OwlObserver();
	
		Observer crowObserver = new CrowObserver();
	
		Observer nightingaleObserver = new NightingaleObserver();
		
		providerImpl.register(crowObserver);
		providerImpl.register(owlObserver);
		providerImpl.register(nightingaleObserver);
		
		providerImpl.doNotify();
	}
}
