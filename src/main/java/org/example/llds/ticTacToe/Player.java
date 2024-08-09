package org.example.llds.ticTacToe;

import lombok.Getter;

@Getter
public class Player {
  private String playerName;
  private PlayingPiece playingPiece;

  public Player(String playerName, PlayingPiece playingPiece) {
    this.playerName = playerName;
    this.playingPiece = playingPiece;
  }
}
