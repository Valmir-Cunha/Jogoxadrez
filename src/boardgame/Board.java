package boardgame;

public class Board { // tabuleiro
	private int rows; // linhas do tabuleiro
	private int columns; // colunas do tabuleiro
	private Piece[][] pieces; // peças no tabuleiro
	
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error, tamanho do tabuleiro inválido!!");
		}
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}
	
	public int getColumns() {
		return columns;
	}

	public Piece piece(int row, int column) {
		if(!positionExists(row,column)) {
			throw new BoardException("Posição inválida");
		}
		return pieces[row][column];
	}
	public Piece piece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Posição inválida");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	
	public void placePiece(Piece piece, Position position) {
		if(thereIsAPiece(position)) {
			throw new BoardException("Posição ocupada");
		}
		this.pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if(!positionExists(position)) {
			throw new BoardException("Posição não existe");
		}
		return piece(position) != null;
	}
	
}
