package cycle;

/**
 * Created by fff on 17-6-4.
 *
 * continue
 * 跳过该次循环，执行下一次循环
 *
 */
public class _continue {
    public static void main(String[] args)
    {
         //一个简单的for循环
        for (int i = 0; i < 3; i++)
        {
            System.out.println("i的值是" + i);
            if (i == 1)
            {
                //忽略本次循环的剩下语句
                continue;
            }
            System.out.println("contiune后的输出语句");
        }
    }
}
