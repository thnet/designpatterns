package fi.holti.jyu.designpatterns.templatemethod;

public abstract class CarDrivingTemplate {

	public void driveCar() {
		stepInToCar();
		startCar();
		putGearOn();
		pushSpeedPedal();
	}

	public abstract void stepInToCar();

	public abstract void startCar();

	public abstract void putGearOn();

	public abstract void pushSpeedPedal();
}
