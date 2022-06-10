package Command;

import Enums.ToysEnum;
import Observer.MagicBoardObservable;

public class DollCommand implements Command {

	@Override
	public void writeOnBoard() {
		MagicBoardObservable magicBoard = new MagicBoardObservable(ToysEnum.DOLL);
		magicBoard.writeOnBoard();
	}

}
