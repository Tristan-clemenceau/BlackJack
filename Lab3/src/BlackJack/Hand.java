package BlackJack;

public class Hand {
	
	public boolean contain(Card card) {
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

}
