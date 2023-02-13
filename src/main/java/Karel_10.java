import stanford.karel.SuperKarel;

public class Karel_10 extends SuperKarel {

	public void run() {
		solution();
	}

	private void solution() {
		move();
		while (beepersPresent()) {
			move();
			move();
			putBeeper();
			turnAround();
			move();
			while (beepersPresent()) {
				pickBeeper();
				move();
				pickBeeper();
				move();
				putBeeper();
				turnAround();
				move();
				move();
				turnAround();
			}
			move();
			move();
			while (beepersPresent()) {
				pickBeeper();
				turnAround();
				move();
				move();
				putBeeper();
				turnAround();
				move();
				move();
			}
			turnAround();
			move();
		}
	}
}
