package Array;

/**
 * Created by fff on 17-6-4.
 *
 * Java支持两种语法格式定义数组：
 * type[] arrayName; (推荐，更好的可读性)
 * type arrayName[];
 *
 * 定义数组时不能指定数组的长度。
 * 不要同时使用静态初始化和动态初始化，也就是说，不要进行数组初始化是，既指定数组的长度，也为每个数组元素分配初始值.
 *
 *
 * 静态初始化的语法格式：
 * arrayName = new type[] {element1,element2,element3,element4,element5}
 * 简化版：type[] arrayName = {element1,element2,element3,element4,element5}
 *
 * 动态初始化的语法格式：
 * arrayName = new type[length];
 *
 */
public class array {
    public static void main (String[] args) {

        //定义一个int数组类型的变量，变量名为intArr
        int[] intArr;
        //使用静态初始化，初始化数组时只指定数组元素的初始值，不能指定数组长度
        intArr = new int[] {5, 6, 8, 20};


        //定义一个Object数组类型的变量，变量名为objArr；
        Object[] objArr;
        //使用静态初始化，初始化数组时数组元素的类型是定义数组时所指定的数组元素类型的子类
        objArr = new String[] {"Java", "你爹我"};
        Object[] objArr2;
        //使用静态初始化
        objArr2 = new Object[] {"Java", "你爹我"};

        //输出objArr数组的第二个元素，将输出字符串"你爹我"
        System.out.println(objArr[1]);

        //为objArr2的第一个数组元素赋值
        objArr2[0] = "Spring";



        //遍历数组
        for (int i = 0; i < objArr.length; i++)
        {
            System.out.println(objArr[i]);
        }


        int[] iArr;
        iArr = new int[8];
        for (int i = 0; i < iArr.length; i++)
        {
            iArr[i] = i + 10;
        }
    }
}
