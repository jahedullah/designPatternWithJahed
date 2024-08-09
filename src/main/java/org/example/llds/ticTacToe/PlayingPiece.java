package org.example.llds.ticTacToe;

import java.util.Optional;

import lombok.Getter;

@Getter
public class PlayingPiece {
  private PieceType pieceType;

  public PlayingPiece(PieceType pieceType) {
    this.pieceType = pieceType;
  }
}
