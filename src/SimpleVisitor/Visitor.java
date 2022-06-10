package SimpleVisitor;

import Toys.Bicycle;
import Toys.Doll;
import Toys.Toy;

public abstract class Visitor {
	public abstract void visit (Doll toy);
	public abstract void visit (Bicycle toy);
}
