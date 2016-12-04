package fi.holti.jyu.designpatterns.decorator;

public class StylingKitDecorator extends CarDecorator {

	public StylingKitDecorator(BaseCar baseCar) {
		super(baseCar);
	}

	@Override
	public void move() {
		baseCar.move();
		System.out.println("Tuning car with styling kit");
	}

}
