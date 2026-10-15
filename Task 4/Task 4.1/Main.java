import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        MinStack<Integer> stack = new MinStackImpl();

        while (scanner.hasNext()) {
            String command = scanner.next();

            switch (command) {
                case "push":
                    stack.push(scanner.nextInt());
                    break;

                case "pop":
                    stack.pop();
                    break;

                case "top":
                    System.out.println(stack.top());
                    break;

                case "min":
                    System.out.println(stack.min());
                    break;
            }
        }

        scanner.close();
    }
}

//That was simpler than I thought