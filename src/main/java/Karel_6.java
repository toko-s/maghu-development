import stanford.karel.SuperKarel;

public class Karel_6 extends SuperKarel {
	public void run() {
		solution();
	}

	private void solution() {
		move();
		while (beepersPresent()) {
			pickBeeper();
		}
		move();
		while (beepersPresent()) {
			pickBeeper();
		}
		move();
		while (beepersInBag()) {
			putBeeper();
		}
	}
}
