public class GameOfLife {
    private boolean[][] grid;

    public GameOfLife(boolean[][] initialGrid) {
        grid = initialGrid;
    }

    public void printGrid() {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] ? "*" : ".");
            }
            System.out.println();
        }

    }

    public void simulateStep() {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] NewGrid = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j ++){
                int liveNeighbors = countliveNeighbors(i, j);
            }
            if (grid[i][j]) {
                NewGrid[i][j] = (liveNeighbors == 2 || liveNeighbors == 3);
            }else {
                NewGrid[i][j] = (liveNeighbors == 3);
            }
        }
    }

    public static void main(String[] args) {
        boolean[][] initialGrid = new boolean[10][10];
        initialGrid[4][5] = true;
        initialGrid[4][6] = true;
        initialGrid[5][4] = true;
        initialGrid[5][5] = true;
        initialGrid[6][5] = true;
        GameOfLife game = new GameOfLife(initialGrid);
        for (int i = 0; i < 10; i++) {
            System.out.println("Before Step " + (i+1));
            game.printGrid();
            System.out.println();
            game.simulateStep();
        }
    }
}