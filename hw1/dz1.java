import java.util.Scanner;

public class dz1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String determination = "";
        do {
            int x1;
            int x2;
            int x = 0;
            char operation;
            System.out.print("Enter numbers");
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            System.out.print("Enter operation");
            operation = sc.next().charAt(0);
            switch (operation) {
                case '+':
                    x = x1 + x2;
                    break;
                case '-':
                    x = x1 - x2;
                    break;
                case '*':
                    x = x1 * x2;
                    break;
                case '/':
                    x = x1 / x2;
                    break;
            }
            System.out.print("result " + x);
            System.out.print("    again?");
            determination = sc.next();
        } while (!determination.equals("n"));
    }
}
