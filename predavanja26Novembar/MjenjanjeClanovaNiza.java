package predavanja26Novembar;

public class MjenjanjeClanovaNiza {
	

	public static void Zamjeni(int[]niz, int idx1,int idx2) {
		// TODO provjeri indexe
		// FIXME ovo je opasno
		int temp=niz[idx1];
		niz[idx1]=niz[idx2];
		niz[temp]=niz[idx2];

	}

}
