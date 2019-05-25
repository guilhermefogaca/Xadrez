package aplicaçao;

import Chess.ChessMatch;
import boardgame.Board;
import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChessMatch chessmatch = new ChessMatch();
		
		UI.printBoard(chessmatch.getpieces());
	}

}
