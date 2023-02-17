package Algorithm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Area of the Solar : ");
        List<Integer> finalArray = new ArrayList<Integer>();
        int initialArea = scanner.nextInt();
        int b = 0;
        b=(int) Math.sqrt(initialArea);
        int remainingArea =0;
        for (int i = 0;;i++){
            finalArray.add(b);
            if(remainingArea>0){
                remainingArea = initialArea - (b*b);
                b = (int) Math.sqrt(remainingArea);
            }else {
                break;
            }
        }
        Iterator itr = finalArray.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}