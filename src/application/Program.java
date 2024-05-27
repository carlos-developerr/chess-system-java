package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {

		Scanner r = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(r);

			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(r);

			ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
		}

	}

}
