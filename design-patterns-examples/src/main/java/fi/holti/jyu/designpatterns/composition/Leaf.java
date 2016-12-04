package fi.holti.jyu.designpatterns.composition;

public class Leaf implements Component {
	private String language;

	public Leaf(String language) {
		this.language = language;
	}

	public void greet() {
		System.out.println("Greeting from leaf node with language=" + language);
	}

}
