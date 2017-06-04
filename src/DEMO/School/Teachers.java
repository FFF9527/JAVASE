package DEMO.School;

/**
 * Created by fff on 17-6-2.
 *
 * 这是一个教师类
 *
 */
public class Teachers {
    public static void main(String[] args)
    {
        Teacher t1 = new Teacher();
        t1.setName("雷楼母");
        t1.setAge(30);
        t1.setMajor("生理");

        t1.show();
    }
}


class Teacher {
    private String name;    //姓名
    private int age;    //年龄
    public String major;    //专业

    public Teacher(){}  //空参构造

    public Teacher(String name,int age,String major)    //带参构造
    {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public void setName(String name)    //设置姓名
    {
        this.name = name;
    }

    public String getName()       //获取姓名
    {
        return name;
    }

    public void setAge(int age)     //设置年龄
    {
        this.age = age;
    }

    public int getAge()     //获取年龄
    {
        return age;
    }

    public void setMajor(String major)  //设置专业
    {
        this.major = major;
    }

    public String getMajor()       //获取专业
    {
        return major;
    }

    public void show()
    {
        System.out.println("老师的姓名是："+ name + "，老师的年龄是：" + age + "，老师教的学科是：" + major);
    }
}