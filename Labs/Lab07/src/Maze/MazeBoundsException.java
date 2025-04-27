// 文件: maze/MazeBoundsException.java
package Maze; // 包声明是必需的

/**
 * 当尝试访问迷宫边界之外的坐标时抛出的异常。
 */
public class MazeBoundsException extends Exception {
    /**
     * 构造一个新的 MazeBoundsException，使用默认错误消息。
     */
    public MazeBoundsException() {
        super("试图访问迷宫边界之外的坐标。(Attempted to access coordinates outside the maze boundaries.)");
    }

    /**
     * 构造一个新的 MazeBoundsException，使用指定的详细消息。
     * @param message 详细消息。
     */
    public MazeBoundsException(String message) {
        super(message);
    }
}