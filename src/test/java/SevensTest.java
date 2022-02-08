import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevensTest {

    Sevens sevens = new Sevens();
    Hand[] sevensTableHands = sevens.createSevensTableHands();

    @Test
    void createSevensTableHands(){
        assertEquals(4 , sevensTableHands.length);
    }

    @Test
    void playToSevenHandCanPlaySevenToEmptyHand(){
    	Card sevenHearts = new Card("7H");
        assertEquals(true, sevens.playToSevenHand(sevenHearts, sevensTableHands[0],true));
    }

    @Test
    void playToSevenHandCanNotPlaySevenToHandWithCards(){
    	Card sevenHearts = new Card("7H");
    	Card testCard = new Card("2H");
    	sevensTableHands[0].add(testCard);
        assertEquals(false, sevens.playToSevenHand(sevenHearts, sevensTableHands[0],true));
    }

    @Test
    void playToSevenHandSevenToEmptyHand(){
    	Card sevenHearts = new Card("H7");
    	Hand tableHand = new Hand();
    	sevens.playToSevenHand(sevenHearts, tableHand,true);
    	assertEquals(sevenHearts, tableHand.findACard("H7"));
    }

    @Test
    void canPlayToSevenHandSixWithH7Hand(){
        fail("Not yet implemented"); //Remove
    }

    @Test
    void canNotPlayToSevenHandFiveWithH7Hand(){
        fail("Not yet implemented"); //Remove
    }

    @Test
    void playToSevenHandSixWithH7Hand(){
        fail("Not yet implemented"); //Remove
    }

    @Test
    void canPlayToSevenHandEightWithH7Hand(){
        fail("Not yet implemented"); //Remove
    }

    @Test
    void canNotPlayToSevenHandNineWithH7Hand(){
        fail("Not yet implemented"); //Remove
    }

    @Test
    void playToSevenHandEightWithH7Hand(){
        fail("Not yet implemented"); //Remove
    }

}