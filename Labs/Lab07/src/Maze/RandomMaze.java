// 文件: maze/RandomMaze.java
package Maze; // 包声明

import java.util.Random; // 或者使用 Math.random()

/**
 * Maze 的子类，根据概率自动随机生成墙壁。
 */
public class RandomMaze extends Maze {

    // 我们可以使用 Math.random() 或 java.util.Random 的实例
    // 使用 java.util.Random 允许在需要可重复性时设置种子
    // private static final Random randomGenerator = new Random();

    /**
     * 创建具有给定行数和列数的随机迷宫。
     * 每个单元格成为墙壁的概率由 wallProbability 定
     *
     * @param rows            迷宫的行数。
     * @param cols            迷宫的列数。
     * @param wallProbability 给定单元格成为墙壁的概率（介于 0.0 和 1.0 之间）。
     */
    public RandomMaze(int rows, int cols, double wallProbability) {
        // 1. 调用超类构造函数来初始化基本的迷宫网格
        super(rows, cols);

        if (wallProbability < 0.0 || wallProbability > 1.0) {
            throw new IllegalArgumentException("墙壁概率必须介于 0.0 和 1.0 之间。(Wall probability must be between 0.0 and 1.0.)");
        }

        // 2. 遍历每个单元格并可能设置墙壁
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                // 生成一个 0.0 到 1.0 之间的随机数
                if (Math.random() < wallProbability) {
                    // 如果随机数小于概率，则设置墙壁
                    try {
                        // 我们需要 try-catch，因为 setWall 抛出一个受查异常。
                        // 然而，我们的循环保证了 r 和 c 是有效的，
                        // 所以理论上这个异常在这里永远不会被抛出。
                        this.setWall(r, c);
                    } catch (MazeBoundsException e) {
                        // 这部分理想情况下不应该在这种情况下到达。
                        // 如果到达了，说明循环边界或 isValid 逻辑有问题。
                        System.err.println("在 RandomMaze 生成期间出现意外的 MazeBoundsException (Unexpected MazeBoundsException during RandomMaze generation): " + e.getMessage());
                        // 如果认为这是编程错误，可以选择性地重新抛出为非受查异常
                        // throw new RuntimeException("迷宫生成期间的内部错误 (Internal error during maze generation)", e);
                    }
                }
            }
        }
    }
}