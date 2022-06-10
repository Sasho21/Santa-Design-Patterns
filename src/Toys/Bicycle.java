package Toys;

import SimpleVisitor.Visitor;

public class Bicycle extends Toy {

	private String accessory;
	
	public Bicycle() {
		super("синьо", "Гошко", "Иванов");
		this.accessory = "звънче";
	}
	
	public String getAccessory() {
		return this.accessory;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
