package cycle;

/**
 * Created by fff on 17-6-4.
 *
 * 9*9乘法表
 */
public class demo {
    public static void main (String[] args)
    {
        for (int i = 1; i <= 9; i ++) {
            for (int j = 1; j <= i; j ++) {
                System.out.print(j + "x" + i + "=" + j * i + "\t");
            }
            System.out.println();
        }
    }
}
