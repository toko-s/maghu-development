import stanford.karel.SuperKarel;

public class Karel_11 extends SuperKarel {
	public void run() {
		solution();
	}

	private void solution() {
		while (leftIsClear() || frontIsClear()) {
			while (frontIsClear()) {
				move();
			}
			turnLeft();
			while (frontIsClear() && rightIsBlocked()) move();
			if (rightIsBlocked()) {
				turnRight();
				return;
			}
			turnRight();
			move();
			turnRight();
			while (frontIsClear()) {
				move();
			}
			turnLeft();

		}
	}
}
