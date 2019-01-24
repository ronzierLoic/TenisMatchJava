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
            addPoint(player1);

        } else {
            addPoint(player2);
        }





        if(player1.getPoint().equals("W")){
            updateGameBy(player1);
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
                player.setPoint("40");
                break;
            case "40":
                if(player1.getPoint().equals("40") && player2.getPoint().equals("40")){
                    player.setPoint("40A");
                } else if(player1.getPoint().equals("40A") || player2.getPoint().equals("40A")){
                    player1.setPoint("40");
                    player2.setPoint("40");
                } else {
                    player.setPoint("W");
                }
                break;
            case "40A":
                player.setPoint("W");
                break;
        }
    }

    private void updateGameBy(Player player){
        int playerGame = player.getGame() + 1;
        player.setGame(playerGame);
    }

}
