package Algorithm;

import java.util.Scanner;

public class WarmUp {
    public void SolveMeFirst(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
         int x = scanner.nextInt();
        System.out.print("Enter b: ");
        int y = scanner.nextInt();
        System.out.println(x + y);
    }
    public static void main(String[] args) {
        WarmUp warm = new WarmUp();
        warm.SolveMeFirst();
    }
}
