package org.example.board;

import org.example.player.Player;

public interface Board {

    public Player startPlay();
    public void addPlayer(Player player);
}
