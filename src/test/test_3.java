package test;

/**
 * Created by fff on 17-6-2.
 *
 * 疯狂Java讲义第三章练习题
 */
public class test_3 {

    public static void main(String[] args) {

        //使用8种基本数据类型声明多个变量，并使用不同的方式为8种基本类型的变量赋值

        byte a = -56;
        short b = 1;
        int c = 128888;
        long d = 99999999999L;
        float e = (float) 5.6;
        double f = 1.844441841;
        char g = '趴';


        //在数值型的变量之间进行类型转换，包括低位向高位的自动转换、高位向地位的强制转换

        byte bValue = (byte) c;
        System.out.println(bValue); //120

        int iValue = (int) a;
        System.out.println(iValue); //-56

        short sValue = (short) c;
        System.out.println(sValue); //-2184

        int iValue2 = (int) b;
        System.out.println(iValue2);    //1

        byte bValue2 = (byte) d;
        System.out.println(bValue2);  //-1

        short sValue2 = (short) d;
        System.out.println(sValue2);  //-6145



        //使用数学运算符、逻辑运算符编写40个表达式，先自行计算各表达式的值，然后通过程序输出这些表达是的值进行对比。

        
    }

}
