package task1;

import java.util.Random;
import java.util.Scanner;

public class ClassB implements InterfaceB{
    private int a=33;
    private double b=9.7;
    private char s='#';
    @Override
    public void prints() {
        System.out.println(s);

    }

    @Override
    public void printb() {
        System.out.println(b);

    }

    @Override
    public void min() {
        System.out.println(a-b);

    }

    @Override
    public double div() {
        return a/b;
    }

    @Override
    public void setRandom() {
        Random r = new Random();
         s = (char)(r.nextInt(26) + 'a');
         a=r.nextInt();
         b= r.nextDouble();


    }

    @Override
    public void setA() {
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();

    }

    @Override
    public void print10B() {
        System.out.println(b+10);

    }
}
