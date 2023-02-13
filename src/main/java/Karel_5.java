import stanford.karel.SuperKarel;

public class Karel_5 extends SuperKarel {

	public void run() {
		solution();
	}

	private void solution() {
		if (noBeepersPresent()) {
			putBeeper();
		}
		while (frontIsClear()) {
			move();
			if (noBeepersPresent()) {
				putBeeper();
			}
		}
	}
}
