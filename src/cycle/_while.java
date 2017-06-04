package cycle;

/**
 * Created by fff on 17-6-4.
 *
 * while(test_expression)
 * {
 *     statement;
 *     [iteration_statement]
 * }
 *
 */
public class _while {
    public static void main (String[] args)
    {
        int a = 0;
        while (a < 10)
        {
            System.out.println(a);
            a++;
        }
        System.out.println(a);
    }
}
