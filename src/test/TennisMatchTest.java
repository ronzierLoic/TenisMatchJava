import static org.junit.Assert.*;

import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TennisMatchTest {


    @Test
    public void testPlayer1Win() {
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
    public void testPlayer2Win() {
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
    public void testMatch(){
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
    }


}
