package inheritance2;

public class LogManager {
	public void log(int logType) {
		// spagetti kod bu alttaki 
		if (logType == 1) {
			System.out.println("Database loglandı");
		} else if (logType == 2) {
			System.out.println("Dosya Loglandı");
		} else {
			System.out.println("Email logland");
		}

	}

}

//1-Database
//2-File
//3-Email
