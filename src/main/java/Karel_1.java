import stanford.karel.SuperKarel;

public class Karel_1 extends SuperKarel {

	public void run() {
		solution();
	}

	private void solution() {
		move();
		move();
		pickBeeper();
		move();
		putBeeper();
	}
}
