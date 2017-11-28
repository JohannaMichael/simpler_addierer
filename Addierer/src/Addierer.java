
public class Addierer {
	
	public int addiereVonBis(int von, int bis) { // die Parameter von und bis
		int i = 0; // die Summe
        for (int j = von; j <= bis; j++) {
            i = i + j; // addition
        }
        return i;
	}

		
}
