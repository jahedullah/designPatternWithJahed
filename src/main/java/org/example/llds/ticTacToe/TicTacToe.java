package org.example.llds.ticTacToe;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

public class TicTacToe {
  public static void main(String[] args) {
    PlayingPiece playingPieceX = new PlayingPiece(PieceType.X);
    Player player1 = new Player("Jahedul", playingPieceX);

    PlayingPiece playingPieceO = new PlayingPiece(PieceType.O);
    Player player2 = new Player("Bot", playingPieceO);

    List<Player> players = new ArrayList<>();
    players.add(player1);
    players.add(player2);

    Board board = new Board(3);
    Game game = new Game(players, board);

    //    Predicate<Game> predicate = gameShouldRun -> Objects.nonNull(game.getWinner()) && game.getBoard().getMoveCount() > 0;
    TicTacToe ticTacToe = new TicTacToe();
    Queue<Player> playerQueue = new ArrayDeque<>();
    playerQueue.add(player1);
    playerQueue.add(player2);
    while (Objects.isNull(game.getWinner()) && game.getBoard()
        .getMoveCount() > 0) {
      game.printBoard();
      Player currentPlayer = playerQueue.poll();
      playerQueue.add(currentPlayer);
      int[] selectedCell = ticTacToe.callForPiece(currentPlayer);
      game.addPieceToBoard(currentPlayer, selectedCell[0], selectedCell[1]);
      boolean winner = game.isPlayerWinner(currentPlayer);
      if (winner) {
        game.setWinner(currentPlayer);
        break;
      }
    }
    System.out.println(game.getWinner()
        .getPlayerName() + " won the game.");
  }

  private int[] callForPiece(Player player) {
    System.out.println("Please " + player.getPlayerName() + "its your turn. Give me the index");
    System.out.println("For example: If you prefer row 1 column 2 then please type 12");
    Scanner scanner = new Scanner(System.in);
    int playerInput = scanner.nextInt();
    int columnInput = playerInput % 10;
    int rowInput = (playerInput - columnInput) / 10;
    return new int[] {rowInput, columnInput};
  }
}
