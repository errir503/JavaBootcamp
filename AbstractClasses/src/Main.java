
public class Main {

	public static void main(String[] args) {
		// abstract s�n�flar new lenemez 
		// final ise de�i�mez ve t�m alt s�n�flar onua ayn� �ekilde kullanabilir
		
	
		PlayerManager playerManager = new PlayerManager(new WomenCalculator());
		playerManager.player();
	}

}
