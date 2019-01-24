import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TennisMatchTest {

    @Test
    public void testPlayer1WinGame() {
        Player player1 = new Player("Jean");
        Player player2 = new Player("Philips");
        TennisMatch match = new TennisMatch(player1, player2, MatchType.BEST_OF_THREE, true);
        assertEquals(match.pointForPlayer(player1), "0");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "15");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "30");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "40");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "W");
    }

    @Test
    public void testPlayer2WinGame() {
        Player player1 = new Player("Jean");
        Player player2 = new Player("Philips");
        TennisMatch match = new TennisMatch(player1, player2, MatchType.BEST_OF_THREE, true);
        assertEquals(match.pointForPlayer(player2), "0");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player2), "15");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player2), "30");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player2), "40");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player2), "W");
    }


    @Test
    public void testMatchGame(){
        Player player1 = new Player("Jean");
        Player player2 = new Player("Philips");
        TennisMatch match = new TennisMatch(player1, player2, MatchType.BEST_OF_THREE, true);
        assertEquals(match.pointForPlayer(player1), "0");
        assertEquals(match.pointForPlayer(player2), "0");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "15");
        assertEquals(match.pointForPlayer(player2), "0");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "30");
        assertEquals(match.pointForPlayer(player2), "0");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "30");
        assertEquals(match.pointForPlayer(player2), "15");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "40");
        assertEquals(match.pointForPlayer(player2), "15");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "W");
        assertEquals(match.pointForPlayer(player2), "15");
        assertEquals(player1.getGame(), 1);
        assertEquals(player2.getGame(), 0);

    }

    @Test
    public void testMatchEqualsAndWin(){
        Player player1 = new Player("Jean");
        Player player2 = new Player("Philips");
        TennisMatch match = new TennisMatch(player1, player2, MatchType.BEST_OF_THREE, true);
        assertEquals(match.pointForPlayer(player1), "0");
        assertEquals(match.pointForPlayer(player2), "0");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "0");
        assertEquals(match.pointForPlayer(player2), "15");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "15");
        assertEquals(match.pointForPlayer(player2), "15");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "30");
        assertEquals(match.pointForPlayer(player2), "15");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "40");
        assertEquals(match.pointForPlayer(player2), "15");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "40");
        assertEquals(match.pointForPlayer(player2), "30");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "40");
        assertEquals(match.pointForPlayer(player2), "40");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "40A");
        assertEquals(match.pointForPlayer(player2), "40");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "40");
        assertEquals(match.pointForPlayer(player2), "40");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "40");
        assertEquals(match.pointForPlayer(player2), "40A");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "40");
        assertEquals(match.pointForPlayer(player2), "W");
        assertEquals(player1.getGame(), 0);
        assertEquals(player2.getGame(), 1);

    }

    @Test
    public void testMatchFourGames(){
        Player player1 = new Player("Jean");
        Player player2 = new Player("Philips");
        TennisMatch match = new TennisMatch(player1, player2, MatchType.BEST_OF_THREE, true);


        assertEquals(match.pointForPlayer(player1), "0");
        assertEquals(match.pointForPlayer(player2), "0");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "15");
        assertEquals(match.pointForPlayer(player2), "0");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "30");
        assertEquals(match.pointForPlayer(player2), "0");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "30");
        assertEquals(match.pointForPlayer(player2), "15");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "40");
        assertEquals(match.pointForPlayer(player2), "15");
        match.updateWithPointWonBy(player1);
        assertEquals(player1.getGame(), 1);
        assertEquals(player2.getGame(), 0);

        assertEquals(match.pointForPlayer(player1), "0");
        assertEquals(match.pointForPlayer(player2), "0");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "15");
        assertEquals(match.pointForPlayer(player2), "0");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "30");
        assertEquals(match.pointForPlayer(player2), "0");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "30");
        assertEquals(match.pointForPlayer(player2), "15");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "40");
        assertEquals(match.pointForPlayer(player2), "15");
        match.updateWithPointWonBy(player1);
        assertEquals(player1.getGame(), 2);
        assertEquals(player2.getGame(), 0);

        assertEquals(match.pointForPlayer(player1), "0");
        assertEquals(match.pointForPlayer(player2), "0");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "0");
        assertEquals(match.pointForPlayer(player2), "15");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "0");
        assertEquals(match.pointForPlayer(player2), "30");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "0");
        assertEquals(match.pointForPlayer(player2), "40");
        match.updateWithPointWonBy(player2);
        assertEquals(player1.getGame(), 2);
        assertEquals(player2.getGame(), 1);

        assertEquals(match.pointForPlayer(player1), "0");
        assertEquals(match.pointForPlayer(player2), "0");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "0");
        assertEquals(match.pointForPlayer(player2), "15");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "15");
        assertEquals(match.pointForPlayer(player2), "15");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "30");
        assertEquals(match.pointForPlayer(player2), "15");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "40");
        assertEquals(match.pointForPlayer(player2), "15");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "40");
        assertEquals(match.pointForPlayer(player2), "30");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "40");
        assertEquals(match.pointForPlayer(player2), "40");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "40A");
        assertEquals(match.pointForPlayer(player2), "40");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "40");
        assertEquals(match.pointForPlayer(player2), "40");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "40");
        assertEquals(match.pointForPlayer(player2), "40A");
        match.updateWithPointWonBy(player2);
        assertEquals(player1.getGame(), 2);
        assertEquals(player2.getGame(), 2);

    }

    @Test
    public void testSetMatch(){
        Player player1 = new Player("Jean");
        Player player2 = new Player("Philips");
        TennisMatch match = new TennisMatch(player1, player2, MatchType.BEST_OF_THREE, true);

        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);

        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);

        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);

        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);

        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);

        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);

        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);

        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);

        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);

        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);


        assertEquals(player1.getSet(), 1);



    }

    @Test
    public void testMatchTieBreak(){
        Player player1 = new Player("Jean");
        Player player2 = new Player("Philips");
        TennisMatch match = new TennisMatch(player1, player2, MatchType.BEST_OF_THREE, true);

        for(int y = 0 ; y < 5; y++) {
            match.updateWithPointWonBy(player1);
            match.updateWithPointWonBy(player1);
            match.updateWithPointWonBy(player1);
            match.updateWithPointWonBy(player1);
        }


        for(int y = 0 ; y < 5; y++) {
            match.updateWithPointWonBy(player2);
            match.updateWithPointWonBy(player2);
            match.updateWithPointWonBy(player2);
            match.updateWithPointWonBy(player2);
        }

        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);

        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);

        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "1");
        assertEquals(match.pointForPlayer(player2), "0");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "1");
        assertEquals(match.pointForPlayer(player2), "1");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "2");
        assertEquals(match.pointForPlayer(player2), "1");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "3");
        assertEquals(match.pointForPlayer(player2), "1");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "4");
        assertEquals(match.pointForPlayer(player2), "1");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "5");
        assertEquals(match.pointForPlayer(player2), "1");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "6");
        assertEquals(match.pointForPlayer(player2), "1");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "0");
        assertEquals(match.pointForPlayer(player2), "0");

        assertEquals(player1.getSet(), 1);

    }

    @Test
    public void testPlayer2WinMatchNoTieBreak(){

        Player player1 = new Player("Jean");
        Player player2 = new Player("Philips");
        TennisMatch match = new TennisMatch(player1, player2, MatchType.BEST_OF_THREE, false);


        for(int y = 0 ; y < 6; y++) {
            match.updateWithPointWonBy(player1);
            match.updateWithPointWonBy(player1);
            match.updateWithPointWonBy(player1);
            match.updateWithPointWonBy(player1);
        }


        for(int y = 0 ; y < 6; y++) {
            match.updateWithPointWonBy(player2);
            match.updateWithPointWonBy(player2);
            match.updateWithPointWonBy(player2);
            match.updateWithPointWonBy(player2);
        }

        for(int y = 0 ; y < 6; y++) {
            match.updateWithPointWonBy(player2);
            match.updateWithPointWonBy(player2);
            match.updateWithPointWonBy(player2);
            match.updateWithPointWonBy(player2);
        }

        assertTrue(match.isFinished());

    }

    @Test
    public void testPlayer1WinMatchTieBreak(){
        Player player1 = new Player("Jean");
        Player player2 = new Player("Philips");
        TennisMatch match = new TennisMatch(player1, player2, MatchType.BEST_OF_THREE, true);


        for(int y = 0 ; y < 6; y++) {
            match.updateWithPointWonBy(player1);
            match.updateWithPointWonBy(player1);
            match.updateWithPointWonBy(player1);
            match.updateWithPointWonBy(player1);
        }


        for(int y = 0 ; y < 6; y++) {
            match.updateWithPointWonBy(player2);
            match.updateWithPointWonBy(player2);
            match.updateWithPointWonBy(player2);
            match.updateWithPointWonBy(player2);
        }


        for(int y = 0 ; y < 5; y++) {
            match.updateWithPointWonBy(player1);
            match.updateWithPointWonBy(player1);
            match.updateWithPointWonBy(player1);
            match.updateWithPointWonBy(player1);
        }


        for(int y = 0 ; y < 5; y++) {
            match.updateWithPointWonBy(player2);
            match.updateWithPointWonBy(player2);
            match.updateWithPointWonBy(player2);
            match.updateWithPointWonBy(player2);
        }

        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);
        match.updateWithPointWonBy(player1);

        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);
        match.updateWithPointWonBy(player2);


        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "1");
        assertEquals(match.pointForPlayer(player2), "0");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "1");
        assertEquals(match.pointForPlayer(player2), "1");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "2");
        assertEquals(match.pointForPlayer(player2), "1");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "3");
        assertEquals(match.pointForPlayer(player2), "1");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "4");
        assertEquals(match.pointForPlayer(player2), "1");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "5");
        assertEquals(match.pointForPlayer(player2), "1");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "6");
        assertEquals(match.pointForPlayer(player2), "1");
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "0");
        assertEquals(match.pointForPlayer(player2), "0");

        assertTrue(match.isFinished());
    }


}



