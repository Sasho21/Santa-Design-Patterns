package Factory;

import Command.BicycleCommand;
import Command.Command;
import Command.DollCommand;
import Enums.ToysEnum;
import Singleton.Santa;

public class CommandFactory {
	
private ToysEnum commandType;
	
	public CommandFactory (ToysEnum commandType) {
		this.commandType = commandType;
	}
	
	public Command instantiateCommand() {
		
		switch (this.commandType) {
			case DOLL:
				return new DollCommand();
			case BICYCLE:
				return new BicycleCommand();
			default:
				System.out.println(Santa.getInstance().toyError);
				return null;
		}
		
	}
}
