package org.example.llds.ticTacToe;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Game {
  private List<Player> players;
  private Board board;
  private Player winner;
  private int[] lastCellPlayed;
  private int lastRowPlayed;
  private int lastColumnPlayed;

  public Game(List<Player> players, Board board) {
    this.board = board;
    this.players = players;
    this.winner = null;
  }

  public void updateLastCellPlayed(int row, int col) {
    lastCellPlayed[0] = row;
    lastCellPlayed[1] = col;
    lastRowPlayed = row;
    lastColumnPlayed = col;
  }

  public void printBoard() {
    PlayingPiece[][] boardStatus = this.getBoard()
        .getBoardStatus();

    System.out.println("Current board status:");
    for (int i = 0; i < boardStatus.length; i++) {
      for (int j = 0; j < boardStatus[i].length; j++) {
        System.out.print(Objects.isNull(boardStatus[i][j]) ? "| " : boardStatus[i][j].getPieceType() + "| ");

        if (j == boardStatus.length - 1) {
          System.out.println();
        }
      }
    }
  }

  public boolean isPlayerWinner(Player player) {
    PieceType pieceType = player.getPlayingPiece()
        .getPieceType();

    boolean rowMatch = true;
    boolean columnMatch = true;
    boolean diagonalMatch = true;
    boolean antiDiagonalMatch = true;
    // Need to check in row
    for (int i = 0; i < board.getSize(); i++) {
      if (board.getBoardStatus()[lastRowPlayed][i] == null
          || board.getBoardStatus()[lastRowPlayed][i].getPieceType() != pieceType)
      {
        rowMatch = false;
      }
    }

    // Need to check in column
    for (int i = 0; i < board.getSize(); i++) {
      if (board.getBoardStatus()[i][lastColumnPlayed] == null
          || board.getBoardStatus()[i][lastColumnPlayed].getPieceType() != pieceType)
      {
        columnMatch = false;
      }
    }

    // Need to check diagonals
    for (int i = 0; i < board.getSize(); i++) {
      if (board.getBoardStatus()[i][i] == null || board.getBoardStatus()[i][i].getPieceType() != pieceType) {
        diagonalMatch = false;
      }
    }

    // Need to check anti-diagonals
    for (int i = 0, j = board.getSize() - 1; i < board.getSize(); i++, j--) {
      if (board.getBoardStatus()[i][j] == null || board.getBoardStatus()[i][j].getPieceType() != pieceType) {
        antiDiagonalMatch = false;
      }
    }

    return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
  }

  public void addPieceToBoard(Player player, int row, int col) {
    board.addPiece(player.getPlayingPiece(), row, col);
  }
}
