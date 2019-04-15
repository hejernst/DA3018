import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        // Creating an empty Stack
        Stack stack = new Stack();
        System.out.println("Input integer or operator");
        while(true) {
            Scanner sc = new Scanner(System.in);

            String input = sc.nextLine();
            if(input.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            }
            else if(input.equals("-")) {
                stack.push((-1)*stack.pop() + stack.pop());
            }
            else if(input.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            }
            else if(input.equals("/")) {
                stack.push((1/stack.pop()) * stack.pop());
            }
            else if(input.equals("=")) {
                break;
            }
            else {
                stack.push(Double.valueOf(input));
            }

        }
        double answer;
        answer = stack.pop();
        System.out.println(answer);

    }
}
