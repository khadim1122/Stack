import java.util.*;

public class New{

    static int itm, top = -1, size, stack[], choice;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enetr Size of Stack:");
        New.size = New.scan.nextInt();
        New.stack = new int[size];
        while (true) {
            System.out.println("1:Push");
            System.out.println("2:Pop");
            System.out.println("3:Display");
            System.out.println("4:Quit");

            System.out.print("Eneter your choice:");
            New.choice = New.scan.nextInt();

            switch (choice) {
                case 1:
                    New.Push();
                    break;
                case 2:
                    New.Pop();
                    break;
                case 3:
                    New.Display();
                    break;
                case 4:
                    New.Exit(1);
                default:
                    System.out.print("Invalid Choice\t");
            }
        }

    }

    private static void Exit(int i) {
        // TODO for ending Program;;;

    }

    static void Push() {
        if (top == size-1) {
            System.out.println("Stack overflow");
        } else {
            ++top;
            System.out.println("Push an element:");
            New.itm = New.scan.nextInt();
            New.stack[top] = New.itm;
        }
    }

    static void Pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {

            New.itm = New.stack[top];
            System.out.println("poped Element:" + New.itm);
            top--;
        }
    }

    static void Display() {
        if (top == -1) {
            System.out.println("Stack empty");
        } else {

            System.out.println("Elements in stack are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(New.stack[i]);
            }
        }
    }
}