import java.util.Scanner;

public class Print1ToA {
    public static void printNum(int A) {
        if (A>1){
            printNum(A-1);
        }
        System.out.print(A+" ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        printNum(A);
    }
}
