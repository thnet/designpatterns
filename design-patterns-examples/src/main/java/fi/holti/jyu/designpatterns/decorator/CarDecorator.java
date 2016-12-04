package fi.holti.jyu.designpatterns.decorator;

public abstract class CarDecorator implements BaseCar {
	protected BaseCar baseCar;

	public CarDecorator(BaseCar baseCar) {
		this.baseCar = baseCar;
	}

	public void move() {
		baseCar.move();
	}
}
