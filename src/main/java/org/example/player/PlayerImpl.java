package org.example.player;

import org.example.board.Spot;
import org.example.dice.Dice;

public class PlayerImpl implements Player {

    private String player_name;

    private Spot curr_pos;


    public PlayerImpl(String player_name) {
        this.player_name = player_name;
    }

    public String getPlayer_name() {
        return player_name;
    }

    public void setCurr_pos(Spot curr_pos) {
        this.curr_pos = curr_pos;
    }

    public boolean makeMove(Spot[] spots_on_borad ){
        Dice dice_rolled = Dice.rollDice();
        int curr_spot_num = curr_pos.getSpot_num();
        int next_spot_num = curr_spot_num+dice_rolled.getValue();
        Spot next_spot  = null;
        if(next_spot_num < spots_on_borad.length) {
            next_spot = spots_on_borad[next_spot_num];
            while(!next_spot.isEmptySpot()){
                next_spot = next_spot.getSnake_or_Ladder().getDestinationSpot();
            }
            System.out.println(this.player_name+" moved from "+curr_pos.getSpot_num() +" to "+next_spot.getSpot_num());
            curr_pos = next_spot;
        }

        return next_spot_num == (spots_on_borad.length-1);

    }

}
