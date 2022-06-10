package Observer;

import Factory.ToyFactory;
import SimpleVisitor.ToStringVisitor;
import Singleton.Santa;
import Toys.Toy;

public class DwarfObserver extends Observer {

	@Override
	public void work(Observable observable) {
		if (observable instanceof MagicBoardObservable) {
			MagicBoardObservable magicBoard = (MagicBoardObservable) observable;
			ToyFactory toyFactory = new ToyFactory(magicBoard.getToyType());
			
			Toy toy = toyFactory.instantiateToy();
			
			if (toy instanceof Toy) {
				toy.accept(new ToStringVisitor());
				Santa.getInstance().setOrderedToy(toy);
			}
		} else {
			System.out.println("Джуджетата наблюдават само магическата дъска.");
		}
	}

}
