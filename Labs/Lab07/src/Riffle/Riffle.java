// 文件: riffle/Riffle.java
package Riffle;

import java.util.Arrays; // 如果需要复制回，则简单 'riffle' 版本需要

public class Riffle {

    /**
     * 将数组的前半部分与后半部分进行交错洗牌。
     * 假设数组始终具有偶数长度。
     * 此实现使用 O(n) 辅助空间。

     * 示例: {1, 2, 3, 4, 5, 6} 变为 {1, 4, 2, 5, 3, 6}.
     *
     * @param a 要进行洗牌的数组。必须具有偶数长度。
     */
    public static void riffle(int[] a) {
        int n = a.length;
        if (n % 2 != 0) {
            // 或根据需求抛出异常
            System.err.println("警告: Riffle 假设数组长度为偶数。(Warning: Riffle assumes even length array.)");
            return;
        }
        int half = n / 2;
        int[] temp = new int[n]; // O(n) 辅助空间

        for (int i = 0; i < half; i++) {
            temp[2 * i] = a[i];          // 来自前半部分的元素
            temp[2 * i + 1] = a[i + half]; // 来自后半部分的元素
        }

        // 将结果复制回原始数组
        System.arraycopy(temp, 0, a, 0, n);
        // 或者: for (int i = 0; i < n; i++) { a[i] = temp[i]; }
    }


    // === 这是挑战问题 ===

    /**
     * 计算元素在原地交错洗牌期间的目标目的索引。
     * @param i 当前索引。
     * @param n 数组的总长度。
     * @return 当前位于索引 'i' 的元素应该移动到的索引。
     */
    private static int getTargetIndex(int i, int n) {
        int half = n / 2;
        if (i < half) {
            // 前半部分的元素移动到偶数位置
            return 2 * i;
        } else {
            // 后半部分的元素移动到奇数位置
            return 2 * (i - half) + 1;
        }
    }

    /**
     * 实现与 riffle 相同的结果，但原地 (in-place) 洗牌（O(1) 辅助空间）。
     * 不应分配显著的额外空间（新数组、对象）。
     * 此实现使用循环跟踪算法。
     * 重要假设：此实现通过临时取反值来标记元素为“已处理”。
     * 它假设原始数组仅包含非负整数。它在最后恢复符号。
     *
     * @param a 要原地洗牌的数组。必须具有偶数长度。
     */
    public static void riffleInPlace(int[] a) {
        int n = a.length;
        if (n == 0 || n % 2 != 0) {
            // 或抛出异常
            System.err.println("警告: RiffleInPlace 需要偶数长度的数组。(Warning: RiffleInPlace requires even length array.)");
            return;
        }

        // 使用循环领导者方法处理元素（通过标记简化）
        // 从 1 开始，因为索引 0 永远不会移动。
        for (int i = 1; i < n; i++) {
            // 检查元素 a[i] 是否已被处理（标记为负数）
            // 如果允许 0 作为输入，还需要正确处理（需要仔细标记）
            // 简单检查：如果 a[i] < 0，则跳过。（假设原始输入为非负数）
            // 为了处理 0，我们需要不同的标记或检查值的范围。
            // 为简单起见，这里我们坚持使用取反，并假设输入为正数。
            // 更健壮的解决方案可能使用位操作（如果可能），或不同的 O(1) 空间算法。

            if (a[i] <= 0) { // 如果已标记（负数）或者是 0（需要小心），则跳过在此处开始循环。
                // 这个简单的检查假设原始输入是正数。
                continue;
            }

            int current = i;
            int valueToMove = a[i]; // 保存当前位置的值

            do {
                int next = getTargetIndex(current, n); // 计算下一个位置

                // 获取下一个位置的值，并保存
                int temp = a[next];
                // 将当前要移动的值放到下一个位置，并标记为负数
                a[next] = -valueToMove;
                // 更新下一个要移动的值
                valueToMove = temp;
                // 更新当前位置
                current = next;

            } while (current != i); // 继续直到我们循环回到起点
        }

        // 最后一遍：恢复原始符号（使所有值变为正数）
        // 也处理了原始值为 0 且被取反为 0 的情况。
        for (int i = 0; i < n; i++) {
            if (a[i] < 0) {
                a[i] = -a[i];
            }
        }
    }


    public static void main(String[] args) {
        // 输出应为 1 100 2 200 3 300 4 400 5 500 6 600 7 700 8 800 9 900 10 1000
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        int[] b = Arrays.copyOf(a, a.length); // 保留一个副本用于第二次测试

        System.out.println("原始数组 (Original):      " + Arrays.toString(a));

        riffle(a);
        System.out.print("riffle() 结果:      ");
        for (int val : a) { System.out.print(val + " "); }
        System.out.println();

        // --- 测试 riffleInPlace ---
        System.out.println("原始副本 (Original copy): " + Arrays.toString(b));
        riffleInPlace(b);
        System.out.print("riffleInPlace() 结果: ");
        for (int val : b) { System.out.print(val + " "); }
        System.out.println();

        // 描述中的示例
        int[] c = {1, 2, 3, 4, 5, 6};
        System.out.println("原始数组 (Original):      " + Arrays.toString(c));
        riffleInPlace(c);
        System.out.print("riffleInPlace() 结果: "); // 应为 1 4 2 5 3 6
        for (int val : c) { System.out.print(val + " "); }
        System.out.println();
    }
}