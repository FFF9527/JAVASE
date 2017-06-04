package cycle;

/**
 * Created by fff on 17-6-4.
 *
 * 结束循环
 *
 */
public class _break {
    public static void main (String[] args)
    {
        //外层循环，outer作为标识符
        outer:
        for (int i=1; i<=10; i++)
        {
            //内层循环
            for (int j=0; j<8; j++)
            {
                System.out.println("i的值为："+ i + "，" + "j的值为："+ j);
                if (i==8)
                {
                    //跳出outer标签所标识的循环.
                    break;
                }
            }
        }
    }
}
