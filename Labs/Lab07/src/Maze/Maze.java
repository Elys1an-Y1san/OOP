package Maze;

public class Maze {
    // Add fields here. They should all be private!
    private int cols;
    private int rows;
    private boolean[][] walls;


    public Maze(int rows, int cols) {
        // TODO
        this.cols = cols;
        this.rows = rows;
        walls = new boolean[rows][cols];

    }

    // Puts a wall at the given row and column.
    // Throws a MazeBoundsException if the row or column is invalid.
    public void setWall(int row, int col) throws MazeBoundsException {
        // TODO
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IndexOutOfBoundsException();
        }
        walls[row][col] = true;
    }


    // Returns true if there is a wall at the given row and column.
    // Throws a MazeBoundsException if the row or column is invalid.
    public boolean isWall(int row, int col) throws MazeBoundsException {
        // TODO
        if (row < 0 || row >= rows || col < 0 || col >= cols) {
            throw new IndexOutOfBoundsException();
        }

    return walls[col][row];
    }
}


