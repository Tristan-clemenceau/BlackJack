package BlackJack;

public class Card {
	private String value;
	private String color;
	private String[] tabColor ={"Spades","Heart","Clubs","Diamonds"};
	private String[] tabValue ={"Aces","Jack","Queen","King","2","3","4","5","6","7","8","9","10"};
	
	public Card(int value,int color) {
		this.color = tabColor[color];
		switch(value) {
		case 0 :
			this.value = tabValue[0];
			break;
		case 1:
			this.value = tabValue[1];
			break;
		case 2:
			this.value = tabValue[4];
			break;
		case 3:
			this.value = tabValue[5];
			break;
		case 4:
			this.value = tabValue[6];
			break;
		case 5:
			this.value = tabValue[7];
			break;
		case 6:
			this.value = tabValue[8];
			break;
		case 7:
			this.value = tabValue[9];
			break;
		case 8:
			this.value = tabValue[10];
			break;
		case 9:
			this.value = tabValue[11];
			break;
		case 10:
			this.value = tabValue[12];
			break;
		case 11:
			this.value = tabValue[2];
			break;
		case 12:
			this.value = tabValue[3];
			break;
		default :
			this.value = String.valueOf(value);
		}
	}
	
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (value != other.value)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Card [value=" + value + ", color=" + color +"]\n";
	}
}
