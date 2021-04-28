package intro;

public class Main {
	public static void main(String[] args) {
		
	 //	Referans ve Değer Tipler
		
		/*
		 *Değer tipler direk ramda oluşur Referans tipler ise ramin new lenen kadar stack newlendikten 
		 *sonra heap kısmında oluşur.
		 * 
		 * */
		int[] dizi1 = new int[1];
		int[] dizi2 = new int[2];
		
		dizi1[0]=1;
		dizi2[0]=2;
		
		dizi2=dizi1;
		dizi2[0]=12;
		
		System.out.println(dizi2[0]);
	}

}
