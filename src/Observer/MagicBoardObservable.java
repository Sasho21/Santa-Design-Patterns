package Observer;

import Enums.ToysEnum;

public class MagicBoardObservable extends Observable {
	
	private String boardText;
	private ToysEnum toyType;
	
	public MagicBoardObservable(ToysEnum toyType) {
		this.attachOrder(new DwarfObserver());
		this.toyType = toyType;
	}
	
	public void writeOnBoard() {
		setBoardText(toyType.name());
		
		this.notifyObservers();
	}
	
	private void setBoardText(String boardText) {
		this.boardText = boardText;
	}
	
	public ToysEnum getToyType() {
		return toyType;
	}
	
}
