package boardgame;

public class Board {

	private int rows;
	private int colunm;
	private Piece[][] pieces;

	public Board(int rows, int colunm) {
		if (rows < 1 || colunm < 1) {
			throw new BoardExeption("Erro Criando tabuleiro! Nescessario criar com 1 Linha e 1 Coluna.");
		}
		this.rows = rows;
		this.colunm = colunm;
		pieces = new Piece[rows][colunm];
	}

	public int getRows() {
		return rows;
	}

	public int getColunm() {
		return colunm;
	}

	public Piece piece(int row, int colunm) {
		if (!positionExistis(row, colunm)) {
			throw new BoardExeption("Nao existe essa posiçao no tabuleiro.");
		}
		return pieces[row][colunm];
	}

	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardExeption("Nao existe essa posiçao no tabuleiro.");
		}
		return pieces[position.getRow()][position.getColumn()];
	}

	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardExeption("já existe um peça na posição " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}

	private boolean positionExistis(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < colunm;
	}

	public boolean positionExists(Position position) {
		return positionExistis(position.getRow(), position.getColumn());
	}

	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardExeption("Nao existe essa posiçao no tabuleiro.");
		}
		return piece(position) != null;
	}

}
