
public class Main {

	public static void main(String[] args) {
		// abstract sýnýflar new lenemez 
		// final ise deðiþmez ve tüm alt sýnýflar onua ayný þekilde kullanabilir
		
	
		PlayerManager playerManager = new PlayerManager(new WomenCalculator());
		playerManager.player();
	}

}
