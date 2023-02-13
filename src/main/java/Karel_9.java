import stanford.karel.SuperKarel;

public class Karel_9 extends SuperKarel {

	public void run() {
		solution();
	}

	private void solution() {
		move();
		move();
		while (beepersPresent()) {
			pickBeeper();
			turnAround();
			move();
			while (beepersPresent()) {
				pickBeeper();
				move();
				putBeeper();
				turnAround();
				move();
				turnAround();
			}
			move();
			turnAround();
			while (beepersPresent()) {
				pickBeeper();
				move();
				putBeeper();
				move();
				move();
				putBeeper();
				turnAround();
				move();
				move();
				move();
				turnAround();
			}
			move();
			move();
		}
	}
}
