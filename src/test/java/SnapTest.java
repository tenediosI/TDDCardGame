import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnapTest {

    Snap snap = new Snap();

    @Test
    void isSnapWithSuit() {
    	Card test1 = new Card("D3");
    	Card test2 = new Card("D4");
    	assertEquals(true, snap.isSnap(test1,test2, true));

    }

    @Test
    void isNotSnapWithRankAndSnapSuitOn() {

    }


    @Test
    void isSnapRank() {

    }

    @Test
    void isNotSnapWithSuitAndSnapSuitOff() {

    }
}