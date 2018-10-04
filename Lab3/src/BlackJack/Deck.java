package BlackJack;

import java.util.*;

public class Deck {
	private final int NBCARD = 52;
	private ArrayList<Card> deck = new ArrayList<Card>();

	public Deck() {
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 4; j++) {
				deck.add(new Card(i, j));
			}
		}
	}
	
	private boolean contain(Card card) {
		String correctVal[]= {"King","Queen","10","9","8","7","6","5","4","3","2","Jack","Aces"};
		String correctColor[]= {"Diamonds","Clubs","Heart","Spades"};
		
		boolean okVal = false, okCol = false;
		
		for (int i = 0;i <correctVal.length;i++) {
			if (card.getValue().toString() == correctVal[i]) {
				okVal = true;
			}
		}
		
		for(int i = 0;i<correctColor.length;i++) {
			if (card.getColor() == correctColor[i]) {
				okCol = true;
			}
		}
		return okVal && okCol;
	}

	public boolean isValid() {
		boolean ok = true;
		int i = 0,w = 0;
		
		
		while (ok && w <deck.size()) {
			ok = contain(deck.get(w));
			w++;
		}

		while (ok && i < deck.size()) {
			for (int u = 0; u < deck.size(); u++) {
				if (u != i && ok) {
					ok = !(deck.get(i).equals(deck.get(u)));
				}
			}
			i++;
		}
		return ok;
	}

	public boolean isComplete() {
		boolean ok = false;
		if (deck.size() == 52) {
			return ok = true;
		} else {
			return ok;
		}

	}

	public void affiche() {
		System.out.println(deck.toString());
	}

}
