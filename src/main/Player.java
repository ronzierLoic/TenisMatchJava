class Player {
    private String name;
    private String point;
    private int game;
    private int set;

    Player(String name) {
        this.name = name;
        this.point = "0";
        this.game = 0;
        this.set = 0;

    }

    String getName() {
        return name;
    }

    String getPoint() {
        return point;
    }

    void setPoint(String point) {
        this.point = point;
    }

    public int getGame() {
        return game;
    }

    public void setGame(int game) {
        this.game = game;
    }

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }
}

