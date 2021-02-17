package boardgame;

public class Board { // tabuleiro
	private int rows; // linhas do tabuleiro
	private int columns; // colunas do tabuleiro
	private Piece[][] pieces; // posição da peça no tabuleiro
	
	public Board(int rows, int columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
}
