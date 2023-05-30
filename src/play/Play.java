package play;

import checkface.CheckFace;
import FlipCoin.FlipCoin;


public class Play {
    private int chooseFace;
    private FlipCoin resultFace;
    private CheckFace checkFace;
    private int gameState;

    public Play(int chooseFace) {
        this.chooseFace = chooseFace;
        this.resultFace = new FlipCoin();
    }

    public int start() {
        resultFace.start();
        checkFace = new CheckFace(chooseFace, resultFace.getResultFace());
        gameState = checkFace.start();
        return gameState;
    }
}