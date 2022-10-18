package task1;

import java.util.Scanner;

public class ClassC implements InterfaceC{
    private  int a=10;
    private int b=9;
    private char s='#';
    private char h='@';
    @Override
    public void printInt() {
        System.out.println(a);
        System.out.println(b);


    }

    @Override
    public void printChar() {
        System.out.println(s);
        System.out.println(h);

    }

    @Override
    public void PrintSumDivisionMultiplication() {
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

    }

    @Override
    public void setA() {
        Scanner scanner=new Scanner(System.in);
        a=scanner.nextInt();

    }

    @Override
    public void setB() {
        Scanner scanner=new Scanner(System.in);
        b=scanner.nextInt();

    }

    @Override
    public void SetChar() {
        Scanner scanner=new Scanner(System.in);
        h= scanner.next().charAt(0);
        s=scanner.next().charAt(0);

    }
}
