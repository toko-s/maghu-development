import stanford.karel.SuperKarel;

public class Karel_4 extends SuperKarel {
	public void run() {
		solution();
	}

	private void solution() {
		putBeeper();
		while (frontIsClear()) {
			move();
			putBeeper();
		}
	}
}
