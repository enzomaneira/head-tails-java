package player;

import scoreboard.*;

public class Player {
    private Scoreboard playerscore;
    private int lifes;

    public Scoreboard getPlayerscore() {
        return playerscore;
    }

    public int getLifes() {
        return lifes;
    }

    public void setLifes(int lifes) {
        this.lifes = lifes;
    }

    public Player() {
        playerscore = new Scoreboard();
        lifes = 3;
    }
}
