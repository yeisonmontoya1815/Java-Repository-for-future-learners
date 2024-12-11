class A {
    int a;
    int b;
}

interface B{
public static final int c=23;
}

interface C{
    public static final int d=23;
    void add();
}


class D extends A implements B,C
{
    public void add()
    {
        System.out.println("We will learn later");
    }
}