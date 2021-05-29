package org.example.board;

import org.example.player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BoardImpl implements  Board{

   private List<Player> players = null;

   private Spot[] spots_on_borad = new Spot[100];

   private Random random = null;

   private static int no_of_snakes = 5;

    private static int no_of_ladders = 6;

    public BoardImpl() {
        random = new Random();
        populateSpots();
        generateSnakes();
        generateLadders();
        players = new ArrayList<>();
    }

    private void populateSpots(){
        for(int i =0; i< 100; i++){
            spots_on_borad[i] = new SpotImpl(i);
        }
    }

    private void generateSnakes(){
        int snakes_count = 0;
        while(snakes_count < no_of_snakes){
            int random_spot_num = random.nextInt(100);
            Spot spot = spots_on_borad[random_spot_num];
            int dest_spot_num = random_spot_num;
            while(dest_spot_num >= random_spot_num || dest_spot_num == 99){
                dest_spot_num = random.nextInt(100);
            }
            spot.setGameIem(new Snake(spot,  spots_on_borad[dest_spot_num]));
            snakes_count++;
        }
    }

    private void generateLadders(){
        int ladder_count = 0;
        while(ladder_count < no_of_ladders){
            int random_spot_num = random.nextInt(100);
            Spot spot = spots_on_borad[random_spot_num];
            int dest_spot_num = random_spot_num;
            while(dest_spot_num <= random_spot_num || dest_spot_num == 99){
                dest_spot_num = random.nextInt(100);
            }
            if(spots_on_borad[dest_spot_num].isEmptySpot()) {
                spot.setGameIem(new Ladder(spot, spots_on_borad[dest_spot_num]));
                ladder_count++;
            }
        }
    }

    public void addPlayer(Player player){
        player.setCurr_pos(spots_on_borad[0]);
        players.add(player);
   }

    public Player startPlay(){
        Player winner = null;
        while(winner == null){
            for(Player player : players){
                boolean game_won = player.makeMove(spots_on_borad);
                if(game_won){
                    winner = player;
                    break;
                }
            }
        }
        return winner;
    }

}
