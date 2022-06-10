package SimpleVisitor;

import Toys.Bicycle;
import Toys.Doll;
import Toys.Toy;

public class ToStringVisitor extends Visitor {
	
	@Override
	public void visit(Doll toy) {
		mainText(toy, " кукла с " + toy.getHairColor() + " коса" );
	}
	
	@Override
	public void visit(Bicycle toy) {
		mainText(toy, " колело със " + toy.getAccessory());
	}
	
	private void mainText(Toy toy, String className) {
		String mainText = toy.getReceiverFirstName() + " " + toy.getReceiverLastName() + " ще получи " + toy.getColor() + "%s.";
		System.out.println(String.format(mainText, className));
	}
}
