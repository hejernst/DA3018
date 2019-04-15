import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Stack hej = new Stack();
        hej.push(5);
        System.out.println(hej.pop());
        System.out.println(Arrays.toString(hej.getStack()));
        //double[] a = new double[10];
        //System.out.println(Arrays.toString(a));
    }
}
