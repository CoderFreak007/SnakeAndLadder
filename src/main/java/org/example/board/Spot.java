package org.example.board;

public interface Spot {

    public boolean isEmptySpot();

    public void setGameIem(GameIem snake_or_Ladder);

    public GameIem getSnake_or_Ladder();

    public int getSpot_num();
}
