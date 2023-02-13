import stanford.karel.SuperKarel;

public class Karel_3 extends SuperKarel {

	public void run() {
		solution();
	}

	private void solution() {
		while (frontIsClear()) {
			move();
		}
	}
}
