package org.example.player;

import org.example.board.Spot;

public interface Player {

    public String getPlayer_name();
    public boolean makeMove(Spot[] spots_on_borad );
    public void setCurr_pos(Spot curr_pos);

}
