package Observer;
import java.util.ArrayList;

public abstract class Observable {
	
	public ArrayList<Observer> observer = new ArrayList<Observer>();
	
	public void detachOrder(Observer observer) {
		this.observer.remove(observer);
	};
	
	public void attachOrder(Observer observer) {
		this.observer.add(observer);
	};
	
	public void notifyObservers() {
		for (Observer observer : this.observer) 
		{ 
			observer.work(this);
		}
	};
}
