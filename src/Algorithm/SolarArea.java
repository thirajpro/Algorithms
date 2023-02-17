package Algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SolarArea {
    public void AreaSolver(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Area of the Solar : ");
        List<Integer> finalArray = new ArrayList<Integer>();
        int initialArea = scanner.nextInt();
        int b = 0;
        b=(int) Math.sqrt(initialArea);
        for (int i = 0;;i++){
            finalArray.add(b);
            int remainingArea = initialArea - (b*b);
            b = (int) Math.sqrt(remainingArea);
            if(remainingArea==0){
                break;
            }else {
                continue;
            }
        }
        System.out.println(finalArray);

    }
}
