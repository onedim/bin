package predavanja26Novembar;
/**for petlja
 * int[] brojevi=new int[1000];
 * for (int idx=0; idx<brojevi.length; idx++){
 * ----idx->0.length-1
 * brojevi [idx]=idx+1;
 * }
 * @author nedimomerovic
 *
 */
public class Maksimum2 {
	public static void main(String[] args) {
		int [] arr3=new int []{1,2,4};//inicijalizacija niza arr3 sa 1,2,4 vrijednostima
		arr3[1]=5;//broj 2 u nizu je 5
		int []arr=new int[]{1,2,4,54,43};
	
		System.out.println(nizUString(arr));//ispis arr niza
	System.out.println(getMax(arr3));
	}
	
	public static void print(int[]arr){
		for (int tmp=0; tmp<arr.length; tmp++)
			
					System.out.println(tmp);
		
	}
	public static int getMax(int []brojevi){//ne zaboravi da int[]brojevi mora biti isti naziv u petlji
		int max =brojevi[0];
		for(int idx=0; idx<brojevi.length; idx++){//brojevi.length broj clanova niza
			int trenutni=brojevi[idx];
			if (trenutni >max){
				max=trenutni;
			}
		}

			return max;
	}
		public static String nizUString(int[] niz){ //funkcija za ispis arrr niza
			if (niz.length == 0){
				return"";
			}
			
			String strNiz="";
			for (int idx=0;idx<niz.length; idx++){
				strNiz=strNiz+niz[idx]+", ";//za svaki clan niza dodaj sljedeci u redu i iza zarez
			}
			return strNiz;//vrati pojedinacno svaki clan u nizu+zarez
		}
		

}
