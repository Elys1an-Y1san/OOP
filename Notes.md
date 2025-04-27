```java
public class MyString {  
    private char[] chars;  
  
    public MyString(char[] chars) {  
        this.chars = new char[chars.length];  
        for (int i = 0; i < chars.length; i++) {  
            this.chars[i] = chars[i];  
        }  
    }  
  
    public char charAt(int index) {  
        return chars[index];  
    }  
  
    public int length() {  
        return chars.length;  
    }  
  
    public boolean equals(MyString s) {  
        if (length() != s.length())  
            return false;  
        for (int i = 0; i < length(); i++) {  
            if (charAt(i) != s.charAt(i))  
                return false;  
        }  
        return true;  
    }  
  
    public MyString substring(int start, int end) {  
        char[] newChars = new char[end - start];  
        for (int i = start; i < end; i++) {  
            newChars[i - start] = chars[i];  
        }  
        return new MyString(newChars);  
    }  
  
    public MyString concatenate(MyString s) {  
        char[] newChars = new char[chars.length + s.length()];  
        for (int i = 0; i < chars.length; i++)  
            newChars[i] = chars[i];  
        for (int i = 0; i < s.length(); i++)  
            newChars[chars.length + i] = s.charAt(i);  
        return new MyString(newChars);  
    }  
  
    public boolean equals(String s) {  
        return equals(new MyString(s.toCharArray()));  
    }  
  
    public MyString substring(int start) {  
        return substring(start, length());  
    }  
  
    public MyString concatenate(char c) {  
        return concatenate(new MyString(new char[] { c }));  
    }  
}
```


```java
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
```

Fac
```java
import java.util.Scanner;  
  
public class factorials {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter a number: ");  
        int num = sc.nextInt();  
        factorials obj = new factorials();  
        long result = obj.factorial(num);  
        System.out.println(result);  
  
    }  
    public long factorial(int num) {  
        long result = 1;  
        for( int i = 1; i <= num; i++){  
            result *= i;  
        }  
        return result;  
    }  
}
```

```java
import java.util.Scanner;  
  
public class factorials {  
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter a number: ");  
        int num = sc.nextInt();  
        factorials obj = new factorials();  
        long result = obj.factorial(num);  
        System.out.println(result);  
  
    }  
    public long factorial(int num) {  
        long result = 1;  
        for( int i = 1; i <= num; i++){  
            result *= i;  
        }  
        return result;  
    }  
}
```