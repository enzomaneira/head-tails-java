package checkface;

public class CheckFace {
    private Object playerFace;
    private Object sortedFace;

    public CheckFace(Object playerFace, Object sortedFace) {
        this.playerFace = playerFace;
        this.sortedFace = sortedFace;
    }

    public int start() {
        if (playerFace.equals(sortedFace)) {
            return 1;
        } else {
            return 0;
        }
    }
}
