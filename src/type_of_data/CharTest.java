package type_of_data;

/**
 * Created by fff on 17-6-1.
 */
public class CharTest {
    public static void main(String[] args)
    {
        //直接指定单个字符作为字符值。
        char aChar = 'a';

        //使用转义字符来作为字符值。
        char enterChar = '\r';

        //使用Unicode编码值来指定字符值
        char ch = '\u9999';

        //将输出一个"香"字符
        System.out.println(ch);

        //定义一个”疯“字符值
        char zhong = '疯';

        //直接将一个char变量当成int类型变量
        char c = 97;
        System.out.println(c);

        //下面代码定义了一个s变量，它是一个字符串实例的引用，它是一个引用类型的变量
        String s = "沧海月明珠有泪，蓝田玉暖日生烟.";
    }
}
