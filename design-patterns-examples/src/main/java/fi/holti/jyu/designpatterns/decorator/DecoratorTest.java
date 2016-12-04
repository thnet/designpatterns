package fi.holti.jyu.designpatterns.decorator;

public class DecoratorTest {

	public static void main(String[] args) {

		BaseCar baseCar = new CarModel();

		BaseCar styledCarModel = new StylingKitDecorator(baseCar);

		BaseCar styledCarMake = new StylingKitDecorator(new CarMake());

		styledCarModel.move();
		styledCarMake.move();
	}
}
