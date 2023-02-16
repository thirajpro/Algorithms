package Algorithm;

import java.util.Scanner;

public class SolarArea {
    public void AreaSolver(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Area of the Solar : ");
        int area = scanner.nextInt();
        int a = (int) Math.sqrt(area);
        System.out.println(Math.ceil(a));

    }
}
