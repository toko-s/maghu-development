import stanford.karel.SuperKarel;

public class Karel_8 extends SuperKarel {

	public void run() {
		solution();
	}

	private void solution() {
		move();
		while (true) {
			pickBeeper();
			move();
			if (noBeepersPresent()) break;
			pickBeeper();
			turnAround();
			move();
			turnAround();
		}
		move();
		putBeeper();
		turnAround();
		move();
		move();
		turnAround();
		while (beepersPresent()) {
			pickBeeper();
			move();
			move();
			putBeeper();
			turnAround();
			move();
			move();
			turnAround();
		}
	}
}
