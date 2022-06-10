package Singleton;

import Toys.Toy;

import java.util.Random;

import Command.Command;
import Enums.ToysEnum;
import Factory.CommandFactory;

public class Santa {

	private static Santa santa = null;
	private Toy orderedToy;
	public final String toyError = "От днес произвеждаме само кукли и колела!";
	
	private Santa () {
	}
	
	public static Santa getInstance() {
		if (santa == null) {
			return santa = new Santa();
		}
		
		return santa;
	}
	
	public void giveCommand() {
		ToysEnum toyToMake;
		Random random = new Random();
		
		if (random.nextBoolean()) {
			toyToMake = ToysEnum.DOLL;
		} else {
			toyToMake = ToysEnum.BICYCLE;
		}
		
		CommandFactory commandFactory = new CommandFactory(toyToMake);
		Command command = commandFactory.instantiateCommand();
		
		if (command != null) {
			command.writeOnBoard();
		} else {
			System.out.println(this.toyError);
		}
		
	}
	
	public void setOrderedToy(Toy toy) {
		this.orderedToy = toy;
	}
	
	public Toy getOrderedToy() {
		return this.orderedToy;
	}
}
