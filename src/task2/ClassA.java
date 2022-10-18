package task2;

import java.util.Arrays;
import java.util.Random;

public class ClassA implements InterfaceA{
    private static final Random random=new Random();
    private int a;
    private int b;
    private  int[] m=new int[12];
    @Override
    public void setAB() {
        a=random.nextInt(15)+10;
        b=random.nextInt(15)+10;

    }

    @Override
    public int[] getAB() {
        int[]res={a,b};
        return res;
    }

    @Override
    public char[] getABC() {
        char[]res={(char)a,(char)b};
        return res;
    }

    @Override
    public void setM() {
        for (int i = 0; i < m.length ; i++) {
            m[i]=random.nextInt(71)-11;
        }

    }

    @Override
    public void getEven() {
        int[] res=(Arrays.stream(m).filter(i->i%2==0)).toArray();
        for (int re : res) {
            System.out.println(re);
        }

    }

    @Override
    public void sumPositive() {
        System.out.println(Arrays.stream(m).filter(i -> i >=0).sum());
    }

    @Override
    public void minPositive() {
        int min = Arrays.stream(m).filter(i -> i >= 0).min().orElse(0);
    }
}
