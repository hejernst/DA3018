import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Stack hej = new Stack();
        hej.push(5);
        hej.pop();
        System.out.println(hej.isEmpty());
        System.out.println(hej.getCounter());
        System.out.println(Arrays.toString(hej.getStack()));
        //double[] a = new double[10];
        //System.out.println(Arrays.toString(a));
    }
}
