package org.example.llds.ticTacToe;

import lombok.Getter;

@Getter
public class Board {
  private int moveCount;
  private int size;
  private PlayingPiece[][] boardStatus;

  public Board(int size) {
    this.size = size;
    this.moveCount = size * size;
    this.boardStatus = new PlayingPiece[size][size];
  }

  public void addPiece(PlayingPiece piece, int row, int col) {
    boardStatus[row][col] = piece;
    this.decrementMoveCount();
  }

  private void decrementMoveCount() {
    this.moveCount--;
  }
}
