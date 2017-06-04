package cycle;

/**
 * Created by fff on 17-6-4.
 *
 * do
 * {
 *     statement;
 *     [iteration_statement]
 * }while (test_expression)
 *
 */
public class _do_while {
    public static void main (String[] args)
    {
        int a = 1;
        do
        {
            System.out.println(a);
            a++;
        }while (a<10);
        System.out.println("循环结束");
    }
}
