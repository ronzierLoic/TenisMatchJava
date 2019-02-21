import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TennisMatchTest {

    @Test
    public void testPlayer1Point() {
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
        assertEquals(match.pointForPlayer(player1), "0");
    }

    @Test
    public void testPlayer2Point() {
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
        assertEquals(match.pointForPlayer(player2), "0");
    }

    @Test
    public void testPlayer1WinGame(){
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
        assertEquals(match.pointForPlayer(player1), "0");
        assertEquals(match.pointForPlayer(player2), "0");
        assertEquals(player1.getGame(), 1);
        assertEquals(player2.getGame(), 0);

    }

    @Test
    public void testPlayer2WinGame(){
        Player player1 = new Player("Jean");
        Player player2 = new Player("Philips");
        TennisMatch match = new TennisMatch(player1, player2, MatchType.BEST_OF_THREE, true);
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
        match.updateWithPointWonBy(player1);
        assertEquals(match.pointForPlayer(player1), "15");
        assertEquals(match.pointForPlayer(player2), "40");
        match.updateWithPointWonBy(player2);
        assertEquals(match.pointForPlayer(player1), "0");
        assertEquals(match.pointForPlayer(player2), "0");
        assertEquals(player1.getGame(), 0);
        assertEquals(player2.getGame(), 1);

    }

    @Test
    public void testMatchEqualsAndPlayer2WinGame(){
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
        assertEquals(match.pointForPlayer(player1), "0");
        assertEquals(match.pointForPlayer(player2), "0");
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
    public void testPlayer1WinSet(){
        Player player1 = new Player("Jean");
        Player player2 = new Player("Philips");
        TennisMatch match = new TennisMatch(player1, player2, MatchType.BEST_OF_THREE, true);

        playerWinGame(match,player1);
        assertEquals(player1.getGame(), 1);
        assertEquals(player2.getGame(), 0);

        playerWinGame(match,player1);
        assertEquals(player1.getGame(), 2);
        assertEquals(player2.getGame(), 0);

        playerWinGame(match,player1);
        assertEquals(player1.getGame(), 3);
        assertEquals(player2.getGame(), 0);

        playerWinGame(match,player1);
        assertEquals(player1.getGame(), 4);
        assertEquals(player2.getGame(), 0);

        playerWinGame(match,player1);
        assertEquals(player1.getGame(), 5);
        assertEquals(player2.getGame(), 0);

        playerWinGame(match,player2);
        assertEquals(player1.getGame(), 5);
        assertEquals(player2.getGame(), 1);

        playerWinGame(match,player2);
        assertEquals(player1.getGame(), 5);
        assertEquals(player2.getGame(), 2);

        playerWinGame(match,player2);
        assertEquals(player1.getGame(), 5);
        assertEquals(player2.getGame(), 3);

        playerWinGame(match,player2);
        assertEquals(player1.getGame(), 5);
        assertEquals(player2.getGame(), 4);

        playerWinGame(match,player1);

        assertEquals(player1.getSet(), 1);
        assertEquals(player2.getSet(), 0);


    }

    @Test
    public void testTieBreak() {
        Player player1 = new Player("Jean");
        Player player2 = new Player("Philips");
        TennisMatch match = new TennisMatch(player1, player2, MatchType.BEST_OF_THREE, true);

        playerWinYGames(match,player1,5);
        playerWinYGames(match,player2,5);
        assertEquals(player1.getGame(),5);
        assertEquals(player2.getGame(),5);

        playerWinGame(match,player1);
        playerWinGame(match,player2);

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
    }

    @Test
    public void testPlayer1WinMatchNoTieBreak(){

        Player player1 = new Player("Jean");
        Player player2 = new Player("Philips");
        TennisMatch match = new TennisMatch(player1, player2, MatchType.BEST_OF_THREE, false);

        playerWinSet(match,player1);
        assertEquals(player1.getSet(),1);
        assertEquals(player2.getSet(),0);

        playerWinSet(match,player2);
        assertEquals(player1.getSet(),1);
        assertEquals(player2.getSet(),1);

        playerWinSet(match,player1);
        assertEquals(player1.getSet(),2);
        assertEquals(player2.getSet(),1);

        assertTrue(match.isFinished());

    }

    @Test
    public void testPlayer1WinMatchTieBreak(){
        Player player1 = new Player("Jean");
        Player player2 = new Player("Philips");
        TennisMatch match = new TennisMatch(player1, player2, MatchType.BEST_OF_THREE, true);

        playerWinSet(match,player1);

        playerWinSet(match,player2);

        playerWinYGames(match,player1,5);

        playerWinYGames(match,player2,5);

        playerWinGame(match, player1);

        playerWinGame(match, player2);

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


    @Test
    public void testPlayer1WinBestOfFive() {
        Player player1 = new Player("Romain");
        Player player2 = new Player("Robin");
        TennisMatch match = new TennisMatch(player1, player2, MatchType.BEST_OF_FIVE, false);

        playerWinSet(match,player1);
        assertEquals(player1.getSet(),1);
        assertEquals(player2.getSet(),0);

        playerWinSet(match,player2);
        assertEquals(player1.getSet(),1);
        assertEquals(player2.getSet(),1);

        playerWinSet(match,player1);
        assertEquals(player1.getSet(),2);
        assertEquals(player2.getSet(),1);

        playerWinSet(match,player2);
        assertEquals(player1.getSet(),2);
        assertEquals(player2.getSet(),2);

        playerWinSet(match,player1);
        assertEquals(player1.getSet(),3);
        assertEquals(player2.getSet(),2);

        assertTrue(match.isFinished());
    }

    @Test
    public void testPlayer1WinBestOfFiveTieBreak() {
        Player player1 = new Player("Romain");
        Player player2 = new Player("Robin");
        TennisMatch match = new TennisMatch(player1, player2, MatchType.BEST_OF_FIVE, false);

        playerWinSet(match,player1);
        assertEquals(player1.getSet(),1);
        assertEquals(player2.getSet(),0);

        playerWinSet(match,player2);
        assertEquals(player1.getSet(),1);
        assertEquals(player2.getSet(),1);

        playerWinSet(match,player1);
        assertEquals(player1.getSet(),2);
        assertEquals(player2.getSet(),1);

        playerWinSet(match,player2);
        assertEquals(player1.getSet(),2);
        assertEquals(player2.getSet(),2);

        playerWinSet(match,player1);
        assertEquals(player1.getSet(),3);
        assertEquals(player2.getSet(),2);

        assertTrue(match.isFinished());
    }

    // Private function
    private void playerWinGame(TennisMatch match,Player player){
        match.updateWithPointWonBy(player);
        match.updateWithPointWonBy(player);
        match.updateWithPointWonBy(player);
        match.updateWithPointWonBy(player);
    }

    private void playerWinSet(TennisMatch match, Player player){
        for(int x = 0 ; x < 6; x++) {
            playerWinGame(match,player);
        }
    }

    private void playerWinYGames(TennisMatch match, Player player, int y){
        for(int x = 0 ; x < y; x++) {
            playerWinGame(match,player);
        }
    }

}



