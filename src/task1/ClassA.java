package task1;

public class ClassA implements InterfaceA{
    private int a;
    private int b;

    @Override
    public void sayHello() {
        System.out.println("hello OP");

    }

    @Override
    public void geta() {
        System.out.println(a);

    }

    @Override
    public void getb() {
        System.out.println(b);

    }

    @Override
    public void printsum() {
        System.out.println(a+b);

    }

    @Override
    public int mult() {
        return a*b;
    }

    @Override
    public void setAB() {
        a=6;
        b=5;

    }

}
