package Command;

import Enums.ToysEnum;
import Observer.MagicBoardObservable;

public class BicycleCommand implements Command {

	@Override
	public void writeOnBoard() {
		MagicBoardObservable magicBoard = new MagicBoardObservable(ToysEnum.BICYCLE);
		magicBoard.writeOnBoard();
	}

}
