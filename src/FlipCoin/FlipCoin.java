package FlipCoin;

import java.util.Random;

public class FlipCoin {
    private int resultFace;

    public FlipCoin() {
        resultFace = -1;
    }

    public void start() {
        int[] faces = {0, 1}; // 0 representa "Cara" e 1 representa "Coroa"
        Random random = new Random();
        resultFace = faces[random.nextInt(faces.length)];
    }

    public int getResultFace() {
        return resultFace;
    }
}
