package Toys;

import SimpleVisitor.Visitor;

public class Doll extends Toy {
	
	private String hairColor;
	
	public Doll() {
		super("розова", "Мими", "Георгиева");
		this.hairColor = "руса";
	}
	
	public String getHairColor() {
		return this.hairColor;
	}

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
}
