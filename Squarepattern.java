// loop inside loop is called as NESTED LOOP

import java.util.*;
public class Squarepattern {
    public static void main(String[] args){
        
        System.out.println("Enter the value of X and Y: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        //outer loop    rows
        for(int i=1; i<=x; i++){
            
            //inner loop    colmuns
            for(int j=1; j<=y; j++){
            System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
