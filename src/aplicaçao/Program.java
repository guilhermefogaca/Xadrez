package aplicaçao;

import java.util.Scanner;

import Chess.ChessMatch;
import Chess.ChessPiece;
import Chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		ChessMatch chessmatch = new ChessMatch();
	
		UI.printBoard(chessmatch.getpieces());
		while (true) {
			UI.printBoard(chessmatch.getpieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);

			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);

			ChessPiece capturedPiece = chessmatch.performChessMove(source, target);
		}
	}

}
