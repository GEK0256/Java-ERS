package ha.javaers;

import java.util.ArrayList;

public class Hand {
	private ArrayList<Card> cards;
	private int numCards;
	
	Hand(Deck d, int p){
		numCards = 52/p;
		cards = new ArrayList<Card>();
		for(int i = 0; i < numCards; i++){
			cards.add(d.draw());
		}
	}
	
	public Card drawCard(){
		Card ret = cards.get(0);
		cards.remove(0);
		return ret;
	}
	
	public void displayAll(){
		for(int i = 0; i < numCards; i++){
			System.out.println(cards.get(i));
		}
	}
	
	
}
