public class TennisMatch {

    private Player player1;
    private Player player2;
    private MatchType matchType;
    private boolean tieBreakInLastSet;
    private boolean isTieBreak = false;

    public TennisMatch(Player player1, Player player2, MatchType matchType, boolean tieBreakInLastSet) {
        this.player1 = player1;
        this.player2 = player2;
        this.matchType = matchType;
        this.tieBreakInLastSet = tieBreakInLastSet;
    }

    void updateWithPointWonBy(Player player) {
        if(!isFinished()) {
            if (isPlayer1(player)) {
                addPoint(player1);

            } else {
                addPoint(player2);
            }


            if (player.getPoint().equals("W") || player.getPoint().equals("7")) {
                updateGameBy(player);

                updateSetBy(player);

                resetPoints();
            }
        }
    }


    private void resetPoints(){
        player1.setPoint("0");
        player2.setPoint("0");
    }

    private void resetGames(){
        player1.setGame(0);
        player2.setGame(0);
    }


    private void updateSetBy(Player player){
        if(player.getGame() >= 6 ){
            if(isTieBreak){
               if(player.getGame() == 7){
                   player.setSet(player.getSet()+1);
                   isTieBreak = false;
               }
            }
            if(player1.getGame() == 6 && player2.getGame() == 6){
                if((player1.getSet() + player2.getSet()) == matchType.maxNumberOfSets()-1){
                  if(tieBreakInLastSet){
                      isTieBreak = true;
                  }
                }
            } else if((player1.getGame() - player2.getGame()) >= 2 ){
                player1.setSet(player1.getSet()+1);
                resetGames();
            } else if ((player2.getGame() - player1.getGame()) >= 2){
                player2.setSet(player2.getSet()+1);
                resetGames();
            }
        }
    }

    String pointForPlayer(Player player) {
        return player.getPoint();
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
        if(player1.getSet() == matchType.getNumberOfSetsToWin()){
            System.out.println("Le joueur 1 a gagné");

        } else if (player2.getSet() == matchType.getNumberOfSetsToWin()){
            System.out.println("Le joueur 2 a gagné");
        }
        return player1.getSet() == matchType.getNumberOfSetsToWin() || player2.getSet() == matchType.getNumberOfSetsToWin();
    }

    private boolean isPlayer1(Player player) {
        return player.getName().equals(player1.getName());
    }

    private void addPoint(Player player) {

        if(isTieBreak){
            switch (player.getPoint()){
                case "0":
                    player.setPoint("1");
                    break;
                case "1":
                    player.setPoint("2");
                    break;

                case "2":
                    player.setPoint("3");
                    break;

                case "3":
                    player.setPoint("4");
                    break;

                case "4":
                    player.setPoint("5");
                    break;

                case "5":
                    player.setPoint("6");
                    break;

                case "6":
                    player.setPoint("7");
                    break;
            }

        } else {
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
    }

    private void updateGameBy(Player player){
        int playerGame = player.getGame() + 1;
        player.setGame(playerGame);
    }

}
