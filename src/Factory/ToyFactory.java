package Factory;

import Enums.ToysEnum;
import Singleton.Santa;
import Toys.Bicycle;
import Toys.Doll;
import Toys.Toy;

public class ToyFactory {
	
	private ToysEnum toyType;
	
	public ToyFactory (ToysEnum toyType) {
		this.toyType = toyType;
	}
	
	public Toy instantiateToy() {
		
		switch (this.toyType) {
			case DOLL:
				return new Doll();
			case BICYCLE:
				return new Bicycle();
			default:
				System.out.println(Santa.getInstance().toyError);
				return null;
		}
	}
}
