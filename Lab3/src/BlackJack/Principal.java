package BlackJack;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARATION
		Deck pioche = new Deck();
		
		//AFFICHAGE
		pioche.affiche();
		System.out.println(pioche.isComplete());
		System.out.println(pioche.isValid());
	}

}
