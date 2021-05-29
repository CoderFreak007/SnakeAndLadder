package org.example;

import org.example.board.Board;
import org.example.board.BoardImpl;
import org.example.player.Player;
import org.example.player.PlayerImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Board board = new BoardImpl();
        Player player1 = new PlayerImpl("krishna");
        Player player2 = new PlayerImpl("kumar");
        Player player3 = new PlayerImpl("Gupta");
        board.addPlayer(player1);
        board.addPlayer(player2);
        board.addPlayer(player3);
        Player player = board.startPlay();
        System.out.println("And the winner is "+player.getPlayer_name());

    }
}
