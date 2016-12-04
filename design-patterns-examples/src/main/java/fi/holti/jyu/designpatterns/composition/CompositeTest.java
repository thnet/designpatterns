package fi.holti.jyu.designpatterns.composition;

public class CompositeTest {

	public static void main(String[] args) {
		Component component = new Leaf("Finnish");
		Component component2 = new Leaf("Swedish");

		Composite composite = new Composite("General language");
		composite.add(component);
		composite.add(component2);

		composite.greet();
	}
}
