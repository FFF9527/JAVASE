package Array;

/**
 * Created by fff on 17-6-4.
 */
public class ArrayDemo {
    public static void main (String[] args)
    {
        Person[] students;
        students = new Person[2];
        Person lei = new Person();
        lei.age = 20;
        lei.height = 158;

        Person lee = new Person();
        lee.age = 21;
        lee.height = 170;

        students[0] = lei;
        students[1] = lee;

        lee.info();
        lei.info();

    }
}

class Person {
    public int age;
    public int height;

    public void info ()
    {
        System.out.println("我的年龄是：" + age + "，我的身高是：" + height);
    }
}



