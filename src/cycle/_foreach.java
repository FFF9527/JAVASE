package cycle;

/**
 * Created by fff on 17-6-4.
 *
 * for (type variableName : array | collection)
 * {
 *     //variableName 自动迭代访问每个元素...
 * }
 *
 */
public class _foreach {
    public static void main (String[] args)
    {
        String[] fucks = {"啪","啪啪","啪啪啪","啪啪啪啪"};
        //使用foreach循环遍历数组元素
        for (String fuck : fucks)
        {
            System.out.println(fuck);
        }
    }
}
