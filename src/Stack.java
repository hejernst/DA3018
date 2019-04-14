import java.util.ArrayList;
import java.util.List;

public class Stack {

    private int counter = 0;
    private double[] stack = new double[100];


    public boolean isEmpty() {
        return counter == 0;

    }

    public boolean push(double elem) {
        if (counter < stack.length) {
            stack[counter] = elem;
            counter++;
            return true;
        }
        return false;
    }

    public double pop() {
        if (counter > 0) {
            double lastElem = stack[counter];
            stack[counter-1] = 0.0;
            counter--;
            return lastElem;
        }
        return stack[counter];
    }

    public int getCounter() {
        return counter;
    }

    public double[] getStack() {
        return stack;
    }
}
