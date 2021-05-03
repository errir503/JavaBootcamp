
public class PlayerManager {
	private GameCalculator gameCalculator;
	
	public PlayerManager(GameCalculator gameCalculator) {
		this.gameCalculator = gameCalculator;
	}

	public void player() {
		gameCalculator.calculate();
	}
}
