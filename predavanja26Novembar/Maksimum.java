package predavanja26Novembar;

public class Maksimum {
	public static void main(String[] args) {
		int [] arr3=new int []{1,2,4};//inicijalizacija niza arr3 sa 1,2,4 vrijednostima
		arr3[1]=5;//broj 2 u nizu je 5
	System.out.println(getMax(arr3));
}
	public static int getMax(int []niz3){
		int a=niz3[0];//
		int b=niz3[1];
		int c=niz3[2];
		if (a>b && a>c){
			return a;
		}	
		else if (b>c){
			return b;
		}
			return c;
	}

}
