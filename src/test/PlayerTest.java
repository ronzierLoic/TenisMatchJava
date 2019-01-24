import static org.junit.Assert.*;

import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void testPlayer() {
        Player player1 = new Player("Jean");
        assertEquals(player1.getName(), "Jean");
    }



}
