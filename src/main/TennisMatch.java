public class TennisMatch {

    private Player player1;
    private Player player2;
    private MatchType matchType;
    private boolean tieBreakInLastSet;

    public TennisMatch(Player player1, Player player2, MatchType matchType, boolean tieBreakInLastSet) {
        this.player1 = player1;
        this.player2 = player2;
        this.matchType = matchType;
        this.tieBreakInLastSet = tieBreakInLastSet;
    }

    void updateWithPointWonBy(Player player) {

    }

    String pointForPlayer(Player player) {
        return "";
    }

    String pointsForPlayer(Player player) {
        return "";
    }

    int currentSetNumber() {
        return 0;
    }

    int gamesInCurrentSetForPlayer(Player player) {
        return 0;
    }

    int gamesInSetForPlayer(int setNumber, Player player) {
        return 0;
    }

    boolean isFinished() {
        return true;
    }
}
