package fi.holti.jyu.designpatterns.composition;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	private List<Component> components = new ArrayList<Component>();
	private String greetingLanguage;

	public Composite(String greetingLanguage) {
		this.greetingLanguage = greetingLanguage;
	}

	public void add(Component component) {
		components.add(component);
	}

	public void remove(Component component) {
		components.remove(component);
	}

	public void greet() {
		System.out.println("Greeting from composite with language=" + greetingLanguage);

		for (Component component : components) {
			component.greet();
		}
	}

}
