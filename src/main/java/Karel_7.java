import stanford.karel.Karel;

public class Karel_7 extends Karel {
	public void run() {
		solution();
	}

	private void solution() {
		if (noBeepersPresent()) {
			putBeeper();
		}
		while (true) {
			while (frontIsClear()) {
				move();
				if (noBeepersPresent()) {
					putBeeper();
				}
			}
			turnLeft();
			if (frontIsBlocked()) break;
			move();
			turnLeft();
			if (noBeepersPresent()) {
				putBeeper();
			}
			while (frontIsClear()) {
				move();
				if (noBeepersPresent()) {
					putBeeper();
				}
			}
			turnLeft();
			turnLeft();
			turnLeft();
			if (frontIsBlocked()) break;
			move();
			if (noBeepersPresent()) {
				putBeeper();
			}
			turnLeft();
			turnLeft();
			turnLeft();
		}
	} //Bad solution
}
