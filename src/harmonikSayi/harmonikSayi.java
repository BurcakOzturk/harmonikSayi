package harmonikSayi;

import java.util.Scanner;

public class harmonikSayi {

	public static void main(String[] args) {
		
		int sayi;
		double i,sonuc=0;
		
	    Scanner input = new Scanner(System.in);
	    
	    System.out.print("Harmonik serisini bulmak istediğiniz sayıyı giriniz : ");
	    sayi = input.nextInt();
	    
	    for (i=1 ; i<=sayi ; i++) {
	    	
	    	sonuc=sonuc+(1/i);  	
	    	
	    }
	    
	    System.out.println(sonuc);
	    

	}

}
