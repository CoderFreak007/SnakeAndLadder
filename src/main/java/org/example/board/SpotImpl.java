package org.example.board;

public class SpotImpl implements Spot {

    private int spot_num;

    private GameIem snake_or_Ladder;

    public SpotImpl(int spot_num) {
        this.spot_num = spot_num;
    }

    public int getSpot_num() {
        return spot_num;
    }

    public GameIem getSnake_or_Ladder() {
        return snake_or_Ladder;
    }

    public void setGameIem(GameIem snake_or_Ladder) {
        this.snake_or_Ladder = snake_or_Ladder;
    }

    public boolean isEmptySpot(){
        return (snake_or_Ladder == null);
    }


}
