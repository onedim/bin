package predavanja26Novembar;
/**mjesanje karata uz pomoc stringa
 * izvlacenje random katre iz spila
 * @author nedimomerovic
 *
 */
public class SetKarata {

	public static void main(String[] args) {
		int []spil=noviSpil();
		System.out.println("Novi spil: "+nizString(spil));
		
		int brojPromjena=100;
		
		for (int i=0;i<brojPromjena;i++){
			zamjeniDvijeKarte(spil);
		}
	
	}
	public static void zamjeniDvijeKarte(int[]spil){
		int prva = randomKarta(spil);
		int druga= randomKarta(spil);
		System.out.println("random karta 1: " +prva);
		System.out.println("random karta 2: " +druga);
	}
	
	
	
	
	public static int[] noviSpil(){//ispisivanje svih karata u spilu
		int[] karte= new int[52];
				for (int i=0; i<karte.length; i++){
					karte[i]=i+1;
				}
		return karte; //ispisivanje jedne od karata
	}
	public static int randomKarta(int[]spil){//random funkcija za izvlacenje karte
		
		
		return (int)(Math.random()*52);	
	}
	
	
	
	public static String nizString(int[] niz){
		if niz.length==0;{
			return " ";
			else 
				
				
		}
	}
}
