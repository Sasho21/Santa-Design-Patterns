package Toys;

import SimpleVisitor.ToStringVisitor;
import SimpleVisitor.Visitor;

public abstract class Toy {
	
	private String color;
	private String receiverFirstName;
	private String receiverLastName;
	
	public Toy(String color, String receiverFirstName, String receiverLastName) {
		this.color = color;
		this.receiverFirstName = receiverFirstName;
		this.receiverLastName = receiverLastName;
	}
	
	public abstract void accept(Visitor visitor);
	
	public String getColor() {
		return this.color;
	}
	
	public String getReceiverFirstName() {
		return this.receiverFirstName;
	}
	
	public String getReceiverLastName() {
		return this.receiverLastName;
	}
}
