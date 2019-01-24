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
        if (isPlayer1(player)) {
            if(player1.getPoint().equals("45")){
                updateGameBy(player1);
                //resetPoint();
            }
            addPoint(player1);

        } else {
            addPoint(player2);
        }

        if (
                player1.getPoint().equals("45") && player2.getPoint().equals("45") ||
                player1.getPoint().equals("45A") && player2.getPoint().equals("45A")
        ) {
            player1.setPoint("E");
            player2.setPoint("E");
        }


    }

    String pointForPlayer(Player player) {
        return player.getPoint();
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

    private boolean isPlayer1(Player player) {
        return player.getName().equals(player1.getName());
    }

    private void addPoint(Player player) {
        switch (player.getPoint()) {
            case "0":
                player.setPoint("15");
                break;
            case "15":
                player.setPoint("30");
                break;
            case "30":
                player.setPoint("45");
                break;
            case "E":
                player.setPoint("45A");
                break;
        }
    }

    private void updateGameBy(Player player){
       // player.setGame(player.getGame()++);
    }

}
